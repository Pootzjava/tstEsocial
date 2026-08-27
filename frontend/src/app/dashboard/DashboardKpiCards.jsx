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
