'use client';

import { useState } from 'react';
import { Box, Typography, Paper, Grid, Button, Alert } from '@mui/material';
import AddIcon from '@mui/icons-material/Add';
import AssessmentIcon from '@mui/icons-material/Assessment';
import WarningIcon from '@mui/icons-material/Warning';
import CheckCircleIcon from '@mui/icons-material/CheckCircle';
import RubricaInputTable from '../../components/simulator/RubricaInputTable';
import ResultadoCards from '../../components/simulator/ResultadoCards';

export default function SimuladorPage() {
  const [rubricas, setRubricas] = useState([
    { codigo: 'SAL001', descricao: 'Salário Base', valor: 3000.00, tipo: 'SALARIO', compoeBaseINSS: true, compoeBaseIRRF: true, quantidade: 1 }
  ]);
  const [resultado, setResultado] = useState(null);
  const [loading, setLoading] = useState(false);
  const [competencia, setCompetencia] = useState('2024-01');

  const handleSimular = async () => {
    setLoading(true);
    try {
      const response = await fetch(`http://localhost:8080/api/simulador/apuracao?competencia=${competencia}`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(rubricas)
      });
      
      if (response.ok) {
        const data = await response.json();
        setResultado(data);
      } else {
        alert('Erro ao simular. Verifique os dados.');
      }
    } catch (error) {
      console.error('Erro na simulação:', error);
      alert('Erro de conexão com o servidor.');
    } finally {
      setLoading(false);
    }
  };

  const handleAddRubrica = () => {
    setRubricas([...rubricas, { 
      codigo: '', 
      descricao: '', 
      valor: 0, 
      tipo: 'PROVENTO', 
      compoeBaseINSS: true, 
      compoeBaseIRRF: true, 
      quantidade: 1 
    }]);
  };

  const handleUpdateRubrica = (index, updatedRubrica) => {
    const novasRubricas = [...rubricas];
    novasRubricas[index] = updatedRubrica;
    setRubricas(novasRubricas);
  };

  const handleRemoveRubrica = (index) => {
    const novasRubricas = rubricas.filter((_, i) => i !== index);
    setRubricas(novasRubricas);
  };

  return (
    <Box sx={{ p: 3, maxWidth: 1200, mx: 'auto' }}>
      <Typography variant="h4" gutterBottom sx={{ display: 'flex', alignItems: 'center', gap: 2 }}>
        <AssessmentIcon color="primary" />
        Safe Mode Simulator - Cálculo de Impostos
      </Typography>
      
      <Alert severity="info" sx={{ mb: 3 }}>
        Simule os impostos da folha (INSS, IRRF, FGTS) antes do envio oficial e evite surpresas na DCTFWeb.
      </Alert>

      <Grid container spacing={3}>
        {/* Coluna Esquerda: Entrada de Dados */}
        <Grid item xs={12} md={7}>
          <Paper sx={{ p: 3 }}>
            <Box sx={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', mb: 2 }}>
              <Typography variant="h6">Rubricas da Folha</Typography>
              <Button variant="outlined" startIcon={<AddIcon />} onClick={handleAddRubrica}>
                Adicionar Rubrica
              </Button>
            </Box>

            <RubricaInputTable 
              rubricas={rubricas} 
              onUpdate={handleUpdateRubrica} 
              onRemove={handleRemoveRubrica} 
            />

            <Box sx={{ mt: 3, display: 'flex', gap: 2 }}>
              <Button 
                variant="contained" 
                color="primary" 
                size="large" 
                fullWidth
                onClick={handleSimular}
                disabled={loading}
              >
                {loading ? 'Calculando...' : 'Simular Apuração'}
              </Button>
            </Box>
          </Paper>
        </Grid>

        {/* Coluna Direita: Resultados */}
        <Grid item xs={12} md={5}>
          {resultado ? (
            <ResultadoCards resultado={resultado} />
          ) : (
            <Paper sx={{ p: 4, textAlign: 'center', bgcolor: 'grey.50' }}>
              <Typography variant="body1" color="textSecondary">
                Preencha as rubricas e clique em "Simular" para ver os resultados.
              </Typography>
            </Paper>
          )}

          {resultado && resultado.alertas && resultado.alertas.length > 0 && (
            <Box sx={{ mt: 2 }}>
              {resultado.alertas.map((alerta, idx) => (
                <Alert key={idx} severity="warning" icon={<WarningIcon />} sx={{ mb: 1 }}>
                  {alerta}
                </Alert>
              ))}
            </Box>
          )}
          
          {resultado && resultado.alertas && resultado.alertas.length === 0 && (
             <Alert severity="success" icon={<CheckCircleIcon />} sx={{ mt: 2 }}>
               Nenhum erro detectado na simulação.
             </Alert>
          )}
        </Grid>
      </Grid>
    </Box>
  );
}
