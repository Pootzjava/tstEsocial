import React from 'react';
import { Button, Box, Tooltip } from '@mui/material';
import DownloadIcon from '@mui/icons-material/Download';
import PictureAsPdfIcon from '@mui/icons-material/PictureAsPdf';
import InsertDriveFileIcon from '@mui/icons-material/InsertDriveFile';

export default function RelatorioActions({ periodoInicio, periodoFim }) {
  
  const handleBaixarPDF = async () => {
    try {
      const response = await fetch(
        `/api/relatorios/apuracao?inicio=${periodoInicio}&fim=${periodoFim}`,
        {
          method: 'GET',
          headers: {
            'Content-Type': 'application/pdf',
          },
        }
      );
      
      if (!response.ok) throw new Error('Erro ao gerar relatório');
      
      const blob = await response.blob();
      const url = window.URL.createObjectURL(blob);
      const a = document.createElement('a');
      a.href = url;
      a.download = `relatorio_apuracao_${periodoInicio}_a_${periodoFim}.pdf`;
      document.body.appendChild(a);
      a.click();
      window.URL.revokeObjectURL(url);
      document.body.removeChild(a);
    } catch (error) {
      console.error('Erro ao baixar PDF:', error);
      alert('Erro ao gerar relatório PDF. Tente novamente.');
    }
  };

  const handleBaixarCSV = async () => {
    try {
      const response = await fetch('/api/relatorios/validacoes');
      if (!response.ok) throw new Error('Erro ao exportar validações');
      
      const text = await response.text();
      const blob = new Blob([text], { type: 'text/csv;charset=utf-8;' });
      const url = window.URL.createObjectURL(blob);
      const a = document.createElement('a');
      a.href = url;
      a.download = 'validacoes_folha.csv';
      document.body.appendChild(a);
      a.click();
      window.URL.revokeObjectURL(url);
      document.body.removeChild(a);
    } catch (error) {
      console.error('Erro ao baixar CSV:', error);
      alert('Erro ao exportar CSV. Tente novamente.');
    }
  };

  return (
    <Box sx={{ display: 'flex', gap: 1, flexWrap: 'wrap' }}>
      <Tooltip title="Baixar Relatório em PDF">
        <Button
          variant="outlined"
          color="error"
          startIcon={<PictureAsPdfIcon />}
          onClick={handleBaixarPDF}
          disabled={!periodoInicio || !periodoFim}
          size="small"
        >
          PDF
        </Button>
      </Tooltip>
      
      <Tooltip title="Exportar Validações (Excel/CSV)">
        <Button
          variant="outlined"
          color="success"
          startIcon={<InsertDriveFileIcon />}
          onClick={handleBaixarCSV}
          size="small"
        >
          CSV
        </Button>
      </Tooltip>
    </Box>
  );
}
