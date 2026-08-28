# Fase 14 - Analytics Preditivo (Detecção de Anomalias e Passivo Trabalhista)

## 🎯 Objetivo
Implementar motor de inteligência analítica que identifica padrões suspeitos na folha de pagamento antes que gerem processos trabalhistas ou multas do eSocial.

## ✅ Implementação Física Realizada

### Backend (5 arquivos Java)

1. **`AnomalyDetectionService.java`**
   - Motor estatístico com algoritmo Z-Score
   - Detecta salários atípicos por cargo/função
   - Identifica excesso de horas extras consistentes
   - Verifica risco de férias vencidas (>24 meses)

2. **`AnomalyResultDTO.java`**
   - Estrutura padronizada para resultados de anomalias
   - Campos: tipo, descrição, severidade (LOW/MEDIUM/HIGH/CRITICAL), score

3. **`RiskScoreCalculator.java`**
   - Calcula score de 0 a 100 baseado em múltiplos fatores
   - Classificação visual: LOW (verde), MEDIUM (amarelo), HIGH (laranja), CRITICAL (vermelho)
   - Gera recomendações automáticas de ação

4. **`AnalyticsController.java`**
   - `GET /api/analytics/dashboard` - Dashboard completo
   - `GET /api/analytics/score` - Apenas score de risco
   - `GET /api/analytics/anomalies?severity=HIGH` - Lista filtrada

### Frontend (3 arquivos React)

1. **`frontend/src/app/analytics/page.jsx`**
   - Página principal do Analytics Preditivo
   - Exibe score de risco em tempo real
   - Mostra recomendações e total de anomalias

2. **`frontend/src/components/analytics/RiskGaugeChart.jsx`**
   - Gráfico de gauge (velocímetro) usando Recharts
   - Cores dinâmicas baseadas na classificação de risco
   - Visual impactante para tomada de decisão

3. **`frontend/src/components/analytics/AnomaliesList.jsx`**
   - Lista detalhada de todas as anomalias detectadas
   - Ícones e cores por severidade
   - Estado vazio amigável quando não há problemas

## 📊 Funcionalidades Implementadas

### Detecção de Anomalias
- **Salários Atípicos**: Identifica funcionários com salário >2.5 desvios padrão da média do cargo
- **Horas Extras Excessivas**: Alerta quando média >60h/mês (risco de exaustão)
- **Férias Vencidas**: Detecta colaboradores sem férias há >24 meses (multa em dobro)

### Score de Risco Trabalhista
- Combina quantidade e severidade das anomalias
- Peso maior para críticas (25 pts) e altas (10 pts)
- Normalizado para escala 0-100

### Recomendações Inteligentes
- **CRITICAL (80-100)**: "Ação Imediata Necessária - Auditoria completa recomendada"
- **HIGH (51-80)**: "Atenção Alta - Revisar eventos críticos"
- **MEDIUM (21-50)**: "Monitoramento - Acompanhar tendências"
- **LOW (0-20)**: "Manter Rotina - Compliance dentro dos padrões"

## 🧪 Como Testar

### 1. Testar API Backend
```bash
# Dashboard completo
curl http://localhost:8080/api/analytics/dashboard

# Apenas score
curl http://localhost:8080/api/analytics/score

# Listar anomalias filtradas
curl "http://localhost:8080/api/analytics/anomalies?severity=CRITICAL"
```

### 2. Testar Frontend
1. Acesse `http://localhost:3000/analytics`
2. Observe o gráfico de gauge carregando
3. Verifique se as anomalias simuladas aparecem na lista
4. Valide se as cores mudam conforme a classificação

## 📁 Arquivos Criados (8 totais)

| Localização | Arquivo | Descrição |
|-------------|---------|-----------|
| Backend | `AnomalyDetectionService.java` | Motor Z-Score |
| Backend | `AnomalyResultDTO.java` | DTO de resultado |
| Backend | `RiskScoreCalculator.java` | Calculadora de score |
| Backend | `AnalyticsController.java` | API REST |
| Frontend | `analytics/page.jsx` | Página principal |
| Frontend | `RiskGaugeChart.jsx` | Componente de gauge |
| Frontend | `AnomaliesList.jsx` | Lista de anomalias |
| Docs | `FASE_14_ANALYTICS_PREDITIVO.md` | Este documento |

## 💡 Cenários de Uso Real

### Cenário 1: Prevenção de Processo por Horas Extras
**Situação**: Funcionário trabalha 3h extras/dia há 6 meses.
**Detecção**: Sistema alerta "EXCESSO_HORAS_EXTRAS" com severidade CRITICAL.
**Ação**: RH investiga e corrige banco de horas antes de processo.

### Cenário 2: Salário Discriminatório
**Situação**: Dois funcionários no mesmo cargo com diferença salarial de 300%.
**Detecção**: Z-Score identifica outlier como "SALARIO_ATIPICO".
**Ação**: Empresa revisa política salarial para evitar ação por discriminação.

### Cenário 3: Férias Vencidas
**Situação**: Colaborador não tira férias há 26 meses.
**Detecção**: Alerta "FERIAS_VENCIDAS" com risco de multa em dobro.
**Ação**: RH agenda férias urgentemente.

## 🚀 Próximos Passos Sugeridos

1. **Integração com Banco de Dados**: Substituir dados simulados por consultas reais aos eventos
2. **Machine Learning**: Treinar modelo com dados históricos para melhorar precisão
3. **Agendamento**: Rodar análise automaticamente todo dia 25 de cada mês
4. **Alertas por Email**: Enviar relatório semanal para gestores

## 🏆 Diferencial Competitivo

Esta funcionalidade transforma o eSocial-JT de um simples "transmissor de eventos" para um **consultor preventivo de RH**, economizando potencialmente milhões em passivos trabalhistas para os clientes.

---

**Status**: ✅ IMPLEMENTADO FISICAMENTE  
**Próxima Fase**: Fase 15 - Marketplace de Conectores (Low-Code)
