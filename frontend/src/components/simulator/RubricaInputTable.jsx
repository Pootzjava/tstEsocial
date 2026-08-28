'use client';

import { Table, TableBody, TableCell, TableContainer, TableHead, TableRow, Paper, TextField, Checkbox, IconButton, InputAdornment } from '@mui/material';
import DeleteIcon from '@mui/icons-material/Delete';

export default function RubricaInputTable({ rubricas, onUpdate, onRemove }) {
  return (
    <TableContainer component={Paper} variant="outlined">
      <Table size="small">
        <TableHead>
          <TableRow sx={{ bgcolor: 'primary.light' }}>
            <TableCell>Código</TableCell>
            <TableCell>Descrição</TableCell>
            <TableCell align="right">Valor (R$)</TableCell>
            <TableCell align="center">Base INSS</TableCell>
            <TableCell align="center">Base IRRF</TableCell>
            <TableCell align="center">Ações</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {rubricas.map((rubrica, index) => (
            <TableRow key={index}>
              <TableCell>
                <TextField
                  size="small"
                  value={rubrica.codigo}
                  onChange={(e) => onUpdate(index, { ...rubrica, codigo: e.target.value })}
                  fullWidth
                  placeholder="Ex: SAL001"
                />
              </TableCell>
              <TableCell>
                <TextField
                  size="small"
                  value={rubrica.descricao}
                  onChange={(e) => onUpdate(index, { ...rubrica, descricao: e.target.value })}
                  fullWidth
                  placeholder="Ex: Salário Base"
                />
              </TableCell>
              <TableCell>
                <TextField
                  size="small"
                  type="number"
                  value={rubrica.valor}
                  onChange={(e) => onUpdate(index, { ...rubrica, valor: parseFloat(e.target.value) || 0 })}
                  InputProps={{ startAdornment: <InputAdornment position="start">R$</InputAdornment> }}
                  fullWidth
                />
              </TableCell>
              <TableCell align="center">
                <Checkbox
                  checked={rubrica.compoeBaseINSS}
                  onChange={(e) => onUpdate(index, { ...rubrica, compoeBaseINSS: e.target.checked })}
                />
              </TableCell>
              <TableCell align="center">
                <Checkbox
                  checked={rubrica.compoeBaseIRRF}
                  onChange={(e) => onUpdate(index, { ...rubrica, compoeBaseIRRF: e.target.checked })}
                />
              </TableCell>
              <TableCell align="center">
                <IconButton size="small" color="error" onClick={() => onRemove(index)}>
                  <DeleteIcon />
                </IconButton>
              </TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
  );
}
