import React from 'react';
import {
  Table,
  TableBody,
  TableCell,
  TableHead,
  TableRow,
  Chip,
  IconButton,
  Tooltip,
  Typography,
  Box,
  Skeleton,
} from '@mui/material';
import {
  Business as BusinessIcon,
  Person as PersonIcon,
  EventNote as EventNoteIcon,
  Receipt as ReceiptIcon,
  Visibility as VisibilityIcon,
  CheckCircle as CheckCircleIcon,
  Error as ErrorIcon,
  Schedule as ScheduleIcon,
  Warning as WarningIcon,
} from '@mui/icons-material';

const getStatusIcon = (status) => {
  switch (status?.toLowerCase()) {
    case 'processado_com_sucesso':
    case 'sucesso':
      return <CheckCircleIcon color="success" fontSize="small" />;
    case 'erro':
    case 'falha':
      return <ErrorIcon color="error" fontSize="small" />;
    case 'processando':
    case 'em_processamento':
      return <ScheduleIcon color="info" fontSize="small" />;
    case 'aguardando_processamento':
      return <WarningIcon color="warning" fontSize="small" />;
    default:
      return <EventNoteIcon color="action" fontSize="small" />;
  }
};

const getStatusColor = (status) => {
  switch (status?.toLowerCase()) {
    case 'processado_com_sucesso':
    case 'sucesso':
      return 'success';
    case 'erro':
    case 'falha':
      return 'error';
    case 'processando':
    case 'em_processamento':
      return 'info';
    case 'aguardando_processamento':
      return 'warning';
    default:
      return 'default';
  }
};

const getEventoIcon = (tipoEvento) => {
  if (!tipoEvento) return <EventNoteIcon />;
  
  const numero = tipoEvento.replace(/\D/g, '');
  
  if (numero.startsWith('1')) {
    return <BusinessIcon />;
  } else if (numero.startsWith('2') || numero.startsWith('3')) {
    return <PersonIcon />;
  } else if (numero.startsWith('4')) {
    return <ReceiptIcon />;
  }
  
  return <EventNoteIcon />;
};

const formatarDataHora = (data) => {
  if (!data) return '-';
  const date = new Date(data);
  return date.toLocaleString('pt-BR', {
    day: '2-digit',
    month: '2-digit',
    year: 'numeric',
    hour: '2-digit',
    minute: '2-digit',
  });
};

const formatarDocumento = (cpfCnpj) => {
  if (!cpfCnpj) return '-';
  
  const doc = cpfCnpj.replace(/\D/g, '');
  
  if (doc.length === 11) {
    return doc.replace(/(\d{3})(\d{3})(\d{3})(\d{2})/, '$1.$2.$3-$4');
  } else if (doc.length === 14) {
    return doc.replace(/(\d{2})(\d{3})(\d{3})(\d{4})(\d{2})/, '$1.$2.$3/$4-$5');
  }
  
  return cpfCnpj;
};

export function EventosRecentesTable({ eventos, loading }) {
  if (loading) {
    return (
      <Box sx={{ width: '100%', overflow: 'hidden' }}>
        <Skeleton variant="rectangular" height={40} sx={{ mb: 2 }} />
        {[...Array(5)].map((_, i) => (
          <Skeleton key={i} variant="rectangular" height={60} sx={{ mb: 1 }} />
        ))}
      </Box>
    );
  }

  if (!eventos || eventos.length === 0) {
    return (
      <Box
        sx={{
          textAlign: 'center',
          py: 6,
          color: 'text.secondary',
        }}
      >
        <EventNoteIcon sx={{ fontSize: 64, mb: 2, opacity: 0.3 }} />
        <Typography variant="h6">Nenhum evento encontrado</Typography>
        <Typography variant="body2">
          Os últimos eventos processados aparecerão aqui
        </Typography>
      </Box>
    );
  }

  return (
    <Box sx={{ width: '100%', overflow: 'auto' }}>
      <Table size="small" sx={{ minWidth: 650 }}>
        <TableHead>
          <TableRow>
            <Tooltip title="Data e hora do processamento">
              <TableCell>Data/Hora</TableCell>
            </Tooltip>
            <Tooltip title="Tipo do evento eSocial">
              <TableCell>Tipo Evento</TableCell>
            </Tooltip>
            <Tooltip title="CPF ou CNPJ do trabalhador/empresa">
              <TableCell>Documento</TableCell>
            </Tooltip>
            <Tooltip title="Status atual do evento">
              <TableCell>Status</TableCell>
            </Tooltip>
            <Tooltip title="Ações disponíveis">
              <TableCell align="right">Ações</TableCell>
            </Tooltip>
          </TableRow>
        </TableHead>
        <TableBody>
          {eventos.map((evento) => (
            <TableRow
              key={evento.id || evento.uuid}
              hover
              sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
            >
              <TableCell>
                <Tooltip title={formatarDataHora(evento.dataHoraOcorrencia)}>
                  <Typography variant="body2">
                    {formatarDataHora(evento.dataHoraOcorrencia)}
                  </Typography>
                </Tooltip>
              </TableCell>
              <TableCell>
                <Box sx={{ display: 'flex', alignItems: 'center', gap: 1 }}>
                  {getEventoIcon(evento.tipoEvento)}
                  <Typography variant="body2" fontWeight="medium">
                    {evento.tipoEvento || '-'}
                  </Typography>
                </Box>
              </TableCell>
              <TableCell>
                <Tooltip title={evento.cpfCnpjTrabalhador || evento.cpfCnpjEmpresa || 'Não informado'}>
                  <Typography variant="body2">
                    {formatarDocumento(evento.cpfCnpjTrabalhador || evento.cpfCnpjEmpresa)}
                  </Typography>
                </Tooltip>
              </TableCell>
              <TableCell>
                <Chip
                  icon={getStatusIcon(evento.estado)}
                  label={evento.estado?.replace(/_/g, ' ') || 'Desconhecido'}
                  color={getStatusColor(evento.estado)}
                  size="small"
                  variant="outlined"
                />
              </TableCell>
              <TableCell align="right">
                <Tooltip title="Ver detalhes do evento">
                  <IconButton
                    size="small"
                    color="primary"
                    onClick={() => window.location.href = `/eventos/${evento.id || evento.uuid}`}
                  >
                    <VisibilityIcon />
                  </IconButton>
                </Tooltip>
              </TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </Box>
  );
}

export default EventosRecentesTable;
