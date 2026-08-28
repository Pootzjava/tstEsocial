import React from 'react';
import { Box, IconButton, Tooltip } from '@mui/material';
import Brightness4Icon from '@mui/icons-material/Brightness4';
import Brightness7Icon from '@mui/icons-material/Brightness7';
import DownloadIcon from '@mui/icons-material/Download';

const DashboardHeader = ({ darkMode, onToggleDarkMode, onExportCSV }) => {
  return (
    <Box sx={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', mb: 2 }}>
      <Box>
        {/* Espaço reservado para título se necessário */}
      </Box>
      <Box sx={{ display: 'flex', gap: 1 }}>
        <Tooltip title="Exportar CSV">
          <IconButton onClick={onExportCSV} color="inherit" size="small">
            <DownloadIcon />
          </IconButton>
        </Tooltip>
        <Tooltip title={darkMode ? 'Modo Claro' : 'Modo Escuro'}>
          <IconButton onClick={onToggleDarkMode} color="inherit" size="small">
            {darkMode ? <Brightness7Icon /> : <Brightness4Icon />}
          </IconButton>
        </Tooltip>
      </Box>
    </Box>
  );
};

export default DashboardHeader;
