import React from 'react';
import { Box, Button, ButtonGroup } from '@mui/material';
import { DatePicker } from '@mui/x-date-pickers';
import dayjs from 'dayjs';

const PeriodoFiltro = ({ periodoInicio, periodoFim, onApply }) => {
  const [inicio, setInicio] = React.useState(periodoInicio ? dayjs(periodoInicio) : dayjs().subtract(30, 'days'));
  const [fim, setFim] = React.useState(periodoFim ? dayjs(periodoFim) : dayjs());

  const handleApply = () => {
    if (inicio && fim && inicio.isBefore(fim)) {
      onApply(inicio.format('YYYY-MM-DD'), fim.format('YYYY-MM-DD'));
    }
  };

  const handleQuickSelect = (days) => {
    const newInicio = dayjs().subtract(days, 'days');
    const newFim = dayjs();
    setInicio(newInicio);
    setFim(newFim);
    onApply(newInicio.format('YYYY-MM-DD'), newFim.format('YYYY-MM-DD'));
  };

  const handleClear = () => {
    setInicio(null);
    setFim(null);
    onApply(null, null);
  };

  return (
    <Box sx={{ display: 'flex', flexDirection: { xs: 'column', md: 'row' }, gap: 2, mb: 3 }}>
      <DatePicker
        label="Data Início"
        value={inicio}
        onChange={(newValue) => setInicio(newValue)}
        slotProps={{ textField: { size: 'small', fullWidth: true } }}
      />
      <DatePicker
        label="Data Fim"
        value={fim}
        onChange={(newValue) => setFim(newValue)}
        slotProps={{ textField: { size: 'small', fullWidth: true } }}
      />
      <ButtonGroup variant="contained" orientation={{ xs: 'vertical', md: 'horizontal' }}>
        <Button onClick={() => handleQuickSelect(7)} size="small">7 dias</Button>
        <Button onClick={() => handleQuickSelect(30)} size="small">30 dias</Button>
        <Button onClick={handleApply} size="small">Aplicar</Button>
        <Button onClick={handleClear} size="small" color="secondary">Limpar</Button>
      </ButtonGroup>
    </Box>
  );
};

export default PeriodoFiltro;
