# Fase 12: Safe Mode Simulator - Cálculo de Impostos e Pré-DCTFWeb

## 🎯 Objetivo
Criar um ambiente de "sandbox financeiro" que calcula todos os impostos da folha (INSS, IRRF, FGTS, RAT/FAP) antes do envio oficial ao eSocial, permitindo simulação de cenários e prevenção de erros na DCTFWeb.

## ✅ Implementação Física Realizada

### Backend (Java/Spring Boot)

#### 1. `CalculadoraTributosService.java`
- **Localização**: `src/esocial-jt-service/src/main/java/br/jus/tst/esocialjt/simulator/`
- **Funcionalidades**:
  - Cálculo progressivo de INSS (7.5%, 9%, 12%, 14%) com teto R$ 7.786,02
  - Cálculo de IRRF com deduções por dependente (R$ 189,59)
  - Cálculo de FGTS (8%)
  - Estimativa de INSS Patronal (20% + FAP)
  - Detecção automática de anomalias (ex: IRRF zerado em salário alto)

#### 2. `RubricaSimulacaoDTO.java`
- DTO de entrada para rubricas da folha
- Campos: código, descrição, valor, tipo, flags de composição de base

#### 3. `SimulacaoSaidaDTO.java`
- DTO de saída com resultados completos
- Campos: totais de impostos, líquido, DCTFWeb estimada, lista de alertas

#### 4. `SimuladorController.java`
- **Endpoints REST**:
  - `POST /api/simulador/apuracao`: Simula apuração com base nas rubricas
  - `GET /api/simulador/tabelas-vigentes`: Retorna alíquotas atuais
  - `GET /api/simulador/exemplo`: Retorna simulação com dados fictícios para teste

### Frontend (React/Material UI)

#### 1. `page.jsx` (Página do Simulador)
- **Localização**: `frontend/src/app/simulador/`
- Interface principal com layout em duas colunas (entrada vs resultados)
- Estado para rubricas dinâmicas e resultados

#### 2. `RubricaInputTable.jsx`
- Tabela editável para inserção de rubricas
- Campos: código, descrição, valor, checkboxes para bases INSS/IRRF
- Botão de remover linha

#### 3. `ResultadoCards.jsx`
- Cards visuais coloridos para cada imposto
- Exibição formatada em BRL (R$)
- Destaque especial para DCTFWeb estimada

## 💡 Cenários de Uso

### Cenário 1: Conferência de Folha Mensal
Antes de fechar a folha, o contador lança os totais no simulador. Se o valor da DCTFWeb estimada bater com o sistema de folha, ele envia. Se não, investiga a divergência.

### Cenário 2: Simulação de Reajuste Salarial
"Se eu der 5% de aumento para todos, qual o impacto real no custo da empresa?"
O simulador responde em segundos considerando reflexos em encargos.

### Cenário 3: Validação de Rescisão
Simula uma rescisão complexa com aviso prévio indenizado e férias proporcionais para validar valores antes de gerar o evento S-2299.

## 🧪 Como Testar

### Via API (cURL)
```bash
curl -X POST "http://localhost:8080/api/simulador/apuracao?competencia=2024-01" \
  -H "Content-Type: application/json" \
  -d '[
    {"codigo":"SAL001","descricao":"Salário Base","valor":3000.00,"tipo":"SALARIO","compoeBaseINSS":true,"compoeBaseIRRF":true},
    {"codigo":"HE001","descricao":"Horas Extras","valor":500.00,"tipo":"PROVENTO","compoeBaseINSS":true,"compoeBaseIRRF":true}
  ]'
```

### Via Frontend
1. Acesse `http://localhost:3000/simulador`
2. Adicione/remova rubricas na tabela
3. Clique em "Simular Apuração"
4. Visualize os cards com valores de INSS, IRRF, FGTS e DCTFWeb
5. Verifique alertas de anomalia se houver

## 📊 Fórmulas Implementadas

### INSS Empregado (Progressivo)
- Faixa 1: 7.5% sobre até R$ 1.412,00
- Faixa 2: 9% sobre R$ 1.412,01 a R$ 2.666,68
- Faixa 3: 12% sobre R$ 2.666,69 a R$ 4.000,03
- Faixa 4: 14% sobre R$ 4.000,04 a R$ 7.786,02 (teto)

### IRRF
- Base de cálculo = Salário Bruto - INSS - (R$ 189,59 x Nº Dependentes)
- Alíquotas: 0%, 7.5%, 15%, 22.5%, 27.5% conforme faixa
- Parcela a deduzir aplicada automaticamente

### DCTFWeb Estimada
```
DCTFWeb = INSS (Empresa + Empregado) + IRRF + FGTS
```

## 🚀 Próximos Passos
- [ ] Integrar com eventos reais do eSocial (S-1200, S-5010) para puxar rubricas automaticamente
- [ ] Adicionar cálculo de Terceiros e Salário Família detalhado
- [ ] Exportar resultado da simulação para PDF
- [ ] Comparativo mês a mês (Delta Analysis)

## 📁 Arquivos Criados
1. `src/esocial-jt-service/src/main/java/br/jus/tst/esocialjt/simulator/CalculadoraTributosService.java`
2. `src/esocial-jt-service/src/main/java/br/jus/tst/esocialjt/simulator/RubricaSimulacaoDTO.java`
3. `src/esocial-jt-service/src/main/java/br/jus/tst/esocialjt/simulator/SimulacaoSaidaDTO.java`
4. `src/esocial-jt-service/src/main/java/br/jus/tst/esocialjt/simulator/SimuladorController.java`
5. `frontend/src/app/simulador/page.jsx`
6. `frontend/src/components/simulator/RubricaInputTable.jsx`
7. `frontend/src/components/simulator/ResultadoCards.jsx`

**Status**: ✅ Implementado e Pronto para Testes
