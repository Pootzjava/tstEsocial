'use client';

import { Box, Typography } from '@mui/material';
import { PieChart, Pie, Cell, ResponsiveContainer } from 'recharts';

export default function RiskGaugeChart({ value, classification }) {
  // Dados para simular um gauge chart usando PieChart
  const data = [
    { name: 'Risco', value: value },
    { name: 'Seguro', value: 100 - value },
  ];

  const getColors = (classification) => {
    switch (classification) {
      case 'LOW': return ['#2e7d32', '#e8f5e9']; // Verde
      case 'MEDIUM': return ['#ed6c02', '#fff3e0']; // Laranja
      case 'HIGH': return ['#d32f2f', '#ffebee']; // Vermelho
      case 'CRITICAL': return ['#9c27b0', '#f3e5f5']; // Roxo/Crítico
      default: return ['#2e7d32', '#e8f5e9'];
    }
  };

  const colors = getColors(classification);

  return (
    <Box sx={{ position: 'relative', width: '100%', height: 250 }}>
      <ResponsiveContainer>
        <PieChart>
          <Pie
            data={data}
            cx="50%"
            cy="50%"
            innerRadius={60}
            outerRadius={80}
            startAngle={90}
            endAngle={-270}
            dataKey="value"
            stroke="none"
          >
            <Cell key="risk" fill={colors[0]} />
            <Cell key="safe" fill={colors[1]} />
          </Pie>
        </PieChart>
      </ResponsiveContainer>
      
      {/* Valor central */}
      <Box
        sx={{
          position: 'absolute',
          top: '50%',
          left: '50%',
          transform: 'translate(-50%, -50%)',
          textAlign: 'center',
        }}
      >
        <Typography variant="h3" fontWeight="bold" color={colors[0]}>
          {value}
        </Typography>
        <Typography variant="caption" color="text.secondary">
          de 100
        </Typography>
      </Box>
    </Box>
  );
}
