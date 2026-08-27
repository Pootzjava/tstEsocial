import React from 'react';
import { Container, Typography, Box, Alert } from '@mui/material';
import { useDashboardTotais, useDashboardHistoricoApuracao, useUltimosEventos } from '../../api/ESocialJTServiceApi';
import DashboardKpiCards from './DashboardKpiCards';
import DashboardCharts from './DashboardCharts';
import UltimosEventosTable from './UltimosEventosTable';

const DashboardPage = () => {
  const { data: totais, isLoading: loadingTotais, error: errorTotais } = useDashboardTotais();
  const { data: historico, isLoading: loadingHistorico, error: errorHistorico } = useDashboardHistoricoApuracao();
  const { data: ultimosEventosData, isLoading: loadingEventos, error: errorEventos } = useUltimosEventos();
  
  // Extrair lista de eventos da resposta paginada
  const ultimosEventos = ultimosEventosData?.content || [];
  
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

      {errorTotais && (
        <Alert severity="error" sx={{ mb: 3 }}>
          Erro ao carregar totais: {errorTotais.message}
        </Alert>
      )}

      <DashboardKpiCards data={totais} loading={loadingTotais} />

      {/* Gráficos */}
      <Box mt={4}>
        <Typography variant="h6" gutterBottom>
          📈 Histórico e Distribuição
        </Typography>
        <DashboardCharts 
          historicoData={historico} 
          loading={loadingHistorico} 
          error={errorHistorico}
        />
      </Box>

      {/* Últimos Eventos */}
      <Box mt={4}>
        <Typography variant="h6" gutterBottom>
          📋 Últimos Eventos Processados
        </Typography>
        <UltimosEventosTable 
          data={ultimosEventos} 
          loading={loadingEventos} 
        />
      </Box>
    </Container>
  );
};

export default DashboardPage;
