import React from 'react';
import { Box, Typography, Paper } from '@mui/material';
import {
  LineChart,
  Line,
  XAxis,
  YAxis,
  CartesianGrid,
  Tooltip,
  Legend,
  ResponsiveContainer,
  BarChart,
  Bar
} from 'recharts';

const DashboardCharts = ({ historicoData, totaisData }) => {
  // Transformar dados para o gráfico de histórico
  const chartData = React.useMemo(() => {
    if (!historicoData || !Array.isArray(historicoData)) return [];
    
    return historicoData.map(item => ({
      competencia: item.competencia || 'N/A',
      totalEventos: item.totalEventos || 0,
      eventosSucesso: item.eventosSucesso || 0,
      eventosErro: item.eventosErro || 0,
      valorTotal: item.valorTotal || 0
    }));
  }, [historicoData]);

  // Dados para gráfico de barras (distribuição por tipo)
  const distribuicaoTipos = React.useMemo(() => {
    if (!totaisData) return [];
    
    return [
      { name: 'Em Fila', value: totaisData.emFila || 0 },
      { name: 'Processando', value: totaisData.processando || 0 },
      { name: 'Sucesso', value: totaisData.processadoComSucesso || 0 },
      { name: 'Erro', value: totaisData.processadoComErro || 0 },
      { name: 'Excluído', value: totaisData.excluido || 0 }
    ].filter(item => item.value > 0);
  }, [totaisData]);

  if (!chartData || chartData.length === 0) {
    return (
      <Paper sx={{ p: 3, mt: 2 }}>
        <Typography variant="body2" color="textSecondary">
          Sem dados históricos disponíveis para exibição.
        </Typography>
      </Paper>
    );
  }

  return (
    <Box sx={{ mt: 3 }}>
      {/* Gráfico de Linha - Histórico de Apuração */}
      <Paper sx={{ p: 3, mb: 3 }}>
        <Typography variant="h6" gutterBottom>
          📈 Histórico de Eventos por Competência
        </Typography>
        <Box sx={{ height: 300, width: '100%' }}>
          <ResponsiveContainer>
            <LineChart data={chartData}>
              <CartesianGrid strokeDasharray="3 3" />
              <XAxis 
                dataKey="competencia" 
                label={{ value: 'Competência', position: 'insideBottom', offset: -5 }}
              />
              <YAxis 
                label={{ value: 'Quantidade', angle: -90, position: 'insideLeft' }}
              />
              <Tooltip 
                contentStyle={{ 
                  backgroundColor: 'rgba(255, 255, 255, 0.95)',
                  border: '1px solid #ccc',
                  borderRadius: '4px'
                }}
              />
              <Legend />
              <Line 
                type="monotone" 
                dataKey="totalEventos" 
                stroke="#8884d8" 
                name="Total Eventos"
                strokeWidth={2}
                dot={{ r: 4 }}
              />
              <Line 
                type="monotone" 
                dataKey="eventosSucesso" 
                stroke="#82ca9d" 
                name="Sucesso"
                strokeWidth={2}
                dot={{ r: 4 }}
              />
              <Line 
                type="monotone" 
                dataKey="eventosErro" 
                stroke="#ff7373" 
                name="Erros"
                strokeWidth={2}
                dot={{ r: 4 }}
              />
            </LineChart>
          </ResponsiveContainer>
        </Box>
      </Paper>

      {/* Gráfico de Barras - Distribuição por Estado */}
      {distribuicaoTipos.length > 0 && (
        <Paper sx={{ p: 3 }}>
          <Typography variant="h6" gutterBottom>
            📊 Distribuição de Eventos por Estado
          </Typography>
          <Box sx={{ height: 250, width: '100%' }}>
            <ResponsiveContainer>
              <BarChart data={distribuicaoTipos}>
                <CartesianGrid strokeDasharray="3 3" />
                <XAxis dataKey="name" />
                <YAxis 
                  label={{ value: 'Quantidade', angle: -90, position: 'insideLeft' }}
                />
                <Tooltip />
                <Legend />
                <Bar 
                  dataKey="value" 
                  name="Eventos" 
                  fill="#8884d8"
                  radius={[4, 4, 0, 0]}
                />
              </BarChart>
            </ResponsiveContainer>
          </Box>
        </Paper>
      )}
    </Box>
  );
};

export default DashboardCharts;
