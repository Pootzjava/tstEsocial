'use client';

import { useState, useEffect } from 'react';
import { Box, Typography, Card, CardContent, Grid, Button, Chip, IconButton, Badge } from '@mui/material';
import RefreshIcon from '@mui/icons-material/Refresh';
import CheckCircleIcon from '@mui/icons-material/CheckCircle';
import CancelIcon from '@mui/icons-material/Cancel';
import NotificationsIcon from '@mui/icons-material/Notifications';
import BottomNav from '../../components/mobile/BottomNav';

export default function MobileDashboard() {
  const [resumo, setResumo] = useState({
    eventosPendentes: 0,
    lotesAguardandoAprovacao: 0,
    certificadoExpirando: false
  });
  const [alertas, setAlertas] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    carregarDados();
  }, []);

  const carregarDados = async () => {
    setLoading(true);
    try {
      // Simulação de chamada API - substituir por fetch real
      setResumo({
        eventosPendentes: 12,
        lotesAguardandoAprovacao: 3,
        certificadoExpirando: true
      });
      setAlertas([
        {
          tipo: 'CERTIFICADO_VENCENDO',
          titulo: 'Certificado Digital vencendo em 15 dias',
          severidade: 'ALTA'
        },
        {
          tipo: 'LOTE_ERRO',
          titulo: '3 lotes com erro de processamento',
          severidade: 'MEDIA'
        }
      ]);
    } catch (error) {
      console.error('Erro ao carregar dados mobile:', error);
    } finally {
      setLoading(false);
    }
  };

  return (
    <Box sx={{ pb: 70 }}> {/* Espaço para BottomNav */}
      {/* Header */}
      <Box sx={{ 
        p: 2, 
        bgcolor: 'primary.main', 
        color: 'white',
        display: 'flex',
        justifyContent: 'space-between',
        alignItems: 'center'
      }}>
        <Typography variant="h6">eSocial-JT Mobile</Typography>
        <IconButton sx={{ color: 'white' }} onClick={carregarDados}>
          <RefreshIcon />
        </IconButton>
      </Box>

      {/* Cards de Resumo */}
      <Grid container spacing={2} sx={{ p: 2 }}>
        <Grid item xs={6}>
          <Card>
            <CardContent>
              <Typography color="textSecondary" variant="caption">Eventos Pendentes</Typography>
              <Typography variant="h4">{resumo.eventosPendentes}</Typography>
            </CardContent>
          </Card>
        </Grid>
        <Grid item xs={6}>
          <Card>
            <CardContent>
              <Typography color="textSecondary" variant="caption">Lotes p/ Aprovar</Typography>
              <Typography variant="h4">{resumo.lotesAguardandoAprovacao}</Typography>
            </CardContent>
          </Card>
        </Grid>
      </Grid>

      {/* Alertas */}
      <Box sx={{ p: 2 }}>
        <Typography variant="subtitle1" fontWeight="bold" gutterBottom>
          Alertas Críticos
        </Typography>
        {alertas.map((alerta, index) => (
          <Card key={index} sx={{ mb: 1, borderLeft: `4px solid ${alerta.severidade === 'ALTA' ? 'red' : 'orange'}` }}>
            <CardContent>
              <Box sx={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>
                <Box>
                  <Chip 
                    label={alerta.severidade} 
                    size="small" 
                    color={alerta.severidade === 'ALTA' ? 'error' : 'warning'}
                    sx={{ mb: 1 }}
                  />
                  <Typography variant="body2">{alerta.titulo}</Typography>
                </Box>
                <Badge badgeContent={1} color="error">
                  <NotificationsIcon />
                </Badge>
              </Box>
            </CardContent>
          </Card>
        ))}
      </Box>

      {/* Lista Rápida de Aprovações */}
      <Box sx={{ p: 2 }}>
        <Typography variant="subtitle1" fontWeight="bold" gutterBottom>
          Aprovações Rápidas
        </Typography>
        {[1, 2, 3].map((lote) => (
          <Card key={lote} sx={{ mb: 1 }}>
            <CardContent>
              <Typography variant="body2">Lote #{lote} - Competência 01/2024</Typography>
              <Box sx={{ mt: 1, display: 'flex', gap: 1 }}>
                <Button 
                  size="small" 
                  variant="contained" 
                  startIcon={<CheckCircleIcon />}
                  sx={{ flex: 1 }}
                >
                  Aprovar
                </Button>
                <Button 
                  size="small" 
                  variant="outlined" 
                  startIcon={<CancelIcon />}
                  color="error"
                  sx={{ flex: 1 }}
                >
                  Rejeitar
                </Button>
              </Box>
            </CardContent>
          </Card>
        ))}
      </Box>

      {/* Bottom Navigation */}
      <BottomNav />
    </Box>
  );
}
