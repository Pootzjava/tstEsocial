import React, { useState } from 'react';
import { Button, Box, Tooltip, CircularProgress } from '@mui/material';
import DownloadIcon from '@mui/icons-material/Download';
import PictureAsPdfIcon from '@mui/icons-material/PictureAsPdf';

const RelatorioActions = ({ periodoInicio, periodoFim }) => {
    const [carregando, setCarregando] = useState(false);

    const baixarPDF = async () => {
        setCarregando(true);
        try {
            const params = new URLSearchParams();
            if (periodoInicio) params.append('periodoInicio', periodoInicio);
            if (periodoFim) params.append('periodoFim', periodoFim);

            const response = await fetch(
                `${process.env.REACT_APP_API_URL || 'http://localhost:8080'}/api/relatorios/apuracao/pdf?${params.toString()}`,
                {
                    method: 'GET',
                    headers: {
                        'Content-Type': 'application/json',
                    },
                }
            );

            if (!response.ok) {
                throw new Error('Erro ao gerar relatório');
            }

            const blob = await response.blob();
            const url = window.URL.createObjectURL(blob);
            const a = document.createElement('a');
            a.href = url;
            a.download = `relatorio_apuracao_${new Date().toISOString().split('T')[0]}.pdf`;
            document.body.appendChild(a);
            a.click();
            window.URL.revokeObjectURL(url);
            document.body.removeChild(a);
        } catch (error) {
            console.error('Erro ao baixar PDF:', error);
            alert('Erro ao gerar relatório. Tente novamente.');
        } finally {
            setCarregando(false);
        }
    };

    return (
        <Box sx={{ display: 'flex', gap: 1, mb: 2 }}>
            <Tooltip title="Baixar Relatório em PDF">
                <Button
                    variant="outlined"
                    color="primary"
                    startIcon={carregando ? <CircularProgress size={20} /> : <PictureAsPdfIcon />}
                    onClick={baixarPDF}
                    disabled={carregando}
                    size="small"
                >
                    {carregando ? 'Gerando...' : 'Baixar PDF'}
                </Button>
            </Tooltip>
        </Box>
    );
};

export default RelatorioActions;
