# 📊 FASE 4 - DASHBOARD FRONTEND (Cards KPI)

## 🎯 Objetivo
Criar página de Dashboard no frontend com cards de KPIs em tempo real, consumindo a API do backend implementada na Fase 1.

## ✅ Critérios de Aceite
- [ ] Cards exibindo: Total Eventos, Sucesso, Erro, Pendentes, Taxa Sucesso (%)
- [ ] Atualização automática a cada 5 segundos
- [ ] Design responsivo e moderno (Material UI)
- [ ] Loading states e tratamento de erro
- [ ] Rota `/dashboard` acessível

## 📁 Arquivos a Criar/Modificar

### 1. Hook React para API do Dashboard
**Arquivo:** `/workspace/frontend/src/api/ESocialJTServiceApi.js`
**Ação:** Adicionar hooks para buscar dados do dashboard

### 2. Componente DashboardPage
**Arquivo:** `/workspace/frontend/src/app/dashboard/DashboardPage.jsx`
**Ação:** Criar página principal do dashboard

### 3. Componente DashboardKpiCards
**Arquivo:** `/workspace/frontend/src/app/dashboard/DashboardKpiCards.jsx`
**Ação:** Criar componente de cards de KPI

### 4. Rotas
**Arquivo:** `/workspace/frontend/src/app/Routes.jsx`
**Ação:** Adicionar rota `/dashboard`

### 5. Menu/Navegação
**Ação:** Adicionar link para dashboard no menu principal (se existir)

## 🔧 Passo a Passo

### Passo 1: Adicionar Hooks da API

Adicionar ao arquivo `ESocialJTServiceApi.js`:

```javascript
// Adicionar após as imports
export function useDashboardTotais() {
  return useQuery(`/dashboard/totais`, queryFetcher, {
    refetchInterval: REFRESH_INTERVAL,
    enabled: true
  });
}

export function useDashboardHistoricoApuracao() {
  return useQuery(`/dashboard/historico-apuracao`, queryFetcher, {
    refetchInterval: REFRESH_INTERVAL * 2, // 10 segundos
    enabled: true
  });
}
```

### Passo 2: Criar Estrutura de Diretórios

```bash
mkdir -p /workspace/frontend/src/app/dashboard
```

### Passo 3: Criar Componente DashboardKpiCards.jsx

```jsx
import React from 'react';
import { Grid, Paper, Typography, Box, CircularProgress } from '@mui/material';
import { green, red, orange, blue } from '@mui/material/colors';

const KpiCard = ({ title, value, color, icon }) => (
  <Paper 
    elevation={3} 
    sx={{ 
      p: 3, 
      textAlign: 'center',
      borderLeft: `5px solid ${color}`,
      transition: 'transform 0.2s',
      '&:hover': {
        transform: 'translateY(-4px)'
      }
    }}
  >
    <Typography variant="h6" color="textSecondary" gutterBottom>
      {title}
    </Typography>
    <Typography 
      variant="h3" 
      sx={{ color, fontWeight: 'bold' }}
    >
      {value}
    </Typography>
  </Paper>
);

const DashboardKpiCards = ({ data, loading }) => {
  if (loading) {
    return (
      <Box display="flex" justifyContent="center" alignItems="center" minHeight="200px">
        <CircularProgress />
      </Box>
    );
  }

  const kpis = [
    {
      title: 'Total de Eventos',
      value: data?.totalEventos || 0,
      color: blue[500],
      icon: '📊'
    },
    {
      title: 'Sucesso',
      value: data?.sucesso || 0,
      color: green[500],
      icon: '✅'
    },
    {
      title: 'Erro',
      value: data?.erro || 0,
      color: red[500],
      icon: '❌'
    },
    {
      title: 'Pendentes',
      value: data?.pendente || 0,
      color: orange[500],
      icon: '⏳'
    },
    {
      title: 'Taxa de Sucesso',
      value: data?.taxaSucesso ? `${data.taxaSucesso.toFixed(1)}%` : '0%',
      color: blue[700],
      icon: '📈'
    }
  ];

  return (
    <Grid container spacing={3}>
      {kpis.map((kpi, index) => (
        <Grid item xs={12} sm={6} md={4} lg={2.4} key={index}>
          <KpiCard {...kpi} />
        </Grid>
      ))}
    </Grid>
  );
};

export default DashboardKpiCards;
```

### Passo 4: Criar DashboardPage.jsx

```jsx
import React from 'react';
import { Container, Typography, Box, Alert } from '@mui/material';
import { useDashboardTotais } from '../../api/ESocialJTServiceApi';
import DashboardKpiCards from './DashboardKpiCards';

const DashboardPage = () => {
  const { data, isLoading, error } = useDashboardTotais();

  return (
    <Container maxWidth="xl" sx={{ mt: 4, mb: 4 }}>
      <Box mb={4}>
        <Typography variant="h4" component="h1" gutterBottom>
          📊 Dashboard eSocial-JT
        </Typography>
        <Typography variant="subtitle1" color="textSecondary">
          Acompanhamento em tempo real dos eventos do eSocial
        </Typography>
      </Box>

      {error && (
        <Alert severity="error" sx={{ mb: 3 }}>
          Erro ao carregar dados do dashboard: {error.message}
        </Alert>
      )}

      <DashboardKpiCards data={data} loading={isLoading} />

      {/* TODO: Adicionar gráfico de histórico na Fase 4.2 */}
      <Box mt={4}>
        <Typography variant="h6" gutterBottom>
          📈 Histórico de Apuração
        </Typography>
        <Alert severity="info">
          Gráfico de histórico será implementado na próxima iteração
        </Alert>
      </Box>
    </Container>
  );
};

export default DashboardPage;
```

### Passo 5: Atualizar Rotas

Editar `/workspace/frontend/src/app/Routes.jsx`:

```jsx
import React from "react";
import { Route, Routes as Switch } from "react-router-dom";
import NotFound from "./error/NotFound";
import EventoDetalhePage from "./eventos-detalhes/EventoDetalhePage";
import EventosPage from "./eventos/EventosPage";
import DashboardPage from "./dashboard/DashboardPage"; // Nova importação

function Routes() {
  return (
    <Switch>
      <Route path="/" element={<DashboardPage />} /> {/* Dashboard como home */}
      <Route path="/dashboard" element={<DashboardPage />} />
      <Route path="/eventos" element={<EventosPage />} />
      <Route path="/eventos/:id" element={<EventoDetalhePage />} />
      <Route path="*" element={<NotFound />} />
    </Switch>
  );
}

export default Routes;
```

### Passo 6: Verificar Dependências

O `package.json` já possui todas as dependências necessárias:
- ✅ `@mui/material` - Componentes Material UI
- ✅ `react-query` - Gerenciamento de estado assíncrono
- ✅ `react-router-dom` - Roteamento

## 🧪 Testes Manuais

### Teste 1: Acessar Dashboard
```bash
cd /workspace/frontend
npm start
```
Acessar `http://localhost:3000/dashboard`

**Critérios:**
- [ ] Página carrega sem erros
- [ ] Cards exibem dados (ou zeros se não houver dados)
- [ ] Loading aparece durante carregamento
- [ ] Dados atualizam automaticamente

### Teste 2: Responsividade
- [ ] Testar em desktop (1920x1080)
- [ ] Testar em tablet (768x1024)
- [ ] Testar em mobile (375x667)

### Teste 3: Tratamento de Erro
- [ ] Parar backend temporariamente
- [ ] Verificar se mensagem de erro aparece
- [ ] Reiniciar backend e verificar recuperação automática

## 🎨 Melhorias Visuais Sugeridas

### Cores dos Cards
- **Sucesso:** Verde (#4CAF50)
- **Erro:** Vermelho (#F44336)
- **Pendente:** Laranja (#FF9800)
- **Total:** Azul (#2196F3)

### Animações
- Hover effect nos cards
- Fade-in ao carregar
- Smooth transitions

## 📝 Próximos Passos (Fase 4.2)

1. **Gráfico de Histórico** - Implementar gráfico de linha com Recharts
2. **Heatmap de Processamento** - Mostrar horários de pico
3. **Lista de Últimos Eventos** - Tabela com últimos 10 eventos
4. **Filtros de Período** - Selecionar range de datas

## ⚠️ Atenção

- Certifique-se que o backend está rodando em `http://localhost:8080`
- Verificar CORS configurado corretamente
- Dashboard consome endpoint `/dashboard/totais` da Fase 1

## ✅ Checklist Final

- [ ] Hook `useDashboardTotais()` criado
- [ ] Componente `DashboardKpiCards` criado
- [ ] Página `DashboardPage` criada
- [ ] Rota `/dashboard` configurada
- [ ] Testes manuais realizados
- [ ] Responsividade verificada
- [ ] Tratamento de erro implementado

---

**Status:** Aguardando implementação  
**Próxima Fase:** 4.2 - Gráficos e Histórico  
**Dependência:** Fase 1 (Dashboard Backend) concluída
