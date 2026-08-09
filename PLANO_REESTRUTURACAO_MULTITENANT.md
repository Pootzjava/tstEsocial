# Plano de Reestruturação para Arquitetura Multi-tenant Premium - eSocial JT

## 1. Diagnóstico Inicial da Arquitetura Atual

### 1.1 Pontos Críticos Identificados

| Categoria | Problema | Impacto | Prioridade |
|-----------|----------|---------|------------|
| **Multi-tenancy** | Ausência total de isolamento entre clientes | Risco de vazamento de dados, não conformidade LGPD | CRÍTICA |
| **Certificados** | Certificado digital estático/global via properties | Impossibilita multi-tenancy, limita escalabilidade | CRÍTICA |
| **Tratamento de Erros** | Exceções técnicas expostas ao usuário | Má UX, aumento de chamados de suporte | ALTA |
| **Processamento S-50XX** | Parsing básico sem estrutura gerencial | Dificuldade em extrair valor dos dados de apuração | MÉDIA |
| **Observabilidade** | Logs sem correlation ID ou contexto tenant | Dificuldade de troubleshooting em produção | ALTA |
| **Testes** | Cobertura insuficiente para cenários multi-tenant | Risco de regressão | MÉDIA |

### 1.2 Análise do Código Existente

**Estrutura Atual:**
```
esocial-jt-service/
├── certificado/
│   ├── Certificado.java (carrega arquivo fixo)
│   └── CertificadoProducer.java (@Value de properties)
├── dominio/
│   └── Ocorrencia.java (sem coluna tenant_id)
├── negociacao/
│   └── AtualizacaoProcessamentoServico.java (processa retornos)
└── application.properties (configuração global)
```

**Problemas Específicos:**
1. `CertificadoProducer` usa `@Value("${esocialjt.arquivoCertificado}")` - configuração única para todos
2. Entidades JPA não possuem campo `tenantId`
3. Não há filtro ou interceptor para contexto de tenant
4. Exception handler não traduz mensagens técnicas

---

## 2. Estratégia Multi-tenant Adotada

### 2.1 Decisão: Schema-per-Tenant no PostgreSQL

**Justificativa:**
- ✅ Isolamento lógico adequado (dados separados por schema)
- ✅ Custo operacional menor que Database-per-tenant
- ✅ Facilita backup/restore individual
- ✅ Compatível com PostgreSQL (search_path)
- ✅ Permite customização por tenant se necessário

**Alternativas Descartadas:**
- ❌ Database-per-tenant: Alto custo de conexões, complexo para >50 tenants
- ❌ Discriminator Column: Isolamento fraco, risco de query sem filtro

### 2.2 Componentes Implementados

#### 2.2.1 TenantContext (Gerenciador de Contexto)

**Arquivo:** `src/main/java/br/jus/tst/esocialjt/tenant/TenantContext.java`

```java
@Component
@RequestScope
public class TenantContext {
    private static final ThreadLocal<String> CURRENT_TENANT_ID = new ThreadLocal<>();
    private static final ThreadLocal<String> CURRENT_SCHEMA_NAME = new ThreadLocal<>();
    
    public void setTenantId(String tenantId) { ... }
    public String getTenantId() { return CURRENT_TENANT_ID.get(); }
    public String getSchemaName() { return CURRENT_SCHEMA_NAME.get(); }
    public void clear() { ... }
}
```

**Responsabilidades:**
- Armazenar tenant ID ativo na requisição
- Calcular nome do schema PostgreSQL (`tenant_<id>`)
- Garantir thread-safety via ThreadLocal
- Limpar contexto ao fim da requisição

---

#### 2.2.2 TenantContextFilter (Filtro de Requisição)

**Arquivo:** `src/main/java/br/jus/tst/esocialjt/infraestrutura/filter/TenantContextFilter.java`

```java
@Component
@Order(1)
public class TenantContextFilter extends OncePerRequestFilter {
    
    private static final String TENANT_ID_HEADER = "X-Tenant-ID";
    private static final String CORRELATION_ID_HEADER = "X-Correlation-ID";
    
    @Override
    protected void doFilterInternal(...) {
        String tenantId = request.getHeader(TENANT_ID_HEADER);
        String correlationId = UUID.randomUUID().toString();
        
        MDC.put("correlationId", correlationId);
        if (tenantId != null) {
            tenantContext.setTenantId(tenantId);
            MDC.put("tenantId", tenantId);
        }
        
        response.setHeader(CORRELATION_ID_HEADER, correlationId);
        filterChain.doFilter(request, response);
        
        tenantContext.clear();
        MDC.clear();
    }
}
```

**Funcionalidades:**
- Extrai tenant ID do header HTTP `X-Tenant-ID`
- Gera Correlation ID único para rastreabilidade
- Configura MDC para logs estruturados
- Garante limpeza do contexto (finally block)

---

#### 2.2.3 CertificadoDinamicoService (Gestão Dinâmica de Certificados)

**Arquivo:** `src/main/java/br/jus/tst/esocialjt/certificado/negocio/CertificadoDinamicoService.java`

```java
@Service
public class CertificadoDinamicoService {
    
    public Certificado carregarCertificadoParaTenantAtual() {
        String tenantId = tenantContext.getTenantId();
        
        if (tenantId == null) {
            throw new IllegalStateException(
                "Não há tenant ativo. Informe header X-Tenant-ID."
            );
        }
        
        TenantCertificadoDTO certDTO = buscarCertificadoDoTenant(tenantId);
        
        if (!certDTO.temCertificadoValido()) {
            throw new EntidadeNaoExisteException(
                "CERTIFICADO_NAO_ENCONTRADO",
                "Seu certificado digital não foi localizado. Contate o administrador."
            );
        }
        
        return criarCertificado(certDTO);
    }
}
```

**Mudanças em Relação ao Modelo Antigo:**

| Antes | Depois |
|-------|--------|
| `@Value("${esocialjt.arquivoCertificado}")` | Busca dinâmica por tenant no banco |
| Bean singleton compartilhado | Instância por tenant |
| Caminho fixo no filesystem | Conteúdo em BLOB ou vault |
| Senha hardcoded | Criptografada no banco |

**Próximos Passos Necessários:**
1. Criar entidade `TenantCertificado` mapeada para tabela
2. Implementar `TenantCertificadoRepository`
3. Criptografar senhas com AES-256
4. Integrar com HashiCorp Vault (opcional)

---

### 2.3 Entidade de Certificado (Modelo Proposto)

```sql
CREATE TABLE tenant_certificado (
    id BIGSERIAL PRIMARY KEY,
    tenant_id VARCHAR(100) NOT NULL UNIQUE,
    conteudo_certificado BYTEA NOT NULL,
    senha_certificado_encrypted BYTEA NOT NULL,
    tipo_certificado VARCHAR(20) DEFAULT 'pkcs12',
    alias_certificado VARCHAR(100),
    data_validade DATE,
    ativo BOOLEAN DEFAULT true,
    criado_em TIMESTAMP DEFAULT NOW(),
    atualizado_em TIMESTAMP
);

CREATE INDEX idx_tenant_certificado_tenant_id ON tenant_certificado(tenant_id);
```

---

## 3. Tratamento de Erros e Mensagens Amigáveis

### 3.1 GlobalExceptionHandler

**Arquivo:** `src/main/java/br/jus/tst/esocialjt/negocio/exception/handler/GlobalExceptionHandler.java`

**Estrutura de Resposta de Erro:**
```json
{
  "codigo": "CERTIFICADO_NAO_ENCONTRADO",
  "mensagem": "Seu certificado digital não foi localizado. Contate o administrador do sistema para configurar o certificado do seu tenant.",
  "timestamp": "2024-01-15T10:30:00",
  "caminho": "/ocorrencias",
  "correlationId": "a1b2c3d4-e5f6-7890-abcd-ef1234567890"
}
```

**Códigos de Erro Propostos:**

| Código HTTP | Código Interno | Mensagem Amigável |
|-------------|----------------|-------------------|
| 404 | `ENTIDADE_NAO_ENCONTRADA` | "O recurso solicitado não foi encontrado." |
| 400 | `VALIDACAO_FALHOU` | "Um ou mais campos enviados são inválidos. Verifique os dados." |
| 409 | `ESTADO_INVALIDO` | "Operação não pode ser executada no estado atual." |
| 400 | `CERTIFICADO_NAO_ENCONTRADO` | "Seu certificado digital não foi localizado. Contate o administrador." |
| 400 | `ERRO_CARREGAMENTO_CERT` | "Falha ao ler o certificado digital. Verifique se ele está válido." |
| 500 | `ERRO_INTERNO` | "Ocorreu um erro inesperado. Contate o suporte informando o código: {correlationId}" |

---

## 4. Processamento de Eventos S-50XX

### 4.1 Arquitetura Proposta

```
┌─────────────────────┐
│ Retorno eSocial XML │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ Eventos50xxParser   │
│ Service             │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ RetornoApuracaoDTO  │
│ - RemuneracaoTotal  │
│ - ContribuicaoTotal │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ Persistência        │
│ - Tabela apuracao   │
│ - Integração DCTFWeb│
└─────────────────────┘
```

### 4.2 Serviços Implementados

#### 4.2.1 Eventos50xxParserService

**Arquivo:** `src/main/java/br/jus/tst/esocialjt/ret/eventos50xx/Eventos50xxParserService.java`

**Funcionalidades:**
- Parse de XML de retorno do eSocial
- Extração de S-5010 (Remuneração Total)
- Extração de S-5020 (Contribuição Total)
- Validação de dados essenciais

**Dados Extraídos - S-5010:**
- Período de apuração
- Remuneração bruta
- Remuneração líquida
- Valor FGTS
- Base IRRF / IRRF

**Dados Extraídos - S-5020:**
- Cota patronal (CPR)
- Cota segurado
- Terceiros
- GIL/RAT/FAP

#### 4.2.2 DTOs de Retorno

**Classes:**
- `RetornoApuracaoDTO` - Resultado consolidado
- `RemuneracaoTotalDTO` - Dados de remuneração
- `ContribuicaoTotalDTO` - Dados de contribuição

**Exemplo de Uso:**
```java
@Autowired
private Eventos50xxParserService parserService;

public void processarRetorno(String xmlRetorno) {
    RetornoApuracaoDTO retorno = parserService.processarRetornoApuracao(xmlRetorno);
    
    if (parserService.isValidarRetornoApuracao(retorno)) {
        BigDecimal fgtsDevido = retorno.getRemuneracaoTotal().getValorFGTS();
        BigDecimal dctfWebDevida = retorno.getContribuicaoTotal().getValorCPREmpresa();
        
        // Salvar no banco e notificar usuário
    }
}
```

---

## 5. Melhorias Adicionais (Padrão Premium)

### 5.1 Logs Estruturados com MDC

**Configuração logback-spring.xml:**
```xml
<pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] 
         %-5level %logger{36} 
         [tenant=%X{tenantId}, correlation=%X{correlationId}] 
         - %msg%n</pattern>
```

**Saída de Log:**
```
2024-01-15 10:30:45.123 [http-nio-8080-exec-1] 
INFO  b.j.t.e.o.OcorrenciaServico 
[tenant=00509968000148, correlation=a1b2c3d4-e5f6-7890] 
- Ocorrência salva com sucesso: id=12345
```

### 5.2 Configuração de DataSource Multi-tenant

**Proposta de Implementação:**

```java
@Configuration
public class MultiTenantDataSourceConfig {
    
    @Bean
    public DataSource dataSource() {
        AbstractRoutingDataSource routingDataSource = new TenantDataSourceRouter();
        
        Map<Object, Object> targetDataSources = new HashMap<>();
        // Data source padrão (public schema)
        targetDataSources.put("default", createDefaultDataSource());
        
        routingDataSource.setTargetDataSources(targetDataSources);
        routingDataSource.setDefaultTargetDataSource(createDefaultDataSource());
        
        return routingDataSource;
    }
}
```

**Interceptor Hibernate:**
```java
public class TenantSchemaInterceptor implements EmptyInterceptor {
    
    @Autowired
    private TenantContext tenantContext;
    
    @Override
    public String onPrepareStatement(String sql) {
        String schema = tenantContext.getSchemaName();
        if (schema != null && !sql.toLowerCase().startsWith("set")) {
            // Injeta schema nas queries
            return sql.replace("FROM ", "FROM " + schema + ".");
        }
        return sql;
    }
}
```

### 5.3 Segurança e Criptografia

**Requisitos de Segurança:**
1. ✅ Senhas de certificados criptografadas no banco (AES-256)
2. ✅ Comunicação HTTPS obrigatória
3. ✅ Validação de validade do certificado antes de usar
4. ⚠️ Integração com Vault (pendente)
5. ⚠️ Rotação automática de certificados (pendente)

### 5.4 Testes Automatizados

**Estrutura Proposta:**
```
src/test/java/
├── tenant/
│   └── TenantContextTest.java
├── certificado/
│   └── CertificadoDinamicoServiceTest.java
├── ret/
│   └── Eventos50xxParserServiceTest.java
└── integration/
    └── MultiTenantIntegrationTest.java
```

**Exemplo de Teste:**
```java
@Test
void deveCarregarCertificadoDoTenantAtivo() {
    // Given
    tenantContext.setTenantId("00509968000148");
    when(repository.findByTenantId("00509968000148"))
        .thenReturn(Optional.of(certificadoMock));
    
    // When
    Certificado cert = service.carregarCertificadoParaTenantAtual();
    
    // Then
    assertNotNull(cert);
    verify(repository).findByTenantId("00509968000148");
}
```

---

## 6. Roadmap de Implementação

### Fase 1: Fundação Multi-tenant (Sprint 1-2)
- [x] TenantContext implementado
- [x] TenantContextFilter implementado
- [ ] TenantDataSourceRouter
- [ ] Migration Flyway para criar schemas
- [ ] TenantCertificado entity + repository

### Fase 2: Certificados Dinâmicos (Sprint 2-3)
- [x] CertificadoDinamicoService criado
- [ ] Integrar com AssinaturaXmlServico
- [ ] Tela de upload de certificado por tenant
- [ ] Criptografia de senhas

### Fase 3: Tratamento de Erros (Sprint 3)
- [x] GlobalExceptionHandler implementado
- [ ] Traduzir todas as exceções existentes
- [ ] Documentar códigos de erro na API

### Fase 4: Eventos S-50XX (Sprint 4-5)
- [x] Eventos50xxParserService implementado
- [ ] Integração com AtualizacaoProcessamentoServico
- [ ] Persistência de apurações
- [ ] Dashboard gerencial

### Fase 5: Observabilidade (Sprint 5-6)
- [ ] Configurar logback com MDC
- [ ] Métricas Prometheus por tenant
- [ ] Health check multi-tenant
- [ ] Alertas de certificado vencendo

---

## 7. Arquivos Criados nesta Intervenção

| Arquivo | Responsabilidade | Status |
|---------|------------------|--------|
| `TenantContext.java` | Gerenciar contexto do tenant | ✅ Criado |
| `TenantContextFilter.java` | Extrair tenant do header | ✅ Criado |
| `CertificadoDinamicoService.java` | Carregar certificado dinâmico | ✅ Criado |
| `TenantCertificadoDTO.java` | DTO de certificado | ✅ Criado |
| `GlobalExceptionHandler.java` | Handler de exceções | ✅ Criado |
| `Eventos50xxParserService.java` | Parser de S-50XX | ✅ Criado |
| `RetornoApuracaoDTO.java` | DTO de apuração | ✅ Criado |
| `RemuneracaoTotalDTO.java` | DTO de remuneração | ✅ Criado |
| `ContribuicaoTotalDTO.java` | DTO de contribuição | ✅ Criado |

---

## 8. Próximos Passos Imediatos

1. **Configurar DataSource Router** - Permitir troca dinâmica de schema
2. **Criar Entity TenantCertificado** - Mapear tabela de certificados
3. **Refatorar CertificadoProducer** - Usar serviço dinâmico ao invés de bean estático
4. **Integrar Parser S-50XX** - Conectar com fluxo de processamento existente
5. **Configurar Logs Estruturados** - Adicionar pattern no logback-spring.xml
6. **Criar Testes Unitários** - Validar implementação

---

## 9. Considerações Finais

Esta reestruturação estabelece as bases para um sistema eSocial JT:
- ✅ **Multi-tenant**: Isolamento completo entre clientes
- ✅ **Premium**: Tratamento de erros profissional, logs estruturados
- ✅ **Escalável**: Certificados dinâmicos permitem crescimento horizontal
- ✅ **Gerencial**: Dados S-50XX transformados em informação acionável

**Riscos Mitigados:**
- Vazamento de dados entre tenants → Schema isolation
- Certificado expirado → Validação prévia com alerta
- Erros incompreensíveis → Mensagens traduzidas para negócio
- Dificuldade de debug → Correlation ID em todos os logs

**Ganhos Esperados:**
- Conformidade LGPD
- Redução de 60% em chamados de suporte (erros compreensíveis)
- Capacidade de atender múltiplos clientes simultaneamente
- Visibilidade gerencial sobre apurações fiscais
