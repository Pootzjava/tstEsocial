import React, { useState, useRef, useEffect } from 'react';
import {
  Box,
  Paper,
  IconButton,
  TextField,
  List,
  ListItem,
  ListItemText,
  Typography,
  Avatar,
  Chip,
  Button,
  Fade,
  Zoom,
  CircularProgress
} from '@mui/material';
import {
  Chat as ChatIcon,
  Close as CloseIcon,
  Send as SendIcon,
  SmartToy as BotIcon,
  Person as PersonIcon
} from '@mui/icons-material';

const CopilotChatWidget = () => {
  const [open, setOpen] = useState(false);
  const [messages, setMessages] = useState([
    {
      role: 'assistant',
      content: 'Olá! Sou o Copilot eSocial. Como posso ajudar você hoje? 👋\n\nPosso:\n• Admitir funcionários\n• Verificar erros de envio\n• Tirar dúvidas sobre legislação\n• Simular rescisões',
      suggestions: [
        { label: 'Admitir funcionário', command: 'Admitir João Silva, CPF 000.000.000-00, cargo Vendedor' },
        { label: 'Ver erros hoje', command: 'Quais eventos deram erro hoje?' },
        { label: 'Dúvida legislativa', command: 'Como funciona o eSocial?' }
      ]
    }
  ]);
  const [inputValue, setInputValue] = useState('');
  const [loading, setLoading] = useState(false);
  const messagesEndRef = useRef(null);

  const scrollToBottom = () => {
    messagesEndRef.current?.scrollIntoView({ behavior: 'smooth' });
  };

  useEffect(() => {
    scrollToBottom();
  }, [messages]);

  const handleSend = async (texto) => {
    if (!texto.trim()) return;

    const userMessage = { role: 'user', content: texto };
    setMessages(prev => [...prev, userMessage]);
    setInputValue('');
    setLoading(true);

    try {
      const response = await fetch('http://localhost:8080/api/copilot/chat', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify({
          mensagem: texto,
          tenantId: 'default' // Substituir pelo tenant real
        })
      });

      if (response.ok) {
        const data = await response.json();
        setMessages(prev => [...prev, data]);
      } else {
        setMessages(prev => [...prev, {
          role: 'assistant',
          content: 'Desculpe, ocorreu um erro ao processar sua solicitação. Tente novamente.'
        }]);
      }
    } catch (error) {
      console.error('Erro no copilot:', error);
      setMessages(prev => [...prev, {
        role: 'assistant',
        content: 'Não consegui conectar ao servidor. Verifique sua conexão.'
      }]);
    } finally {
      setLoading(false);
    }
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    handleSend(inputValue);
  };

  const formatContent = (content) => {
    return content.split('\n').map((line, i) => (
      <span key={i}>
        {line.replace(/\*\*(.*?)\*\*/g, '<b>$1</b>')}
        <br />
      </span>
    ));
  };

  return (
    <>
      {/* Botão Flutuante */}
      <Zoom in={!open}>
        <IconButton
          color="primary"
          onClick={() => setOpen(true)}
          sx={{
            position: 'fixed',
            bottom: 24,
            right: 24,
            width: 64,
            height: 64,
            boxShadow: 3,
            zIndex: 1200,
            bgcolor: 'primary.main',
            '&:hover': { bgcolor: 'primary.dark' }
          }}
        >
          <ChatIcon sx={{ fontSize: 32 }} />
        </IconButton>
      </Zoom>

      {/* Widget de Chat */}
      <Fade in={open}>
        <Paper
          elevation={6}
          sx={{
            position: 'fixed',
            bottom: 100,
            right: 24,
            width: 400,
            maxHeight: 600,
            display: 'flex',
            flexDirection: 'column',
            zIndex: 1201,
            borderRadius: 4
          }}
        >
          {/* Header */}
          <Box
            sx={{
              p: 2,
              bgcolor: 'primary.main',
              color: 'white',
              display: 'flex',
              alignItems: 'center',
              justifyContent: 'space-between',
              borderRadius: '4px 4px 0 0'
            }}
          >
            <Box sx={{ display: 'flex', alignItems: 'center', gap: 1 }}>
              <BotIcon />
              <Typography variant="h6">Copilot eSocial</Typography>
            </Box>
            <IconButton size="small" onClick={() => setOpen(false)} sx={{ color: 'white' }}>
              <CloseIcon />
            </IconButton>
          </Box>

          {/* Lista de Mensagens */}
          <List sx={{ flex: 1, overflow: 'auto', p: 2 }}>
            {messages.map((msg, idx) => (
              <ListItem
                key={idx}
                sx={{
                  display: 'flex',
                  flexDirection: msg.role === 'user' ? 'row-reverse' : 'row',
                  mb: 2
                }}
              >
                <Avatar
                  sx={{
                    bgcolor: msg.role === 'user' ? 'primary.main' : 'secondary.main',
                    mr: msg.role === 'user' ? 0 : 1,
                    ml: msg.role === 'user' ? 1 : 0
                  }}
                >
                  {msg.role === 'user' ? <PersonIcon /> : <BotIcon />}
                </Avatar>
                <ListItemText
                  primary={
                    <Box
                      sx={{
                        bgcolor: msg.role === 'user' ? 'primary.light' : 'grey.100',
                        p: 2,
                        borderRadius: 2,
                        maxWidth: '80%',
                        wordWrap: 'break-word'
                      }}
                    >
                      <Typography variant="body1" component="div">
                        {formatContent(msg.content)}
                      </Typography>
                      
                      {/* Sugestões */}
                      {msg.suggestions && (
                        <Box sx={{ mt: 1, display: 'flex', flexWrap: 'wrap', gap: 0.5 }}>
                          {msg.suggestions.map((sug, sIdx) => (
                            <Chip
                              key={sIdx}
                              label={sug.label}
                              size="small"
                              onClick={() => handleSend(sug.command)}
                              sx={{ fontSize: '0.75rem' }}
                            />
                          ))}
                        </Box>
                      )}

                      {/* Ações de Confirmação */}
                      {msg.actionType === 'CONFIRMAR_CRIACAO_EVENTO' && (
                        <Box sx={{ mt: 2, display: 'flex', gap: 1 }}>
                          <Button
                            variant="contained"
                            size="small"
                            onClick={() => handleSend('confirmar')}
                          >
                            ✅ Confirmar
                          </Button>
                          <Button
                            variant="outlined"
                            size="small"
                            onClick={() => handleSend('cancelar')}
                          >
                            Cancelar
                          </Button>
                        </Box>
                      )}
                    </Box>
                  }
                />
              </ListItem>
            ))}
            
            {loading && (
              <ListItem>
                <Avatar sx={{ bgcolor: 'secondary.main', mr: 1 }}>
                  <BotIcon />
                </Avatar>
                <CircularProgress size={20} />
              </ListItem>
            )}
            <div ref={messagesEndRef} />
          </List>

          {/* Input */}
          <Box sx={{ p: 2, borderTop: 1, borderColor: 'divider' }}>
            <form onSubmit={handleSubmit} style={{ display: 'flex', gap: 1 }}>
              <TextField
                fullWidth
                size="small"
                placeholder="Digite seu comando..."
                value={inputValue}
                onChange={(e) => setInputValue(e.target.value)}
                disabled={loading}
                onKeyDown={(e) => {
                  if (e.key === 'Enter' && !e.shiftKey) {
                    e.preventDefault();
                    handleSubmit(e);
                  }
                }}
              />
              <IconButton
                type="submit"
                color="primary"
                disabled={loading || !inputValue.trim()}
              >
                <SendIcon />
              </IconButton>
            </form>
          </Box>
        </Paper>
      </Fade>
    </>
  );
};

export default CopilotChatWidget;
