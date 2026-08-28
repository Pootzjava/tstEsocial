# 🚀 Plano de Implementação Faseada - eSocial-JT Premium

## 📋 Metodologia

- **Fases pequenas**: Cada fase pode ser implementada em 1-3 dias
- **Critérios de aceite claros**: Você saberá exatamente quando uma fase está completa
- **Testes obrigatórios**: Cada fase inclui testes específicos
- **Rollback seguro**: Se algo der errado, é fácil reverter
- **Zero downtime**: Todas as mudanças são compatíveis com produção

---

## 🎯 FASE 0: Preparação do Ambiente (1 dia)

### Objetivo
Garantir que o ambiente esteja pronto para receber as melhorias sem riscos.

### Tarefas

#### 0.1 - Backup e Branch de Desenvolvimento
```bash
# Criar branch para implementação faseada
git checkout -b feature/premium-phase-0-prep

# Garantir backup do banco (comando exemplo PostgreSQL)
pg_dump -U esocialjt esocialjt > backup_premiun_$(date +%Y%m%d).sql
```

#### 0.2 - Adicionar Dependências Base
**Arquivo**: `pom.xml`

Adicionar no `<dependencies>`:
```xml
<!-- Cache Caffeine -->
<dependency>
    <groupId>com.github.ben-manes.caffeine</groupId>
    <artifactId>caffeine</artifactId>
    <version>3.1.8</version>
</dependency>

<!-- Para validações de folha -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-st-validation</artifactId>
</dependency>

<!-- Para métricas (já deve existir, mas verificar) -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

#### 0.3 - Configurar Actuator
**Arquivo**: `src/main/resources/application.properties`

```properties
# Habilitar endpoints de saúde e métricas
management.endpoints.web.exposure.include=health,metrics,info,prometheus
management.endpoint.health.show-details=when_authorized
management.endpoint.metrics.enabled=true
management.prometheus.metrics.export.enabled=true
```

#### 0.4 - Criar Pacote de Melhorias
```bash
mkdir -p src/main/java/br/jus/tst/esocialjt/premium/cache
mkdir -p src/main/java/br/jus/tst/esocialjt/premium/validation
mkdir -p src/main/java/br/jus/tst/esocialjt/premium/dashboard
mkdir -p src/test/java/br/jus/tst/esocialjt/premium
```

### ✅ Critérios de Aceite - Fase 0
- [ ] Branch `feature/premium-phase-0-prep` criada
- [ ] Backup do banco realizado
- [ ] Dependências adicionadas sem erros de build
- [ ] `mvn clean compile` executa sem erros
- [ ] Actuator acessível em `http://localhost:8080/actuator/health`

### 🧪 Testes da Fase 0
```bash
# Verificar build
mvn clean compile

# Verificar actuator
curl http://localhost:8080/actuator/health | jq
```

---

## 📊 FASE 1: Dashboard Backend - Dados Reais (2-3 dias)

### Objetivo
Fazer o endpoint de dashboard retornar dados reais de apurações (S-5010/S-5020).

### Tarefas

#### 1.1 - Analisar Estrutura Atual do Parser
**Arquivo para inspecionar**: 
- `src/main/java/br/jus/tst/esocialjt/apuracao/ParserApuracao.java` (ou similar)
- `src/main/java/br/jus/tst/esocialjt/dashboard/DashboardService.java`

Verificar como o método `calcularTotaisApuracao()` está implementado atualmente.

#### 1.2 - Implementar Cálculo Real de Apurações
**Arquivo**: `src/main/java/br/jus/tst/esocialjt/premium/dashboard/ApuracaoCalculator.java`

```java
package br.jus.tst.esocialjt.premium.dashboard;

import br.jus.tst.esocialjt.negocio.Evento;
import br.jus.tst.esocialjt.negocio.TipoEvento;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@Slf4j
public class ApuracaoCalculator {

    /**
     * Calcula totais reais baseados nos eventos S-5010 (RRP) e S-5020 (RPPS)
     */
    public Map<String, BigDecimal> calcularTotaisApuracao(List<Evento> eventos, String periodoApuracao) {
        log.info("Calculando totais para período: {}", periodoApuracao);
        
        // Filtrar eventos do período
        List<Evento> eventosPeriodo = eventos.stream()
            .filter(e -> e.getPeriodoApuracao() != null && 
                        e.getPeriodoApuracao().equals(periodoApuracao))
            .collect(Collectors.toList());
        
        // Separar por tipo de evento
        List<Evento> s5010 = eventosPeriodo.stream()
            .filter(e -> e.getCodTipoEvento() == 5010)
            .collect(Collectors.toList());
            
        List<Evento> s5020 = eventosPeriodo.stream()
            .filter(e -> e.getCodTipoEvento() == 5020)
            .collect(Collectors.toList());
        
        // Extrair totais do XML (implementar parser específico)
        BigDecimal totalRRP = extrairTotalEvento(s5010, "totalRRP");
        BigDecimal totalRPPS = extrairTotalEvento(s5020, "totalRPPS");
        
        return Map.of(
            "totalRRP", totalRRP,
            "totalRPPS", totalRPPS,
            "totalGeral", totalRRP.add(totalRPPS)
        );
    }
    
    private BigDecimal extrairTotalEvento(List<Evento> eventos, String campo) {
        // TODO: Implementar parser XML para extrair valor do campo
        // Dica: Usar evento.getXml() e XPath para encontrar o valor
        return eventos.stream()
            .map(Evento::getXml)
            .map(xml -> parseXMLValue(xml, campo))
            .filter(java.util.Objects::nonNull)
            .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
    
    private BigDecimal parseXMLValue(String xml, String campo) {
        // Implementar lógica de parsing XML
        // Exemplo simplificado:
        try {
            javax.xml.parsers.DocumentBuilder builder = 
                javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder();
            org.w3c.dom.Document doc = builder.parse(
                new java.io.ByteArrayInputStream(xml.getBytes()));
            
            org.w3c.dom.NodeList nodes = doc.getElementsByTagName(campo);
            if (nodes.getLength() > 0) {
                String valor = nodes.item(0).getTextContent();
                return new BigDecimal(valor.replace(",", "."));
            }
        } catch (Exception e) {
            log.warn("Erro ao parsear XML para campo {}: {}", campo, e.getMessage());
        }
        return null;
    }
}
```

#### 1.3 - Atualizar DashboardService
**Arquivo**: `src/main/java/br/jus/tst/esocialjt/dashboard/DashboardService.java`

Localizar método existente e atualizar:

```java
@Autowired
private ApuracaoCalculator apuracaoCalculator;

// No método que retorna dados do dashboard
public DashboardDTO getDashboardData() {
    List<Evento> eventos = eventoRepository.findAll();
    String periodoAtual = obterPeriodoAtual(); // Implementar
    
    Map<String, BigDecimal> totais = apuracaoCalculator.calcularTotaisApuracao(
        eventos, 
        periodoAtual
    );
    
    return DashboardDTO.builder()
        .totalEventos(eventos.size())
        .totalRRP(totais.get("totalRRP"))
        .totalRPPS(totais.get("totalRPPS"))
        .totalGeral(totais.get("totalGeral"))
        // ... outros campos
        .build();
}
```

#### 1.4 - Criar Teste Unitário
**Arquivo**: `src/test/java/br/jus/tst/esocialjt/premium/dashboard/ApuracaoCalculatorTest.java`

```java
package br.jus.tst.esocialjt.premium.dashboard;

import br.jus.tst.esocialjt.negocio.Evento;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApuracaoCalculatorTest {

    @Autowired
    private ApuracaoCalculator calculator;

    @Test
    void deveCalcularTotaisCorretamente() {
        // Criar eventos mock
        Evento evento1 = new Evento();
        evento1.setCodTipoEvento(5010);
        evento1.setPeriodoApuracao("2024-01");
        evento1.setXml("<eSocial><totalRRP>1500.00</totalRRP></eSocial>");
        
        Evento evento2 = new Evento();
        evento2.setCodTipoEvento(5020);
        evento2.setPeriodoApuracao("2024-01");
        evento2.setXml("<eSocial><totalRPPS>800.00</totalRPPS></eSocial>");
        
        List<Evento> eventos = List.of(evento1, evento2);
        
        Map<String, BigDecimal> totais = calculator.calcularTotaisApuracao(eventos, "2024-01");
        
        assertThat(totais.get("totalRRP")).isEqualByComparingTo(new BigDecimal("1500.00"));
        assertThat(totais.get("totalRPPS")).isEqualByComparingTo(new BigDecimal("800.00"));
        assertThat(totais.get("totalGeral")).isEqualByComparingTo(new BigDecimal("2300.00"));
    }
}
```

### ✅ Critérios de Aceite - Fase 1
- [ ] Método `calcularTotaisApuracao()` retorna valores reais (não zeros)
- [ ] Teste unitário passa com 100% de assertivas
- [ ] Endpoint `/api/dashboard` retorna JSON com totais calculados
- [ ] Logs mostram cálculo sendo executado
- [ ] Performance aceitável (< 2 segundos para 1000 eventos)

### 🧪 Testes da Fase 1
```bash
# Rodar teste específico
mvn test -Dtest=ApuracaoCalculatorTest

# Testar endpoint manualmente
curl http://localhost:8080/api/dashboard | jq '.totaisApuracao'
```

---

## ⚡ FASE 2: Cache Caffeine para Consultas Pesadas (1-2 dias)

### Objetivo
Reduzir tempo de resposta do dashboard em 90% usando cache.

### Tarefas

#### 2.1 - Criar Configuração de Cache
**Arquivo**: `src/main/java/br/jus/tst/esocialjt/premium/cache/CacheConfig.java`

```java
package br.jus.tst.esocialjt.premium.cache;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class CacheConfig {

    @Bean
    public CacheManager cacheManager() {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
        
        // Cache para dashboard (atualiza a cada 5 minutos)
        cacheManager.registerCustomCaffeine("dashboardCache", 
            Caffeine.newBuilder()
                .expireAfterWrite(5, TimeUnit.MINUTES)
                .maximumSize(100)
                .recordStats());
        
        // Cache para apurações (atualiza a cada 10 minutos)
        cacheManager.registerCustomCaffeine("apuracaoCache", 
            Caffeine.newBuilder()
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .maximumSize(50)
                .recordStats());
        
        // Cache para validações (atualiza a cada 1 hora)
        cacheManager.registerCustomCaffeine("validacaoCache", 
            Caffeine.newBuilder()
                .expireAfterWrite(1, TimeUnit.HOURS)
                .maximumSize(200)
                .recordStats());
        
        return cacheManager;
    }
}
```

#### 2.2 - Habilitar Cache no Spring Boot
**Arquivo**: `src/main/java/br/jus/tst/esocialjt/EsocialJtApplication.java`

Adicionar anotação:
```java
@SpringBootApplication
@EnableCaching // <-- Adicionar esta linha
public class EsocialJtApplication {
    // ...
}
```

#### 2.3 - Aplicar Cache no DashboardService
**Arquivo**: `src/main/java/br/jus/tst/esocialjt/dashboard/DashboardService.java`

```java
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CacheEvict;

@Service
public class DashboardService {

    @Cacheable(value = "dashboardCache", key = "#tenantId ?: 'default'")
    public DashboardDTO getDashboardData(String tenantId) {
        // Lógica existente (agora em cache)
        log.info("Buscando dados do dashboard (cache miss)");
        // ... implementação existente
    }
    
    @CacheEvict(value = "dashboardCache", allEntries = true)
    public void invalidarCacheDashboard() {
        log.info("Cache do dashboard invalidado");
    }
    
    // Invalidar cache quando novo evento for criado
    @CacheEvict(value = "dashboardCache", allEntries = true)
    public Evento salvarEvento(Evento evento) {
        // Lógica existente de salvamento
    }
}
```

#### 2.4 - Adicionar Métricas de Cache
**Arquivo**: `src/main/java/br/jus/tst/esocialjt/premium/cache/CacheMetrics.java`

```java
package br.jus.tst.esocialjt.premium.cache;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CacheMetrics {

    private final MeterRegistry meterRegistry;

    public CacheMetrics(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    @PostConstruct
    public void init() {
        // Registrar métricas de hit/miss do cache
        meterRegistry.gauge("cache.hits", 0);
        meterRegistry.gauge("cache.misses", 0);
        meterRegistry.gauge("cache.evictions", 0);
    }
}
```

### ✅ Critérios de Aceite - Fase 2
- [ ] Anotação `@EnableCaching` presente na aplicação principal
- [ ] Cache configurado para dashboard, apurações e validações
- [ ] Segunda requisição ao dashboard é 10x mais rápida
- [ ] Cache é invalidado ao criar/atualizar eventos
- [ ] Métricas de cache disponíveis em `/actuator/metrics`

### 🧪 Testes da Fase 2
```bash
# Testar performance com cache
echo "Primeira requisição (cache miss):"
time curl http://localhost:8080/api/dashboard > /dev/null

echo "Segunda requisição (cache hit):"
time curl http://localhost:8080/api/dashboard > /dev/null

# Verificar métricas de cache
curl http://localhost:8080/actuator/metrics | jq '.names[] | select(contains("cache"))'
```

---

## 🔍 FASE 3: Validações de Folha de Pagamento - Parte 1 (2 dias)

### Objetivo
Implementar validações básicas de salário mínimo e FGTS.

### Tarefas

#### 3.1 - Criar Serviço de Validação
**Arquivo**: `src/main/java/br/jus/tst/esocialjt/premium/validation/FolhaValidator.java`

```java
package br.jus.tst.esocialjt.premium.validation;

import br.jus.tst.esocialjt.negocio.Evento;
import br.jus.tst.esocialjt.negocio.TipoEvento;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class FolhaValidator {

    // Salário mínimo vigente (atualizar conforme legislação)
    private static final BigDecimal SALARIO_MINIMO_2024 = new BigDecimal("1412.00");
    private static final BigDecimal TETO_INSS_2024 = new BigDecimal("7786.02");
    private static final BigDecimal ALIQUOTA_FGTS = new BigDecimal("0.08");

    /**
     * Resultado de uma validação
     */
    @Data
    @Builder
    public static class ValidationResult {
        private boolean valido;
        private String codigo;
        private String mensagem;
        private String severidade; // INFO, WARNING, ERROR
        private String campo;
        private Object valorEncontrado;
        private Object valorEsperado;
    }

    /**
     * Valida todos os eventos de folha de um período
     */
    public List<ValidationResult> validarFolha(List<Evento> eventos, YearMonth competencia) {
        log.info("Validando folha de competência: {}", competencia);
        
        List<ValidationResult> resultados = new ArrayList<>();
        
        // Filtrar eventos S-1200 (Remuneração)
        List<Evento> eventosRemuneracao = eventos.stream()
            .filter(e -> e.getCodTipoEvento() == 1200)
            .filter(e -> e.getCompetencia().equals(competencia))
            .toList();
        
        // Validar cada evento
        for (Evento evento : eventosRemuneracao) {
            resultados.addAll(validarEventoRemuneracao(evento));
        }
        
        // Consolidar resultados
        return resultados;
    }

    /**
     * Validações específicas para evento S-1200
     */
    private List<ValidationResult> validarEventoRemuneracao(Evento evento) {
        List<ValidationResult> resultados = new ArrayList<>();
        
        // Extrair remuneração do XML
        BigDecimal remuneracao = extrairRemuneracao(evento.getXml());
        
        // Validação 1: Salário mínimo
        if (remuneracao != null && remuneracao.compareTo(SALARIO_MINIMO_2024) < 0) {
            resultados.add(ValidationResult.builder()
                .valido(false)
                .codigo("FOLHA-001")
                .mensagem("Remuneração abaixo do salário mínimo vigente")
                .severidade("ERROR")
                .campo("remuneracao")
                .valorEncontrado(remuneracao)
                .valorEsperado(SALARIO_MINIMO_2024)
                .build());
        }
        
        // Validação 2: Teto INSS
        if (remuneracao != null && remuneracao.compareTo(TETO_INSS_2024) > 0) {
            resultados.add(ValidationResult.builder()
                .valido(false)
                .codigo("FOLHA-002")
                .mensagem("Remuneração acima do teto do INSS")
                .severidade("WARNING")
                .campo("remuneracao")
                .valorEncontrado(remuneracao)
                .valorEsperado(TETO_INSS_2024)
                .build());
        }
        
        // Validação 3: FGTS divergente
        BigDecimal fgtsCalculado = remuneracao != null ? 
            remuneracao.multiply(ALIQUOTA_FGTS) : BigDecimal.ZERO;
        BigDecimal fgtsDeclarado = extrairFGTS(evento.getXml());
        
        if (fgtsDeclarado != null && 
            fgtsCalculado.subtract(fgtsDeclarado).abs().compareTo(new BigDecimal("0.10")) > 0) {
            resultados.add(ValidationResult.builder()
                .valido(false)
                .codigo("FOLHA-003")
                .mensagem("FGTS declarado diverge do cálculo (8%)")
                .severidade("ERROR")
                .campo("fgts")
                .valorEncontrado(fgtsDeclarado)
                .valorEsperado(fgtsCalculado)
                .build());
        }
        
        return resultados;
    }

    // Métodos auxiliares de parsing XML (implementar conforme estrutura real)
    private BigDecimal extrairRemuneracao(String xml) {
        // TODO: Implementar parser XML específico para S-1200
        return null; // Placeholder
    }

    private BigDecimal extrairFGTS(String xml) {
        // TODO: Implementar parser XML específico para S-1200
        return null; // Placeholder
    }
}
```

#### 3.2 - Criar Controller de Validações
**Arquivo**: `src/main/java/br/jus/tst/esocialjt/premium/validation/ValidacaoController.java`

```java
package br.jus.tst.esocialjt.premium.validation;

import br.jus.tst.esocialjt.negocio.Evento;
import br.jus.tst.esocialjt.negocio.EventoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.YearMonth;
import java.util.List;

@RestController
@RequestMapping("/api/validacoes")
@RequiredArgsConstructor
public class ValidacaoController {

    private final FolhaValidator folhaValidator;
    private final EventoRepository eventoRepository;

    @GetMapping("/folha/{competencia}")
    public List<FolhaValidator.ValidationResult> validarFolhaCompetencia(
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM") YearMonth competencia) {
        
        List<Evento> eventos = eventoRepository.findAll();
        return folhaValidator.validarFolha(eventos, competencia);
    }

    @PostMapping("/executar")
    public List<FolhaValidator.ValidationResult> executarValidacoes(
            @RequestBody List<Long> idsEventos) {
        
        List<Evento> eventos = eventoRepository.findAllById(idsEventos);
        // Agrupar por competência e validar
        // TODO: Implementar lógica completa
        return List.of();
    }
}
```

#### 3.3 - Criar Teste Unitário
**Arquivo**: `src/test/java/br/jus/tst/esocialjt/premium/validation/FolhaValidatorTest.java`

```java
package br.jus.tst.esocialjt.premium.validation;

import br.jus.tst.esocialjt.negocio.Evento;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FolhaValidatorTest {

    @Autowired
    private FolhaValidator validator;

    @Test
    void deveDetectarSalarioAbaixoDoMinimo() {
        Evento evento = new Evento();
        evento.setCodTipoEvento(1200);
        evento.setCompetencia(YearMonth.of(2024, 1));
        // XML mock com remuneração de R$ 1000,00
        evento.setXml("<eSocial><remuneracao>1000.00</remuneracao></eSocial>");
        
        List<FolhaValidator.ValidationResult> resultados = 
            validator.validarFolha(List.of(evento), YearMonth.of(2024, 1));
        
        assertThat(resultados).hasSize(1);
        assertThat(resultados.get(0).getCodigo()).isEqualTo("FOLHA-001");
        assertThat(resultados.get(0).isValido()).isFalse();
    }

    @Test
    void deveAprovarSalarioAcimaDoMinimo() {
        Evento evento = new Evento();
        evento.setCodTipoEvento(1200);
        evento.setCompetencia(YearMonth.of(2024, 1));
        evento.setXml("<eSocial><remuneracao>2000.00</remuneracao></eSocial>");
        
        List<FolhaValidator.ValidationResult> resultados = 
            validator.validarFolha(List.of(evento), YearMonth.of(2024, 1));
        
        // Não deve ter erros de salário mínimo
        List<FolhaValidator.ValidationResult> erros = 
            resultados.stream()
                .filter(r -> r.getCodigo().equals("FOLHA-001"))
                .toList();
        
        assertThat(erros).isEmpty();
    }
}
```

### ✅ Critérios de Aceite - Fase 3
- [ ] Validação de salário mínimo funciona corretamente
- [ ] Validação de teto INSS funciona corretamente
- [ ] Validação de FGTS detecta divergências
- [ ] Endpoint `/api/validacoes/folha/{competencia}` retorna lista de erros/warnings
- [ ] Testes unitários cobrem todos os cenários
- [ ] Severidade (ERROR/WARNING/INFO) está correta

### 🧪 Testes da Fase 3
```bash
# Rodar testes
mvn test -Dtest=FolhaValidatorTest

# Testar endpoint
curl http://localhost:8080/api/validacoes/folha/2024-01 | jq
```

---

## 📈 FASE 4: Dashboard Frontend - Cards KPI (2-3 dias)

### Objetivo
Criar cards visuais no frontend mostrando totais de apurações.

### Tarefas

#### 4.1 - Verificar Estrutura Frontend Existente
Inspecionar:
- `frontend/src/` ou `src/main/frontend/`
- Identificar framework (React, Angular, Vue?)
- Localizar página de dashboard atual

#### 4.2 - Criar Hook React para API do Dashboard
**Arquivo**: `frontend/src/hooks/useDashboard.js` (ajustar conforme estrutura)

```javascript
import { useState, useEffect } from 'react';
import axios from 'axios';

export function useDashboard() {
  const [data, setData] = useState(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  const fetchDashboard = async () => {
    try {
      setLoading(true);
      const response = await axios.get('/api/dashboard');
      setData(response.data);
      setError(null);
    } catch (err) {
      setError(err.message);
    } finally {
      setLoading(false);
    }
  };

  useEffect(() => {
    fetchDashboard();
    
    // Atualizar a cada 5 minutos
    const interval = setInterval(fetchDashboard, 300000);
    return () => clearInterval(interval);
  }, []);

  return { data, loading, error, refresh: fetchDashboard };
}
```

#### 4.3 - Criar Componente de Cards KPI
**Arquivo**: `frontend/src/components/DashboardKPICards.jsx`

```jsx
import React from 'react';
import { useDashboard } from '../hooks/useDashboard';
import './DashboardKPICards.css';

export function DashboardKPICards() {
  const { data, loading, error } = useDashboard();

  if (loading) return <div className="loading">Carregando dashboard...</div>;
  if (error) return <div className="error">Erro: {error}</div>;
  if (!data) return null;

  const formatCurrency = (value) => {
    return new Intl.NumberFormat('pt-BR', {
      style: 'currency',
      currency: 'BRL'
    }).format(value || 0);
  };

  return (
    <div className="kpi-cards-container">
      <div className="kpi-card">
        <div className="kpi-icon">📊</div>
        <div className="kpi-content">
          <h3>Total de Eventos</h3>
          <p className="kpi-value">{data.totalEventos || 0}</p>
          <span className="kpi-label">Eventos processados</span>
        </div>
      </div>

      <div className="kpi-card highlight">
        <div className="kpi-icon">💰</div>
        <div className="kpi-content">
          <h3>Total RRP (S-5010)</h3>
          <p className="kpi-value">{formatCurrency(data.totaisApuracao?.totalRRP)}</p>
          <span className="kpi-label">Regime Próprio</span>
        </div>
      </div>

      <div className="kpi-card highlight">
        <div className="kpi-icon">🏛️</div>
        <div className="kpi-content">
          <h3>Total RPPS (S-5020)</h3>
          <p className="kpi-value">{formatCurrency(data.totaisApuracao?.totalRPPS)}</p>
          <span className="kpi-label">Regime Geral</span>
        </div>
      </div>

      <div className="kpi-card total">
        <div className="kpi-icon">🎯</div>
        <div className="kpi-content">
          <h3>Total Geral</h3>
          <p className="kpi-value">{formatCurrency(data.totaisApuracao?.totalGeral)}</p>
          <span className="kpi-label">Período atual</span>
        </div>
      </div>
    </div>
  );
}
```

#### 4.4 - Estilizar Cards (CSS)
**Arquivo**: `frontend/src/components/DashboardKPICards.css`

```css
.kpi-cards-container {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
  gap: 20px;
  padding: 20px;
  max-width: 1200px;
  margin: 0 auto;
}

.kpi-card {
  background: white;
  border-radius: 12px;
  padding: 24px;
  box-shadow: 0 2px 8px rgba(0,0,0,0.1);
  display: flex;
  align-items: center;
  gap: 16px;
  transition: transform 0.2s, box-shadow 0.2s;
  border-left: 4px solid #3498db;
}

.kpi-card:hover {
  transform: translateY(-4px);
  box-shadow: 0 8px 16px rgba(0,0,0,0.15);
}

.kpi-card.highlight {
  border-left-color: #2ecc71;
  background: linear-gradient(135deg, #f0fff4 0%, white 100%);
}

.kpi-card.total {
  border-left-color: #e74c3c;
  background: linear-gradient(135deg, #fff5f5 0%, white 100%);
}

.kpi-icon {
  font-size: 2.5rem;
  opacity: 0.8;
}

.kpi-content h3 {
  margin: 0;
  font-size: 0.9rem;
  color: #666;
  font-weight: 500;
}

.kpi-value {
  margin: 8px 0 0 0;
  font-size: 1.8rem;
  font-weight: bold;
  color: #2c3e50;
}

.kpi-label {
  font-size: 0.8rem;
  color: #999;
  margin-top: 4px;
}

.loading, .error {
  text-align: center;
  padding: 40px;
  font-size: 1.1rem;
}

.error {
  color: #e74c3c;
}

/* Responsivo */
@media (max-width: 768px) {
  .kpi-cards-container {
    grid-template-columns: 1fr;
  }
  
  .kpi-value {
    font-size: 1.5rem;
  }
}
```

#### 4.5 - Integrar na Página de Dashboard
Localizar arquivo principal do dashboard (ex: `Dashboard.jsx`, `Home.jsx`) e adicionar:

```jsx
import { DashboardKPICards } from './components/DashboardKPICards';

function DashboardPage() {
  return (
    <div className="dashboard-page">
      <h1>Dashboard eSocial-JT</h1>
      
      {/* Nova seção de KPIs */}
      <DashboardKPICards />
      
      {/* Conteúdo existente do dashboard */}
      {/* ... */}
    </div>
  );
}
```

### ✅ Critérios de Aceite - Fase 4
- [ ] 4 cards KPI exibidos no dashboard
- [ ] Valores formatados em BRL (R$ 1.234,56)
- [ ] Cards atualizam automaticamente a cada 5 minutos
- [ ] Design responsivo (mobile-friendly)
- [ ] Hover effects funcionam
- [ ] Loading state exibido durante carregamento
- [ ] Tratamento de erros visível

### 🧪 Testes da Fase 4
```bash
# Testar build do frontend
cd frontend && npm run build

# Testar manualmente no navegador
# Acessar http://localhost:3000/dashboard
# Verificar se cards aparecem com dados reais
```

---

## 🔄 FASE 5: Filas Prioritárias com Retry (2-3 dias)

### Objetivo
Implementar sistema de filas inteligente com retry exponencial.

### Tarefas

#### 5.1 - Configurar RabbitMQ (se não existir)
**Arquivo**: `pom.xml`

```xml
<!-- Spring AMQP para RabbitMQ -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>
```

**Arquivo**: `application.properties`

```properties
# Configuração RabbitMQ
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
spring.rabbitmq.username=esocialjt
spring.rabbitmq.password=secret
spring.rabbitmq.listener.simple.retry.enabled=true
spring.rabbitmq.listener.simple.retry.initial-interval=2000
spring.rabbitmq.listener.simple.retry.max-attempts=5
spring.rabbitmq.listener.simple.retry.multiplier=2.0
```

#### 5.2 - Criar Configuração de Filas
**Arquivo**: `src/main/java/br/jus/tst/esocialjt/premium/fila/FilaConfig.java`

```java
package br.jus.tst.esocialjt.premium.fila;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.retry.RejectAndDontRequeueRecoverer;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilaConfig {

    public static final String FILA_PRIORITARIA = "esocial.fila.prioritaria";
    public static final String FILA_NORMAL = "esocial.fila.normal";
    public static final String FILA_BAIXA = "esocial.fila.baixa";
    public static final String FILA_DLQ = "esocial.fila.dlq";

    @Bean
    public Queue filaPrioritaria() {
        return QueueBuilder.durable(FILA_PRIORITARIA)
            .withArgument("x-max-priority", 10)
            .build();
    }

    @Bean
    public Queue filaNormal() {
        return QueueBuilder.durable(FILA_NORMAL).build();
    }

    @Bean
    public Queue filaBaixa() {
        return QueueBuilder.durable(FILA_BAIXA)
            .withArgument("x-max-priority", 1)
            .build();
    }

    @Bean
    public Queue filaDLQ() {
        return QueueBuilder.durable(FILA_DLQ).build();
    }

    @Bean
    public DirectExchange exchange() {
        return new DirectExchange("esocial.exchange");
    }

    @Bean
    public Binding bindingPrioritaria(Queue filaPrioritaria, DirectExchange exchange) {
        return BindingBuilder.bind(filaPrioritaria)
            .to(exchange)
            .with("prioritaria");
    }

    @Bean
    public Binding bindingNormal(Queue filaNormal, DirectExchange exchange) {
        return BindingBuilder.bind(filaNormal)
            .to(exchange)
            .with("normal");
    }

    @Bean
    public Binding bindingBaixa(Queue filaBaixa, DirectExchange exchange) {
        return BindingBuilder.bind(filaBaixa)
            .to(exchange)
            .with("baixa");
    }

    @Bean
    public Jackson2JsonMessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}
```

#### 5.3 - Criar Producer de Mensagens
**Arquivo**: `src/main/java/br/jus/tst/esocialjt/premium/fila/FilaProducer.java`

```java
package br.jus.tst.esocialjt.premium.fila;

import br.jus.tst.esocialjt.negocio.Evento;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class FilaProducer {

    private final RabbitTemplate rabbitTemplate;

    public void enviarParaFila(Evento evento, Prioridade prioridade) {
        String routingKey = switch (prioridade) {
            case ALTA -> FilaConfig.FILA_PRIORITARIA;
            case BAIXA -> FilaConfig.FILA_BAIXA;
            default -> FilaConfig.FILA_NORMAL;
        };

        log.info("Enviando evento {} para fila {} com prioridade {}", 
            evento.getId(), routingKey, prioridade);

        rabbitTemplate.convertAndSend("esocial.exchange", routingKey, evento);
    }

    public enum Prioridade {
        ALTA, NORMAL, BAIXA
    }
}
```

#### 5.4 - Criar Consumer com Retry
**Arquivo**: `src/main/java/br/jus/tst/esocialjt/premium/fila/FilaConsumer.java`

```java
package br.jus.tst.esocialjt.premium.fila;

import br.jus.tst.esocialjt.negocio.Evento;
import br.jus.tst.esocialjt.negocio.EventoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.support.ListenerExecutionFailedException;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class FilaConsumer {

    private final EventoService eventoService;

    @RabbitListener(queues = FilaConfig.FILA_PRIORITARIA)
    public void processarFilaPrioritaria(Evento evento) {
        log.info("Processando evento prioritário: {}", evento.getId());
        processarEvento(evento);
    }

    @RabbitListener(queues = FilaConfig.FILA_NORMAL)
    public void processarFilaNormal(Evento evento) {
        log.info("Processando evento normal: {}", evento.getId());
        processarEvento(evento);
    }

    @RabbitListener(queues = FilaConfig.FILA_BAIXA)
    public void processarFilaBaixa(Evento evento) {
        log.info("Processando evento baixa prioridade: {}", evento.getId());
        processarEvento(evento);
    }

    private void processarEvento(Evento evento) {
        try {
            eventoService.processar(evento);
            log.info("Evento {} processado com sucesso", evento.getId());
        } catch (Exception e) {
            log.error("Erro ao processar evento {}: {}", evento.getId(), e.getMessage(), e);
            throw new ListenerExecutionFailedException("Falha no processamento", e);
        }
    }
}
```

#### 5.5 - Criar Estratégia de Priorização
**Arquivo**: `src/main/java/br/jus/tst/esocialjt/premium/fila/PriorizacaoStrategy.java`

```java
package br.jus.tst.esocialjt.premium.fila;

import br.jus.tst.esocialjt.negocio.Evento;
import br.jus.tst.esocialjt.negocio.TipoEvento;
import org.springframework.stereotype.Component;

@Component
public class PriorizacaoStrategy {

    /**
     * Define prioridade baseada no tipo de evento e urgência
     */
    public FilaProducer.Prioridade definirPrioridade(Evento evento) {
        Integer codTipo = evento.getCodTipoEvento();

        // Eventos periódicos têm alta prioridade
        if (evento.isPeriodico()) {
            return FilaProducer.Prioridade.ALTA;
        }

        // Eventos de fechamento de folha são prioritários
        if (codTipo == 5010 || codTipo == 5020) {
            return FilaProducer.Prioridade.ALTA;
        }

        // Eventos iniciais (S-1000, S-1010, etc.) têm prioridade normal
        if (codTipo >= 1000 && codTipo <= 1999) {
            return FilaProducer.Prioridade.NORMAL;
        }

        // Eventos tabelas podem ter baixa prioridade
        if (codTipo >= 2000 && codTipo <= 2999) {
            return FilaProducer.Prioridade.BAIXA;
        }

        return FilaProducer.Prioridade.NORMAL;
    }
}
```

### ✅ Critérios de Aceite - Fase 5
- [ ] RabbitMQ instalado e configurado
- [ ] 3 filas criadas (prioritária, normal, baixa)
- [ ] DLQ (Dead Letter Queue) configurada
- [ ] Retry com backoff exponencial funcionando
- [ ] Eventos são roteados para fila correta baseada na prioridade
- [ ] Logs mostram processamento por prioridade

### 🧪 Testes da Fase 5
```bash
# Iniciar RabbitMQ (Docker)
docker run -d --hostname rabbitmq --name rabbitmq \
  -p 5672:5672 -p 15672:15672 \
  -e RABBITMQ_DEFAULT_USER=esocialjt \
  -e RABBITMQ_DEFAULT_PASS=secret \
  rabbitmq:3-management

# Acessar management UI
# http://localhost:15672 (user: esocialjt, pass: secret)

# Testar envio de mensagem
curl -X POST http://localhost:15672/api/exchanges/%2F/esocial.exchange/publish \
  -u esocialjt:secret \
  -H "Content-Type: application/json" \
  -d '{"routing_key":"prioritaria","payload":{"teste":"dados"},"payload_encoding":"string"}'
```

---

## 📝 PRÓXIMAS FASES (Resumo)

### FASE 6: Validações de Folha - Parte 2 (2 dias)
- IRRF fora da faixa
- Múltiplos vínculos ativos
- Dependentes duplicados

### FASE 7: UX Premium - Onboarding (2 dias)
- React Joyride para tour guiado
- Tooltips contextuais
- Primeiros passos interativos

### FASE 8: Relatórios JasperReports (3-4 dias)
- Template PDF para conferência de folha
- Exportação Excel
- Agendamento automático

### FASE 9: Monitoramento Grafana (2 dias)
- Dashboard pré-configurado
- Alertas de certificado vencendo
- Alertas de lotes rejeitados

### FASE 10: Audit Trail Completo (3 dias)
- Tabela de auditoria
- Quem fez o quê e quando
- Compliance LGPD

---

## 🎯 Como Usar Este Plano

1. **Comece pela Fase 0** - Não pule etapas
2. **Siga a ordem** - Cada fase depende da anterior
3. **Teste cada fase** - Use os critérios de aceite
4. **Commit frequente** - Um commit por tarefa concluída
5. **Não tenha pressa** - Melhor lento e seguro que rápido e bugado

### Checklist Geral de Cada Fase

Antes de iniciar uma fase:
- [ ] Fase anterior completada e testada
- [ ] Branch git criada (`feature/premium-fase-X`)
- [ ] Backup do banco realizado

Durante a fase:
- [ ] Seguir tarefas na ordem
- [ ] Escrever testes primeiro (TDD opcional mas recomendado)
- [ ] Commitar após cada tarefa

Ao finalizar a fase:
- [ ] Todos os critérios de aceite verificados
- [ ] Testes passando (`mvn test`)
- [ ] Build limpo (`mvn clean package`)
- [ ] Code review (se trabalhar em equipe)
- [ ] Merge para branch principal

---

## 🆘 Suporte Durante Implementação

Se encontrar dificuldades:

1. **Erros de compilação**: Verifique imports e dependências no `pom.xml`
2. **Cache não funciona**: Confirme `@EnableCaching` na aplicação principal
3. **RabbitMQ não conecta**: Verifique credenciais e porta 5672
4. **Frontend não carrega dados**: Confira CORS e URL da API
5. **Testes falhando**: Revise mocks e dados de teste

---

**Pronto para começar?** 

Digite **"iniciar fase 0"** e eu guio você passo a passo na primeira fase com comandos exatos e verificação em tempo real!
