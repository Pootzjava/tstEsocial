'use client';

import { useState, useEffect } from 'react';
import {
  Box,
  Typography,
  Table,
  TableBody,
  TableCell,
  TableContainer,
  TableHead,
  TableRow,
  Paper,
  Chip,
  TextField,
  Button,
  Grid,
  CircularProgress,
  Alert,
  IconButton,
  Tooltip,
} from '@mui/material';
import { DatePicker } from '@mui/x-date-pickers/DatePicker';
import { LocalizationProvider } from '@mui/x-date-pickers/LocalizationProvider';
import { AdapterDateFns } from '@mui/x-date-pickers/AdapterDateFns';
import ptBR from 'date-fns/locale/pt-BR';
import RefreshIcon from '@mui/icons-material/Refresh';
import FilterListIcon from '@mui/icons-material/FilterList';
import DownloadIcon from '@mui/icons-material/Download';
import VisibilityIcon from '@mui/icons-material/Visibility';

const API_URL = process.env.NEXT_PUBLIC_API_URL || 'http://localhost:8080';

export default function AuditoriaPage() {
  const [logs, setLogs] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);
  
  // Filtros
  const [usuario, setUsuario] = useState('');
  const [acao, setAcao] = useState('');
  const [entidade, setEntidade] = useState('');
  const [dataInicio, setDataInicio] = useState(null);
  const [dataFim, setDataFim] = useState(null);

  const acoesLabels = {
    CRIAR: 'Criar',
    ATUALIZAR: 'Atualizar',
    EXCLUIR: 'Excluir',
    CONSULTAR: 'Consultar',
    EXPORTAR: 'Exportar',
    ENVIAR_LOTE: 'Enviar Lote',
    RECEBER_RETORNO: 'Receber Retorno',
    LOGIN: 'Login',
    LOGOUT: 'Logout',
    VALIDAR_FOLHA: 'Validar Folha',
  };

  const coresAcao = {
    CRIAR: 'success',
    ATUALIZAR: 'info',
    EXCLUIR: 'error',
    CONSULTAR: 'default',
    EXPORTAR: 'secondary',
    ENVIAR_LOTE: 'warning',
    RECEBER_RETORNO: 'primary',
    LOGIN: 'success',
    LOGOUT: 'default',
    VALIDAR_FOLHA: 'warning',
  };

  useEffect(() => {
    buscarLogs();
  }, []);

  const buscarLogs = async () => {
    setLoading(true);
    setError(null);
    
    try {
      const params = new URLSearchParams();
      if (usuario) params.append('usuario', usuario);
      if (acao) params.append('acao', acao);
      if (entidade) params.append('entidade', entidade);
      if (dataInicio) params.append('inicio', dataInicio.toISOString());
      if (dataFim) params.append('fim', dataFim.toISOString());

      const response = await fetch(`${API_URL}/api/auditoria/logs?${params.toString()}`, {
        headers: {
          'Content-Type': 'application/json',
          'X-Tenant-ID': localStorage.getItem('tenantId') || 'default',
        },
      });

      if (!response.ok) {
        if (response.status === 403) {
          throw new Error('Você não tem permissão para acessar esta página.');
        }
        throw new Error('Falha ao carregar logs de auditoria');
      }

      const dados = await response.json();
      setLogs(dados);
    } catch (err) {
      setError(err.message);
      setLogs([]);
    } finally {
      setLoading(false);
    }
  };

  const aplicarFiltros = () => {
    buscarLogs();
  };

  const limparFiltros = () => {
    setUsuario('');
    setAcao('');
    setEntidade('');
    setDataInicio(null);
    setDataFim(null);
    setTimeout(buscarLogs, 100);
  };

  const exportarCSV = () => {
    if (logs.length === 0) return;

    const headers = ['ID', 'Usuário', 'Ação', 'Entidade', 'ID Entidade', 'Data/Hora', 'IP'];
    const csvContent = [
      headers.join(';'),
      ...logs.map(log => 
        [
          log.id,
          log.usuario,
          log.acao,
          log.entidade,
          log.entidadeId || '-',
          new Date(log.timestamp).toLocaleString('pt-BR'),
          log.ipOrigem
        ].join(';')
      )
    ].join('\n');

    const blob = new Blob([csvContent], { type: 'text/csv;charset=utf-8;' });
    const url = URL.createObjectURL(blob);
    const link = document.createElement('a');
    link.href = url;
    link.setAttribute('download', `auditoria_${new Date().toISOString().split('T')[0]}.csv`);
    document.body.appendChild(link);
    link.click();
    document.body.removeChild(link);
  };

  const formatarDadosJSON = (jsonStr) => {
    if (!jsonStr) return '-';
    try {
      const obj = JSON.parse(jsonStr);
      return JSON.stringify(obj, null, 2);
    } catch {
      return jsonStr;
    }
  };

  if (loading) {
    return (
      <Box display="flex" justifyContent="center" alignItems="center" minHeight="400px">
        <CircularProgress />
      </Box>
    );
  }

  return (
    <LocalizationProvider dateAdapter={AdapterDateFns} locale={ptBR}>
      <Box sx={{ p: 3 }}>
        <Typography variant="h4" gutterBottom fontWeight="bold">
          🔍 Auditoria e Compliance
        </Typography>

        <Alert severity="info" sx={{ mb: 3 }}>
          Registra todas as ações dos usuários no sistema para fins de auditoria e conformidade com LGPD.
        </Alert>

        {/* Filtros */}
        <Paper sx={{ p: 3, mb: 3 }}>
          <Grid container spacing={2} alignItems="flex-end">
            <Grid item xs={12} sm={6} md={2}>
              <TextField
                fullWidth
                size="small"
                label="Usuário"
                value={usuario}
                onChange={(e) => setUsuario(e.target.value)}
                placeholder="Buscar por usuário"
              />
            </Grid>

            <Grid item xs={12} sm={6} md={2}>
              <TextField
                fullWidth
                size="small"
                select
                label="Ação"
                value={acao}
                onChange={(e) => setAcao(e.target.value)}
                SelectProps={{ native: true }}
              >
                <option value="">Todas</option>
                {Object.entries(acoesLabels).map(([key, label]) => (
                  <option key={key} value={key}>{label}</option>
                ))}
              </TextField>
            </Grid>

            <Grid item xs={12} sm={6} md={2}>
              <TextField
                fullWidth
                size="small"
                label="Entidade"
                value={entidade}
                onChange={(e) => setEntidade(e.target.value)}
                placeholder="Ex: Evento"
              />
            </Grid>

            <Grid item xs={12} sm={6} md={2}>
              <DatePicker
                label="De"
                value={dataInicio}
                onChange={setDataInicio}
                slotProps={{ textField: { fullWidth: true, size: 'small' } }}
              />
            </Grid>

            <Grid item xs={12} sm={6} md={2}>
              <DatePicker
                label="Até"
                value={dataFim}
                onChange={setDataFim}
                slotProps={{ textField: { fullWidth: true, size: 'small' } }}
              />
            </Grid>

            <Grid item xs={12} sm={6} md={2} display="flex" gap={1}>
              <Tooltip title="Aplicar Filtros">
                <IconButton color="primary" onClick={aplicarFiltros} size="large">
                  <FilterListIcon />
                </IconButton>
              </Tooltip>
              <Tooltip title="Limpar Filtros">
                <IconButton color="secondary" onClick={limparFiltros} size="large">
                  <RefreshIcon />
                </IconButton>
              </Tooltip>
              <Tooltip title="Exportar CSV">
                <IconButton color="success" onClick={exportarCSV} size="large">
                  <DownloadIcon />
                </IconButton>
              </Tooltip>
            </Grid>
          </Grid>
        </Paper>

        {/* Tabela de Logs */}
        {error && (
          <Alert severity="error" sx={{ mb: 3 }}>
            {error}
          </Alert>
        )}

        {!error && logs.length === 0 && (
          <Alert severity="warning">
            Nenhum registro de auditoria encontrado para os filtros selecionados.
          </Alert>
        )}

        {logs.length > 0 && (
          <TableContainer component={Paper}>
            <Table size="small">
              <TableHead>
                <TableRow>
                  <TableCell><strong>ID</strong></TableCell>
                  <TableCell><strong>Data/Hora</strong></TableCell>
                  <TableCell><strong>Usuário</strong></TableCell>
                  <TableCell><strong>Ação</strong></TableCell>
                  <TableCell><strong>Entidade</strong></TableCell>
                  <TableCell><strong>ID Entidade</strong></TableCell>
                  <TableCell><strong>IP Origem</strong></TableCell>
                  <TableCell align="center"><strong>Ações</strong></TableCell>
                </TableRow>
              </TableHead>
              <TableBody>
                {logs.map((log) => (
                  <TableRow key={log.id} hover>
                    <TableCell>{log.id}</TableCell>
                    <TableCell>
                      {new Date(log.timestamp).toLocaleString('pt-BR')}
                    </TableCell>
                    <TableCell>{log.usuario}</TableCell>
                    <TableCell>
                      <Chip
                        label={acoesLabels[log.acao] || log.acao}
                        color={coresAcao[log.acao] || 'default'}
                        size="small"
                        variant="outlined"
                      />
                    </TableCell>
                    <TableCell>{log.entidade}</TableCell>
                    <TableCell>{log.entidadeId || '-'}</TableCell>
                    <TableCell>{log.ipOrigem}</TableCell>
                    <TableCell align="center">
                      <Tooltip title="Ver Detalhes">
                        <IconButton size="small" color="primary">
                          <VisibilityIcon />
                        </IconButton>
                      </Tooltip>
                    </TableCell>
                  </TableRow>
                ))}
              </TableBody>
            </Table>
          </TableContainer>
        )}

        <Box mt={2} textAlign="right" color="text.secondary" fontSize="0.875rem">
          Total: {logs.length} registro(s)
        </Box>
      </Box>
    </LocalizationProvider>
  );
}
