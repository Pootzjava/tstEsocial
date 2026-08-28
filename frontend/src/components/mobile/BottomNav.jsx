'use client';

import { useState } from 'react';
import { BottomNavigation, BottomNavigationAction, Box } from '@mui/material';
import HomeIcon from '@mui/icons-material/Home';
import CheckCircleIcon from '@mui/icons-material/CheckCircle';
import NotificationsIcon from '@mui/icons-material/Notifications';
import SettingsIcon from '@mui/icons-material/Settings';
import { useRouter, usePathname } from 'next/navigation';

export default function BottomNav() {
  const router = useRouter();
  const pathname = usePathname();

  const getValueFromPath = () => {
    if (pathname === '/mobile') return 0;
    if (pathname === '/mobile/aprovacoes') return 1;
    if (pathname === '/mobile/alertas') return 2;
    if (pathname === '/mobile/config') return 3;
    return 0;
  };

  const [value, setValue] = useState(getValueFromPath());

  return (
    <Box
      sx={{
        position: 'fixed',
        bottom: 0,
        left: 0,
        right: 0,
        zIndex: 1000,
        boxShadow: '0 -2px 10px rgba(0,0,0,0.1)'
      }}
    >
      <BottomNavigation
        value={value}
        onChange={(event, newValue) => {
          setValue(newValue);
          switch (newValue) {
            case 0:
              router.push('/mobile');
              break;
            case 1:
              router.push('/mobile/aprovacoes');
              break;
            case 2:
              router.push('/mobile/alertas');
              break;
            case 3:
              router.push('/mobile/config');
              break;
          }
        }}
        showLabels
      >
        <BottomNavigationAction label="Início" icon={<HomeIcon />} />
        <BottomNavigationAction label="Aprovar" icon={<CheckCircleIcon />} />
        <BottomNavigationAction label="Alertas" icon={<NotificationsIcon />} />
        <BottomNavigationAction label="Config" icon={<SettingsIcon />} />
      </BottomNavigation>
    </Box>
  );
}
