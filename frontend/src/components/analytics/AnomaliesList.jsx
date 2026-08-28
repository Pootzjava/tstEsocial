'use client';

import { List, ListItem, ListItemIcon, ListItemText, Chip, Box, Typography } from '@mui/material';
import { Warning, Error as ErrorIcon, Info } from '@mui/icons-material';

export default function AnomaliesList({ anomalies }) {
  if (!anomalies || anomalies.length === 0) {
    return (
      <Box sx={{ textAlign: 'center', py: 4 }}>
        <Info sx={{ fontSize: 48, color: 'text.disabled', mb: 2 }} />
        <Typography variant="h6" color="text.secondary">
          Nenhuma anomalia detectada no momento.
        </Typography>
        <Typography variant="body2" color="text.secondary">
          Seu compliance está dentro dos padrões esperados.
        </Typography>
      </Box>
    );
  }

  const getSeverityIcon = (severity) => {
    switch (severity) {
      case 'CRITICAL': return <ErrorIcon color="error" />;
      case 'HIGH': return <ErrorIcon color="warning" />;
      case 'MEDIUM': return <Warning color="warning" />;
      default: return <Info color="info" />;
    }
  };

  const getSeverityColor = (severity) => {
    switch (severity) {
      case 'CRITICAL': return 'error';
      case 'HIGH': return 'warning';
      case 'MEDIUM': return 'warning';
      default: return 'info';
    }
  };

  return (
    <List>
      {anomalies.map((anomaly, index) => (
        <ListItem
          key={index}
          sx={{
            mb: 1,
            borderRadius: 2,
            border: '1px solid',
            borderColor: 'divider',
            backgroundColor: 'background.paper',
          }}
        >
          <ListItemIcon sx={{ minWidth: 40 }}>
            {getSeverityIcon(anomaly.severity)}
          </ListItemIcon>
          <ListItemText
            primary={
              <Box sx={{ display: 'flex', alignItems: 'center', gap: 1 }}>
                <Typography variant="subtitle2" fontWeight="bold">
                  {anomaly.type}
                </Typography>
                <Chip
                  label={anomaly.severity}
                  size="small"
                  color={getSeverityColor(anomaly.severity)}
                  variant="outlined"
                />
              </Box>
            }
            secondary={
              <Typography variant="body2" color="text.secondary">
                {anomaly.description}
              </Typography>
            }
          />
        </ListItem>
      ))}
    </List>
  );
}
