'use client';

import { Grid, Paper, Typography, Box } from '@mui/material';
import AccountBalanceIcon from '@mui/icons-material/AccountBalance';
import PersonIcon from '@mui/icons-material/Person';
import BusinessIcon from '@mui/icons-material/Business';
import TrendingUpIcon from '@mui/icons-material/TrendingUp';

const formatCurrency = (value) => {
  return new Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(value);
};

export default function ResultadoCards({ resultado }) {
  const CardItem = ({ title, value, icon, color }) => (
    <Paper 
      sx={{ 
        p: 2, 
        textAlign: 'center', 
        bgcolor: `${color}.50`, 
        border: 1, 
        borderColor: `${color}.200`,
        borderRadius: 2
      }}
    >
      <Box sx={{ display: 'flex', justifyContent: 'center', mb: 1, color: `${color}.main` }}>
        {icon}
      </Box>
      <Typography variant="caption" color="textSecondary" display="block">
        {title}
      </Typography>
      <Typography variant="h6" color={`${color}.main`} fontWeight="bold">
        {formatCurrency(value)}
      </Typography>
    </Paper>
  );

  return (
    <Box>
      <Typography variant="h6" gutterBottom sx={{ mt: 2 }}>
        Resultados da Simulação ({resultado.competencia})
      </Typography>
      
      <Grid container spacing={2}>
        <Grid item xs={6}>
          <CardItem 
            title="Salário Bruto" 
            value={resultado.totalBruto} 
            icon={<BusinessIcon />} 
            color="primary" 
          />
        </Grid>
        <Grid item xs={6}>
          <CardItem 
            title="INSS Empregado" 
            value={resultado.inssEmpregado} 
            icon={<PersonIcon />} 
            color="warning" 
          />
        </Grid>
        <Grid item xs={6}>
          <CardItem 
            title="INSS Patronal" 
            value={resultado.inssPatronal} 
            icon={<BusinessIcon />} 
            color="error" 
          />
        </Grid>
        <Grid item xs={6}>
          <CardItem 
            title="IRRF" 
            value={resultado.irrf} 
            icon={<AccountBalanceIcon />} 
            color="info" 
          />
        </Grid>
        <Grid item xs={6}>
          <CardItem 
            title="FGTS" 
            value={resultado.fgts} 
            icon={<TrendingUpIcon />} 
            color="success" 
          />
        </Grid>
        <Grid item xs={6}>
          <CardItem 
            title="Salário Líquido" 
            value={resultado.valorLiquido} 
            icon={<PersonIcon />} 
            color="primary" 
          />
        </Grid>
      </Grid>

      <Paper sx={{ p: 2, mt: 2, bgcolor: 'secondary.light', border: 1, borderColor: 'secondary.main' }}>
        <Typography variant="subtitle2" color="secondary.contrastText">
          DCTFWeb Estimada
        </Typography>
        <Typography variant="h4" color="secondary.contrastText" fontWeight="bold">
          {formatCurrency(resultado.dcftfWebEstimada)}
        </Typography>
        <Typography variant="caption" display="block" sx={{ mt: 1 }}>
          *Valor estimado para recolhimento via DCTFWeb
        </Typography>
      </Paper>
    </Box>
  );
}
