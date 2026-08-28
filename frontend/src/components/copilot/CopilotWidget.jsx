'use client';

import React, { useState } from 'react';
import {
  Box,
  Card,
  CardContent,
  Typography,
  TextField,
  Button,
  Alert,
  Chip,
  Stack,
  Paper,
  IconButton,
  Tooltip,
} from '@mui/material';
import AutoFixHighIcon from '@mui/icons-material/AutoFixHigh';
import LightbulbIcon from '@mui/icons-material/Lightbulb';
import RefreshIcon from '@mui/icons-material/Refresh';
import ContentCopyIcon from '@mui/icons-material/ContentCopy';
import CheckCircleIcon from '@mui/icons-material/CheckCircle';

/**
 * Componente eSocial Copilot - Tradutor de Erros com IA
 * Permite que usuários colem mensagens de erro e recebam explicações em linguagem simples
 */
export default function CopilotWidget() {
  const [mensagemErro, setMensagemErro] = useState('');
  const [resultado, setResultado] = useState(null);
  const [carregando, setCarregando] = useState(false);
  const [copiado, setCopiado] = useState(false);

  const buscarTraducao = async () => {
    if (!mensagemErro.trim()) return;

    setCarregando(true);
    setResultado(null);

    try {
      const response = await fetch(
        `/api/copilot/traduzir-erro?mensagemErro=${encodeURIComponent(mensagemErro)}`
      );
      
      if (response.ok) {
        const data = await response.json();
        setResultado(data);
      } else {
        setResultado({
          encontrado: false,
          explicacao: 'Erro ao consultar o Copilot. Tente novamente.',
          causaProvavel: '',
          solucao: '',
          nivelSeveridade: 'DESCONHECIDO',
          tags: [],
        });
      }
    } catch (error) {
      console.error('Erro ao chamar Copilot:', error);
      setResultado({
        encontrado: false,
        explicacao: 'Não foi possível conectar ao serviço de Inteligência.',
        causaProvavel: 'Verifique sua conexão com a internet.',
        solucao: 'Tente novamente em alguns instantes.',
        nivelSeveridade: 'ERRO_TECNICO',
        tags: [],
      });
    } finally {
      setCarregando(false);
    }
  };

  const limparTudo = () => {
    setMensagemErro('');
    setResultado(null);
    setCopiado(false);
  };

  const copiarSolucao = () => {
    if (resultado?.solucao) {
      navigator.clipboard.writeText(resultado.solucao);
      setCopiado(true);
      setTimeout(() => setCopiado(false), 2000);
    }
  };

  const getCorSeveridade = (nivel) => {
    switch (nivel?.toUpperCase()) {
      case 'CRITICO':
        return 'error';
      case 'ALTO':
        return 'warning';
      case 'MEDIO':
        return 'info';
      case 'BAIXO':
        return 'success';
      default:
        return 'default';
    }
  };

  return (
    <Card 
      sx={{ 
        maxWidth: 900, 
        mx: 'auto', 
        mt: 3,
        boxShadow: '0 4px 20px rgba(0,0,0,0.1)',
        borderRadius: 3,
      }}
    >
      <CardContent sx={{ p: 4 }}>
        {/* Cabeçalho */}
        <Stack direction="row" alignItems="center" spacing={2} sx={{ mb: 3 }}>
          <Box
            sx={{
              p: 1.5,
              bgcolor: 'primary.light',
              borderRadius: 2,
              display: 'flex',
              alignItems: 'center',
              justifyContent: 'center',
            }}
          >
            <AutoFixHighIcon sx={{ fontSize: 32, color: 'primary.main' }} />
          </Box>
          <Box>
            <Typography variant="h5" fontWeight="bold">
              eSocial Copilot 🤖
            </Typography>
            <Typography variant="body2" color="text.secondary">
              Seu assistente inteligente para resolver erros do eSocial
            </Typography>
          </Box>
        </Stack>

        {/* Campo de Entrada */}
        <TextField
          fullWidth
          multiline
          rows={4}
          placeholder="Cole aqui a mensagem de erro do eSocial... Ex: 'Erro 501: Certificado digital inválido'"
          value={mensagemErro}
          onChange={(e) => setMensagemErro(e.target.value)}
          variant="outlined"
          sx={{ mb: 2 }}
          InputProps={{
            sx: {
              fontFamily: 'monospace',
              fontSize: '0.95rem',
            },
          }}
        />

        {/* Botões de Ação */}
        <Stack direction="row" spacing={2} sx={{ mb: 3 }}>
          <Button
            variant="contained"
            size="large"
            onClick={buscarTraducao}
            disabled={carregando || !mensagemErro.trim()}
            startIcon={carregando ? <RefreshIcon /> : <LightbulbIcon />}
            sx={{
              px: 4,
              py: 1.5,
              borderRadius: 2,
              fontWeight: 'bold',
            }}
          >
            {carregando ? 'Analisando...' : 'Traduzir Erro'}
          </Button>

          <Button
            variant="outlined"
            size="large"
            onClick={limparTudo}
            disabled={carregando || (!mensagemErro && !resultado)}
            sx={{
              px: 4,
              py: 1.5,
              borderRadius: 2,
            }}
          >
            Limpar
          </Button>
        </Stack>

        {/* Resultado */}
        {resultado && (
          <Paper
            elevation={0}
            sx={{
              p: 3,
              bgcolor: resultado.encontrado ? 'success.light' : 'warning.light',
              borderRadius: 2,
              border: `1px solid ${resultado.encontrado ? 'success.main' : 'warning.main'}`,
            }}
          >
            {/* Status e Tags */}
            <Stack direction="row" alignItems="center" spacing={1} sx={{ mb: 2 }}>
              <Chip
                icon={resultado.encontrado ? <CheckCircleIcon /> : undefined}
                label={resultado.encontrado ? 'Erro Conhecido' : 'Erro Desconhecido'}
                color={getCorSeveridade(resultado.nivelSeveridade)}
                variant="filled"
              />
              
              {resultado.tags?.map((tag, index) => (
                <Chip
                  key={index}
                  label={tag}
                  size="small"
                  variant="outlined"
                  sx={{ opacity: 0.7 }}
                />
              ))}
            </Stack>

            {/* Explicação */}
            <Box sx={{ mb: 2 }}>
              <Typography variant="subtitle2" fontWeight="bold" gutterBottom>
                📖 O que significa:
              </Typography>
              <Typography variant="body1">
                {resultado.explicacao}
              </Typography>
            </Box>

            {/* Causa Provável */}
            {resultado.causaProvavel && (
              <Box sx={{ mb: 2 }}>
                <Typography variant="subtitle2" fontWeight="bold" gutterBottom>
                  🔍 Causa provável:
                </Typography>
                <Typography variant="body1" color="text.secondary">
                  {resultado.causaProvavel}
                </Typography>
              </Box>
            )}

            {/* Solução */}
            {resultado.solucao && (
              <Box sx={{ mb: 2 }}>
                <Stack direction="row" alignItems="center" justifyContent="space-between" sx={{ mb: 1 }}>
                  <Typography variant="subtitle2" fontWeight="bold">
                    ✅ Como resolver:
                  </Typography>
                  
                  <Tooltip title="Copiar solução">
                    <IconButton
                      size="small"
                      onClick={copiarSolucao}
                      color="primary"
                    >
                      {copiado ? <CheckCircleIcon fontSize="small" /> : <ContentCopyIcon fontSize="small" />}
                    </IconButton>
                  </Tooltip>
                </Stack>
                
                <Paper
                  variant="outlined"
                  sx={{
                    p: 2,
                    bgcolor: 'background.paper',
                    fontFamily: 'monospace',
                    whiteSpace: 'pre-line',
                    fontSize: '0.9rem',
                  }}
                >
                  {resultado.solucao}
                </Paper>
              </Box>
            )}

            {/* Severidade */}
            <Box sx={{ mt: 2 }}>
              <Typography variant="caption" color="text.secondary">
                Nível de severidade: <strong>{resultado.nivelSeveridade}</strong>
              </Typography>
            </Box>
          </Paper>
        )}

        {/* Dicas de Uso */}
        {!resultado && !carregando && (
          <Box sx={{ mt: 3, p: 2, bgcolor: 'grey.50', borderRadius: 2 }}>
            <Typography variant="subtitle2" fontWeight="bold" gutterBottom>
              💡 Dicas de uso:
            </Typography>
            <Typography variant="body2" color="text.secondary" component="div">
              <ul>
                <li>Cole a mensagem completa de erro retornada pelo eSocial</li>
                <li>Inclua códigos numéricos quando disponíveis (ex: "Erro 501")</li>
                <li>O Copilot entende termos como "certificado", "tabela", "salário mínimo"</li>
                <li>Para erros desconhecidos, consulte o suporte técnico</li>
              </ul>
            </Typography>
          </Box>
        )}
      </CardContent>
    </Card>
  );
}
