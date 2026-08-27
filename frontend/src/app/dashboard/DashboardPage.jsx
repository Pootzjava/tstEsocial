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
