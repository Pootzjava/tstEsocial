import React from 'react';
import { 
  Table, 
  TableBody, 
  TableCell, 
  TableContainer, 
  TableHead, 
  TableRow, 
  Paper, 
  Chip, 
  Typography,
  Box,
  CircularProgress
} from '@mui/material';
import { format } from 'date-fns';
import { ptBR } from 'date-fns/locale';

// Mapeamento de estados para cores
const estadoColorMap = {
  'PROCESSADO_COM_SUCESSO': 'success',
  'ERRO': 'error',
  'EM_PROCESSAMENTO': 'warning',
  'AGUARDANDO_PROCESSAMENTO': 'default',
  'CANCELADO': 'default'
};

const UltimosEventosTable = ({ data = [], loading = false }) => {
  if (loading) {
    return (
      <Box display="flex" justifyContent="center" alignItems="center" minHeight="200px">
        <CircularProgress />
      </Box>
    );
  }

  if (!data || data.length === 0) {
    return (
      <Box p={3} textAlign="center">
        <Typography variant="body1" color="textSecondary">
          Nenhum evento encontrado
        </Typography>
      </Box>
    );
  }

  // Pegar apenas os últimos 10 eventos
  const ultimosEventos = data.slice(0, 10);

  return (
    <TableContainer component={Paper} sx={{ mt: 2 }}>
      <Table size="small" aria-label="últimos eventos processados">
        <TableHead>
          <TableRow>
            <TableCell><strong>ID</strong></TableCell>
            <TableCell><strong>Tipo Evento</strong></TableCell>
            <TableCell><strong>Competência</strong></TableCell>
            <TableCell><strong>Estado</strong></TableCell>
            <TableCell><strong>Data Processamento</strong></TableCell>
            <TableCell><strong>Número Lote</strong></TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {ultimosEventos.map((evento) => (
            <TableRow 
              key={evento.id} 
              hover
              sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
            >
              <TableCell>{evento.id}</TableCell>
              <TableCell>
                <Typography variant="body2" fontWeight="medium">
                  {evento.tipoEvento}
                </Typography>
              </TableCell>
              <TableCell>
                {evento.competencia 
                  ? format(new Date(evento.competencia), 'MM/yyyy', { locale: ptBR })
                  : 'N/A'}
              </TableCell>
              <TableCell>
                <Chip 
                  label={evento.estado} 
                  color={estadoColorMap[evento.estado] || 'default'}
                  size="small"
                  variant="outlined"
                />
              </TableCell>
              <TableCell>
                {evento.dataProcessamento 
                  ? format(new Date(evento.dataProcessamento), 'dd/MM/yyyy HH:mm', { locale: ptBR })
                  : 'Pendente'}
              </TableCell>
              <TableCell>{evento.numeroLote || '-'}</TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
  );
};

export default UltimosEventosTable;
