'use client';

import { useEffect, useState } from 'react';
import { Card, CardContent, Typography, Grid, Box, Chip, Alert, AlertTitle } from '@mui/material';
import { TrendingUp, Warning, CheckCircle, Error as ErrorIcon } from '@mui/icons-material';
import RiskGaugeChart from '@/components/analytics/RiskGaugeChart';
import AnomaliesList from '@/components/analytics/AnomaliesList';

export default function AnalyticsPage() {
  const [dashboardData, setDashboardData] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    async function fetchAnalytics() {
      try {
        const response = await fetch('http://localhost:8080/api/analytics/dashboard');
        const data = await response.json();
        setDashboardData(data);
      } catch (error) {
        console.error('Erro ao buscar analytics:', error);
      } finally {
        setLoading(false);
      }
    }

    fetchAnalytics();
  }, []);

  if (loading) {
    return <Typography>Carregando análise preditiva...</Typography>;
  }

  if (!dashboardData) {
    return <Alert severity="error">Erro ao carregar dados de analytics.</Alert>;
  }

  const getSeverityColor = (classification) => {
    switch (classification) {
      case 'LOW': return 'success';
      case 'MEDIUM': return 'warning';
      case 'HIGH': return 'error';
      case 'CRITICAL': return 'error';
      default: return 'default';
    }
  };

  const getSeverityIcon = (classification) => {
    switch (classification) {
      case 'LOW': return <CheckCircle />;
      case 'MEDIUM': return <TrendingUp />;
      case 'HIGH': return <Warning />;
      case 'CRITICAL': return <ErrorIcon />;
      default: return <TrendingUp />;
    }
  };

  return (
    <Box sx={{ p: 3 }}>
      <Typography variant="h4" gutterBottom sx={{ mb: 4 }}>
        Analytics Preditivo - Risco Trabalhista
      </Typography>

      {/* Score de Risco Principal */}
      <Grid container spacing={3} sx={{ mb: 4 }}>
        <Grid item xs={12} md={6}>
          <Card>
            <CardContent sx={{ textAlign: 'center', p: 4 }}>
              <Typography variant="h6" color="text.secondary" gutterBottom>
                Score de Risco Atual
              </Typography>
              <RiskGaugeChart 
                value={dashboardData.riskScore} 
                classification={dashboardData.classification}
              />
              <Chip 
                icon={getSeverityIcon(dashboardData.classification)}
                label={`Risco ${dashboardData.classification}`}
                color={getSeverityColor(dashboardData.classification)}
                sx={{ mt: 2, fontSize: '1rem', px: 2, py: 2 }}
              />
            </CardContent>
          </Card>
        </Grid>

        <Grid item xs={12} md={6}>
          <Card sx={{ height: '100%' }}>
            <CardContent>
              <Typography variant="h6" gutterBottom>
                Recomendações
              </Typography>
              <Alert 
                severity={getSeverityColor(dashboardData.classification)}
                sx={{ mb: 2 }}
              >
                <AlertTitle>{dashboardData.recommendations.action}</AlertTitle>
                {dashboardData.recommendations.detail}
              </Alert>
              
              <Box sx={{ mt: 3 }}>
                <Typography variant="body2" color="text.secondary">
                  Total de Anomalias Detectadas: <strong>{dashboardData.totalAnomalies}</strong>
                </Typography>
                <Typography variant="body2" color="text.secondary">
                  Última Atualização: {new Date(dashboardData.generatedAt).toLocaleString()}
                </Typography>
              </Box>
            </CardContent>
          </Card>
        </Grid>
      </Grid>

      {/* Lista de Anomalias */}
      <Card>
        <CardContent>
          <Typography variant="h6" gutterBottom sx={{ mb: 3 }}>
            Anomalias Detectadas
          </Typography>
          <AnomaliesList anomalies={dashboardData.anomalies} />
        </CardContent>
      </Card>
    </Box>
  );
}
