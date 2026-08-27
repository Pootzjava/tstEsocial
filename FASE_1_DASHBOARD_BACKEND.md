# 📋 FASE 1: Dashboard Backend com Dados Reais

## 🎯 Objetivo
Completar a implementação do método `calcularTotaisApuracao()` no `DashboardServico` para retornar dados reais da tabela `apuracao_esocial`, em vez de zeros.

## ✅ Critérios de Aceite
- [ ] Método `calcularTotaisApuracao()` retorna valores reais do banco
- [ ] Teste unitário valida cálculo dos totais
- [ ] Endpoint `/dashboard` retorna valores não-nulos quando há dados
- [ ] Logs mostram valores calculados corretamente

## 📝 Tarefas

### 1. Verificar se há dados na tabela apuracao_esocial
```bash
# Conectar no banco e verificar
psql -U postgres -d esocialjt -c "SELECT COUNT(*) FROM apuracao_esocial;"
```

### 2. Ajustar método calcularTotaisApuracao()
**Arquivo:** `/workspace/src/esocial-jt-service/src/main/java/br/jus/tst/esocialjt/dashboard/DashboardServico.java`

O método já está implementado (linhas 236-283), mas precisamos garantir que:
- A query `buscarTotaisPorCompetencia` está sendo chamada corretamente
- Os valores estão sendo somados corretamente
- O log mostra os valores calculados

### 3. Criar teste unitário
**Arquivo:** `/workspace/src/esocial-jt-service/src/test/java/br/jus/tst/esocialjt/dashboard/DashboardServicoTest.java`

### 4. Executar testes
```bash
cd /workspace/src/esocial-jt-service
mvn test -Dtest=DashboardServicoTest
```

### 5. Validar endpoint manualmente
```bash
curl -H "X-Tenant-ID: seu-cnpj" http://localhost:8080/dashboard | jq
```

## 🔍 Pontos de Atenção
1. **TenantContext**: Garantir que o tenant está definido antes de chamar o serviço
2. **Periodo**: O método usa últimos 12 meses por padrão
3. **Null Safety**: Valores null devem ser tratados como zero

## 🚀 Resultado Esperado
Ao acessar `/dashboard`, o JSON deve conter:
```json
{
  "valorTotalFGTS": 12345.67,
  "valorTotalIRRF": 8901.23,
  "valorTotalContribuicaoPrevidenciaria": 15678.90,
  "totalRetornosS5010": 5,
  "totalRetornosS5020": 3
}
```

## ⏱️ Duração Estimada
2-3 dias

## 📌 Dependências
- Tabela `apuracao_esocial` populada (via parser S-5010/S-5020)
- Tenant configurado no contexto

---

**Próxima Fase:** Fase 2 - Implementação de Cache Caffeine
