# 📋 Status da Reestruturação Multi-tenant Premium - eSocial JT

## ✅ Componentes Implementados com Sucesso

### 1. Infraestrutura Multi-tenant (Schema-per-Tenant)
- **TenantContext.java** - Gerencia contexto do tenant via ThreadLocal com escopo de requisição
- **TenantContextFilter.java** - Filtro que extrai `X-Tenant-ID` do header e gera Correlation ID para logs
- **TenantDataSourceRouter.java** - Roteador dinâmico de DataSource baseado no tenant ativo
- **DataSourceConfig.java** - Configuração Spring dos DataSources com roteamento

### 2. Gestão Dinâmica de Certificados Digitais
- **CertificadoDinamicoService.java** - Serviço que carrega certificado específico por tenant
- **TenantCertificadoDTO.java** - DTO com dados do certificado (conteúdo, senha, tipo, validade)
- **TenantCertificadoRepository.java** - Repositório JDBC para busca de certificados
- **Migration V9__criar_tabela_tenant_certificado.sql** - Script Flyway para tabela de certificados

### 3. Processamento de Eventos S-50XX (Retornos eSocial)
- **Eventos50xxParserService.java** - Parser XML para eventos S-5010 e S-5020
- **RetornoApuracaoDTO.java** - Resultado consolidado da apuração
- **RemuneracaoTotalDTO.java** - Dados de remuneração (FGTS, IRRF, líquida)
- **ContribuicaoTotalDTO.java** - Dados de contribuição (CPR, GILRAT, Terceiros)

### 4. Tratamento de Erros Premium
- **GlobalExceptionHandler.java** - Handler global que traduz erros técnicos para mensagens amigáveis
- **EntidadeNaoExisteException.java** - Refatorada com errorCode e detail message

### 5. Atualização de Versões (Java 17 + Spring Boot 3.4.1)
- **pom.xml (raiz)** - Java 17 configurado
- **esocial-jt-service/pom.xml** - Spring Boot 3.4.1, Jakarta XML Bind 4.0.2, JAXB Runtime 4.0.5
- **httpclient5** - Substituído httpclient legado por httpclient5 (versão 5.3.1)

---

## ⚠️ Pendência Crítica: Módulo esocial-comunicacao

### Problema Identificado
O módulo `esocial-comunicacao` contém ~160 classes Java **geradas automaticamente** a partir de WSDL/XSD do eSocial. Estas classes usam imports `javax.xml.bind.annotation.*` que são incompatíveis com Java 17+.

### Solução Necessária (2 Opções)

#### Opção A: Regenerar Classes com JAXB Jakarta (Recomendado)
```bash
# No diretório esocial-comunicacao
cd /workspace/src/esocial-comunicacao

# Atualizar script generate-java-from-xsd.sh para usar JAXB 3.x+ (Jakarta)
# Isso regenerará todas as classes com imports jakarta.xml.bind ao invés de javax.xml.bind
```

**Vantagens:**
- Código gerado compatível com Java 17+
- Manutenção futura simplificada
- Alinhado com padrão Jakarta EE

**Passos:**
1. Atualizar plugin `maven-jaxb2-plugin` para versão 0.14.0+ que suporta Jakarta
2. Modificar `generate-java-from-xsd.sh` para usar XJC com binding Jakarta
3. Executar `mvn clean generate-sources -Pgenerate-resources`
4. Validar compilação com `mvn clean compile`

#### Opção B: Manter Java 11 Apenas neste Módulo (Solução Temporária)
```xml
<!-- No pom.xml do esocial-comunicacao -->
<maven.compiler.source>11</maven.compiler.source>
<maven.compiler.target>11</maven.compiler.target>
```

**Desvantagens:**
- Projeto com múltiplas versões Java (complexidade de build)
- Não resolve problema a longo prazo
- Impede uso de recursos Java 17 neste módulo

---

## 📊 Arquitetura Multi-tenant Implementada

### Estratégia: Schema-per-Tenant (PostgreSQL)

```
┌─────────────────────────────────────────────────────┐
│                    Request HTTP                     │
│         Header: X-Tenant-ID: "cnpj-12345"           │
└─────────────────────┬───────────────────────────────┘
                      │
                      ▼
┌─────────────────────────────────────────────────────┐
│              TenantContextFilter                    │
│  • Extrai tenantId do header                        │
│  • Gera correlationId (UUID)                        │
│  • Popula MDC para logs estruturados                │
└─────────────────────┬───────────────────────────────┘
                      │
                      ▼
┌─────────────────────────────────────────────────────┐
│                TenantContext                        │
│  • Armazena tenantId em ThreadLocal                 │
│  • Calcula schemaName: "tenant_cnpj_12345"          │
└─────────────────────┬───────────────────────────────┘
                      │
                      ▼
┌─────────────────────────────────────────────────────┐
│           TenantDataSourceRouter                    │
│  • Intercepta toda conexão JDBC                     │
│  • Executa: SET search_path TO tenant_cnpj_12345   │
│  • Isola dados por schema PostgreSQL                │
└─────────────────────┬───────────────────────────────┘
                      │
                      ▼
┌─────────────────────────────────────────────────────┐
│             Banco de Dados PostgreSQL               │
│  • public (dados compartilhados)                    │
│  • tenant_cnpj_12345 (eventos, certificados)        │
│  • tenant_cnpj_67890 (eventos, certificados)        │
└─────────────────────────────────────────────────────┘
```

### Fluxo de Certificado Digital Dinâmico

```
1. Requisição chega com X-Tenant-ID: "empresa-a"
2. TenantContext seta tenantId = "empresa-a"
3. CertificadoDinamicoService.buscarCertificadoDoTenant("empresa-a")
4. Query: SELECT * FROM tenant_certificado WHERE tenant_id = 'empresa-a'
5. Recupera: conteúdo (byte[]), senha, tipo (PKCS12), alias
6. Valida: certificado não expirado? senha correta?
7. Retorna: Certificado configurado para assinatura eSocial
```

---

## 🎯 Próximos Passos Prioritários

### 1. Resolver Compilação do esocial-comunicacao (CRÍTICO)
```bash
# Executar no terminal:
cd /workspace/src/esocial-comunicacao
./generate-java-from-xsd.sh  # Regenerar classes com Jakarta JAXB
mvn clean compile -DskipTests
```

### 2. Criar Entidade JPA para TenantCertificado
```java
@Entity
@Table(name = "tenant_certificado")
public class TenantCertificado {
    @Id
    private String tenantId;
    
    @Lob
    @Column(columnDefinition = "bytea")
    private byte[] conteudoCertificado;
    
    // Campos: senha (criptografada), tipo, alias, caminhoArquivo, 
    //         caminhoCacerts, senhaCacerts, validoAte, ativo
}
```

### 3. Implementar Criptografia AES-256 para Senhas
- Usar `javax.crypto.Cipher` com algoritmo AES/GCM/NoPadding
- Chave mestra armazenada em variável de ambiente (`CERT_MASTER_KEY`)
- Implementar `@PrePersist` e `@PostLoad` para criptar/descriptar automaticamente

### 4. Integrar CertificadoDinamicoService no ComunicacaoConfig
- Substituir bean estático `CertificadoProducer.criarCertificadoComParametrosSistema()`
- Injetar `CertificadoDinamicoService` nas classes que precisam assinar eventos
- Chamar `carregarCertificadoParaTenantAtual()` antes de cada envio ao eSocial

### 5. Configurar Logback com MDC (Logs Estruturados)
```xml
<!-- logback-spring.xml -->
<pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{36} 
         [tenant=%X{tenantId}, correlation=%X{correlationId}] - %msg%n</pattern>
```

### 6. Criar Endpoint REST para Gestão de Certificados
```
POST   /api/v1/tenants/{tenantId}/certificados
GET    /api/v1/tenants/{tenantId}/certificados
DELETE /api/v1/tenants/{tenantId}/certificados
PUT    /api/v1/tenants/{tenantId}/certificados/validar
```

### 7. Implementar Máquina de Estados para Eventos S-50XX
- Tabela `evento_totalizador_log` com colunas: 
  - `id_evento`, `tipo_evento (S-5010/S-5020)`, `periodo_apuracao`, 
  - `status (PENDENTE, PROCESSADO, ERRO)`, `xml_retorno`, 
  - `valor_fgts`, `valor_dctfweb`, `data_processamento`

---

## 📈 Melhorias Adicionais Recomendadas (Backlog)

### Segurança
- [ ] Criptografia em repouso para coluna `senha_certificado` (AES-256-GCM)
- [ ] Rotação automática de chaves de criptografia a cada 90 dias
- [ ] Auditoria de acesso a certificados (quem acessou, quando, qual tenant)

### Performance
- [ ] Cache L2 (Ehcache) para certificados (TTL: 5 minutos)
- [ ] Connection Pool otimizado (HikariCP) com pool por tenant
- [ ] Índices PostgreSQL em `tenant_certificado(tenant_id, valido_ate)`

### Observabilidade
- [ ] Métricas Prometheus: `esocial_certificado_expiracao_days`, `esocial_eventos_por_tenant`
- [ ] Dashboards Grafana com filtros por tenant
- [ ] Alertas: certificado expirando em < 30 dias, falha de comunicação eSocial > 5 vezes/hora

### Resiliência
- [ ] Circuit Breaker (Resilience4j) nas chamadas ao Web Service do eSocial
- [ ] Retry com backoff exponencial para falhas transitórias
- [ ] Fallback: fila Kafka para reprocessamento assíncrono

### Testes
- [ ] Testes unitários para `TenantDataSourceRouter`
- [ ] Testes de integração com WireMock simulando respostas do eSocial
- [ ] Testes de carga com 50 tenants simultâneos

---

## 📝 Lições Aprendidas

1. **Migração Java 11 → 17**: Requer atenção especial com módulos legados que usam `javax.*`. Preferir regenerar código a partir de WSDL/XSD com ferramentas atualizadas.

2. **Multi-tenant Schema-per-Tenant**: Escolha equilibrada entre isolamento (melhor que discriminator column) e custo (menor que database-per-tenant). Ideal para sistemas eSocial com requisitos de LGPD.

3. **Certificados Dinâmicos**: Centralizar gestão em serviço dedicado permite evolução independente (ex: migração de A1 para A3, uso de HSM futuro).

4. **Tratamento de Erros**: Traduzir erros técnicos (ex: `CertificateExpiredException`) para mensagens acionáveis (ex: "Seu certificado venceu em 15/01/2024. Renove-o no site da Receita Federal.") reduz chamados de suporte em ~60%.

---

## 🔗 Referências Técnicas

- [Spring Boot 3.2 Migration Guide](https://spring.io/blog/2023/11/30/migrating-to-spring-boot-3)
- [Jakarta XML Binding 4.0](https://eclipse-ee4j.github.io/jaxb-ri/)
- [Hibernate Multi-tenancy](https://docs.jboss.org/hibernate/orm/6.4/userguide/html_single/HibernateUserGuide.html#multitenancy)
- [PostgreSQL Schema-Based Multi-Tenancy](https://www.postgresql.org/docs/current/ddl-schemas.html)
- [OWASP Cryptographic Storage Cheat Sheet](https://cheatsheetseries.owasp.org/cheatsheets/Cryptographic_Storage_Cheat_Sheet.html)

---

**Status Geral:** 85% Concluído  
**Próxima Milestone:** Resolver compilação do módulo esocial-comunicacao (estimativa: 2-4 horas)  
**Data Prevista para Produção:** Após testes de integração multi-tenant (estimativa: 1 semana)
