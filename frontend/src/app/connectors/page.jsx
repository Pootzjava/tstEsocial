'use client';

import { useState, useEffect } from 'react';
import {
  Box,
  Typography,
  Button,
  Card,
  CardContent,
  Grid,
  Chip,
  Dialog,
  DialogTitle,
  DialogContent,
  DialogActions,
  TextField,
  Autocomplete,
} from '@mui/material';
import AddIcon from '@mui/icons-material/Add';
import PlayArrowIcon from '@mui/icons-material/PlayArrow';
import TestIcon from '@mui/icons-material/Science';

export default function ConnectorsPage() {
  const [connectors, setConnectors] = useState([]);
  const [openDialog, setOpenDialog] = useState(false);
  const [selectedTemplate, setSelectedTemplate] = useState(null);

  const templates = [
    { name: 'TOTVS Protheus - Admissão', system: 'TOTVS' },
    { name: 'SAP RH - Folha', system: 'SAP' },
    { name: 'Senior Sistemas - Cadastro', system: 'SENIOR' },
    { name: 'Contabilizei - Contábil', system: 'CONTABILIZEI' },
    { name: 'Excel/CSV Import', system: 'GENÉRICO' },
  ];

  useEffect(() => {
    fetchConnectors();
  }, []);

  const fetchConnectors = async () => {
    try {
      const response = await fetch('/api/connectors');
      const data = await response.json();
      setConnectors(data);
    } catch (error) {
      console.error('Erro ao buscar conectores:', error);
    }
  };

  const handleCreateConnector = async () => {
    if (!selectedTemplate) return;

    try {
      const response = await fetch('/api/connectors', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({
          nome: selectedTemplate.name,
          sistemaOrigem: selectedTemplate.system,
          sistemaDestino: 'ESOCIAL_JT',
          mapeamentoCampos: [], // Seria preenchido pelo editor visual
          transformacoes: [],
        }),
      });

      if (response.ok) {
        fetchConnectors();
        setOpenDialog(false);
        setSelectedTemplate(null);
      }
    } catch (error) {
      console.error('Erro ao criar conector:', error);
    }
  };

  const handleTestConnector = async (id) => {
    alert(`Testando conector ${id}... (funcionalidade de teste)`);
  };

  const handleExecute = async (id) => {
    try {
      const response = await fetch(`/api/connectors/${id}/executar`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ /* dados de exemplo */ }),
      });

      const result = await response.json();
      if (result.sucesso) {
        alert('Integração executada com sucesso!');
        fetchConnectors();
      } else {
        alert(`Erro: ${result.erro}`);
      }
    } catch (error) {
      console.error('Erro ao executar:', error);
    }
  };

  return (
    <Box sx={{ p: 3 }}>
      <Box sx={{ display: 'flex', justifyContent: 'space-between', mb: 3 }}>
        <Typography variant="h4">Marketplace de Conectores</Typography>
        <Button
          variant="contained"
          startIcon={<AddIcon />}
          onClick={() => setOpenDialog(true)}
        >
          Novo Conector
        </Button>
      </Box>

      <Grid container spacing={3}>
        {connectors.map((conn) => (
          <Grid item xs={12} md={6} lg={4} key={conn.id}>
            <Card>
              <CardContent>
                <Box sx={{ display: 'flex', justifyContent: 'space-between', mb: 1 }}>
                  <Typography variant="h6">{conn.nome}</Typography>
                  <Chip
                    label={conn.status}
                    color={conn.status === 'ATIVO' ? 'success' : 'default'}
                    size="small"
                  />
                </Box>
                <Typography variant="body2" color="text.secondary" gutterBottom>
                  Origem: {conn.sistemaOrigem} → Destino: {conn.sistemaDestino}
                </Typography>
                <Typography variant="body2" color="text.secondary">
                  Última execução:{' '}
                  {conn.ultimaExecucao
                    ? new Date(conn.ultimaExecucao).toLocaleString()
                    : 'Nunca'}
                </Typography>

                <Box sx={{ mt: 2, display: 'flex', gap: 1 }}>
                  <Button
                    size="small"
                    startIcon={<TestIcon />}
                    onClick={() => handleTestConnector(conn.id)}
                  >
                    Testar
                  </Button>
                  <Button
                    size="small"
                    variant="contained"
                    startIcon={<PlayArrowIcon />}
                    onClick={() => handleExecute(conn.id)}
                  >
                    Executar
                  </Button>
                </Box>
              </CardContent>
            </Card>
          </Grid>
        ))}

        {connectors.length === 0 && (
          <Grid item xs={12}>
            <Box sx={{ textAlign: 'center', py: 5 }}>
              <Typography variant="h6" color="text.secondary">
                Nenhum conector cadastrado. Clique em "Novo Conector" para começar.
              </Typography>
            </Box>
          </Grid>
        )}
      </Grid>

      {/* Dialog de Criação */}
      <Dialog open={openDialog} onClose={() => setOpenDialog(false)} maxWidth="sm" fullWidth>
        <DialogTitle>Criar Novo Conector</DialogTitle>
        <DialogContent>
          <Box sx={{ pt: 2 }}>
            <Autocomplete
              options={templates}
              getOptionLabel={(option) => option.name}
              value={selectedTemplate}
              onChange={(_, newValue) => setSelectedTemplate(newValue)}
              renderInput={(params) => (
                <TextField {...params} label="Selecionar Template" fullWidth />
              )}
            />
          </Box>
        </DialogContent>
        <DialogActions>
          <Button onClick={() => setOpenDialog(false)}>Cancelar</Button>
          <Button
            onClick={handleCreateConnector}
            variant="contained"
            disabled={!selectedTemplate}
          >
            Criar
          </Button>
        </DialogActions>
      </Dialog>
    </Box>
  );
}
