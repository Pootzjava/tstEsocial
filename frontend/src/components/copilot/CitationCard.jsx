import React, { useState } from 'react';
import { 
  Box, 
  Paper, 
  Typography, 
  Chip, 
  IconButton, 
  Tooltip,
  Divider
} from '@mui/material';
import { ContentCopy, Gavel, Description } from '@mui/icons-material';

/**
 * Componente para exibição de citações legislativas com formatação adequada.
 * Exibe a base legal de forma destacada e permite copiar a referência.
 */
const CitationCard = ({ item, onCopy }) => {
  const [copied, setCopied] = useState(false);

  const handleCopy = () => {
    const textToCopy = `${item.legalBasis} - ${item.topic}`;
    navigator.clipboard.writeText(textToCopy);
    setCopied(true);
    setTimeout(() => setCopied(false), 2000);
    
    if (onCopy) onCopy(textToCopy);
  };

  const getSeverityColor = (severity) => {
    switch (severity?.toUpperCase()) {
      case 'CRITICAL': return 'error';
      case 'HIGH': return 'warning';
      case 'MEDIUM': return 'info';
      default: return 'default';
    }
  };

  return (
    <Paper 
      elevation={2}
      sx={{ 
        p: 2, 
        mt: 1, 
        mb: 1,
        bgcolor: 'background.paper',
        borderLeft: 4,
        borderColor: getSeverityColor(item.severity),
        borderRadius: 2
      }}
    >
      {/* Cabeçalho com ícone e título */}
      <Box display="flex" alignItems="center" justifyContent="space-between" mb={1}>
        <Box display="flex" alignItems="center" gap={1}>
          <Gavel color="action" fontSize="small" />
          <Typography variant="subtitle2" fontWeight="bold" color="text.secondary">
            {item.topic}
          </Typography>
        </Box>
        
        <Tooltip title={copied ? "Copiado!" : "Copiar referência"}>
          <IconButton size="small" onClick={handleCopy} color="primary">
            <ContentCopy fontSize="small" />
          </IconButton>
        </Tooltip>
      </Box>

      {/* Resposta */}
      <Typography variant="body2" color="text.primary" paragraph>
        {item.answer}
      </Typography>

      {/* Base Legal Destacada */}
      <Box 
        sx={{ 
          bgcolor: 'grey.50', 
          p: 1, 
          borderRadius: 1,
          border: '1px dashed',
          borderColor: 'grey.300'
        }}
      >
        <Box display="flex" alignItems="center" gap={0.5} mb={0.5}>
          <Description fontSize="small" color="action" />
          <Typography variant="caption" fontWeight="bold" color="text.secondary">
            Fundamentação Legal:
          </Typography>
        </Box>
        <Typography variant="caption" fontFamily="monospace" color="text.primary">
          {item.legalBasis}
        </Typography>
      </Box>

      {/* Tags */}
      {item.tags && item.tags.length > 0 && (
        <>
          <Divider sx={{ my: 1 }} />
          <Box display="flex" flexWrap="wrap" gap={0.5}>
            {item.tags.slice(0, 5).map((tag, index) => (
              <Chip 
                key={index} 
                label={tag} 
                size="small" 
                variant="outlined" 
                sx={{ fontSize: '0.7rem' }}
              />
            ))}
          </Box>
        </>
      )}

      {/* Severidade */}
      <Box display="flex" justifyContent="flex-end" mt={1}>
        <Chip 
          label={item.severity || 'INFO'} 
          size="small" 
          color={getSeverityColor(item.severity)}
          variant="outlined"
          sx={{ fontSize: '0.65rem', fontWeight: 'bold' }}
        />
      </Box>
    </Paper>
  );
};

export default CitationCard;
