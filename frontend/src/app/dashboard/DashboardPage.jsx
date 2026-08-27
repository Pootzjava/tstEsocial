import React, { useState } from 'react';
import { Container, Typography, Box, Alert } from '@mui/material';
import { useDashboardTotais, useDashboardHistoricoApuracao, useUltimosEventos } from '../../api/ESocialJTServiceApi';
import DashboardKpiCards from './DashboardKpiCards';
import DashboardCharts from './DashboardCharts';
import UltimosEventosTable from './UltimosEventosTable';
import PeriodoFiltro from '../../components/dashboard/PeriodoFiltro';
import DashboardHeader from '../../components/dashboard/DashboardHeader';
import useDarkMode from '../../hooks/useDarkMode';

const DashboardPage = () => {
  const { darkMode, toggleDarkMode } = useDarkMode();
  const [periodoInicio, setPeriodoInicio] = useState(null);
  const [periodoFim, setPeriodoFim] = useState(null);
  
  const { data: totais, isLoading: loadingTotais, error: errorTotais } = useDashboardTotais();
  const { data: historico, isLoading: loadingHistorico, error: errorHistorico } = useDashboardHistoricoApuracao(periodoInicio, periodoFim);
  const { data: ultimosEventosData, isLoading: loadingEventos, error: errorEventos } = useUltimosEventos(0, periodoInicio, periodoFim);
  
  // Extrair lista de eventos da resposta paginada
  const ultimosEventos = ultimosEventosData?.content || [];
  
  const handleApplyFilter = (inicio, fim) => {
    setPeriodoInicio(inicio);
    setPeriodoFim(fim);
  };

  const handleExportCSV = () => {
    if (!ultimosEventos || ultimosEventos.length === 0) return;

    const headers = ['Data/Hora', 'Tipo Evento', 'Documento', 'Status', 'Lote'];
    const rows = ultimosEventos.map(evento => [
      evento.dataHoraOcorrencia || '',
      evento.tipoEvento || '',
      evento.cpfCnpjTrabalhador || evento.cpfCnpjEmpresa || '',
      evento.estado || '',
      evento.numeroLote || ''
    ]);

    const csvContent = [
      headers.join(';'),
      ...rows.map(row => row.map(cell => `"${cell}"`).join(';'))
    ].join('\n');

    const blob = new Blob([csvContent], { type: 'text/csv;charset=utf-8;' });
    const link = document.createElement('a');
    const url = URL.createObjectURL(blob);
    link.setAttribute('href', url);
    link.setAttribute('download', `eventos_esocial_${new Date().toISOString().split('T')[0]}.csv`);
    link.style.visibility = 'hidden';
    document.body.appendChild(link);
    link.click();
    document.body.removeChild(link);
  };
  
  return (
    <Container maxWidth="xl" sx={{ mt: 4, mb: 4 }}>
      <DashboardHeader 
        darkMode={darkMode}
        onToggleDarkMode={toggleDarkMode}
        onExportCSV={handleExportCSV}
      />
      
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

      {/* Filtros de Período */}
      <Box mt={4}>
        <Typography variant="h6" gutterBottom>
          📅 Filtrar por Período
        </Typography>
        <PeriodoFiltro 
          periodoInicio={periodoInicio}
          periodoFim={periodoFim}
          onApply={handleApplyFilter}
        />
      </Box>

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
