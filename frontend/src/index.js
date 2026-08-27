import {
  CssBaseline,
  StyledEngineProvider,
  ThemeProvider
} from "@mui/material";
import { LocalizationProvider } from "@mui/x-date-pickers";
import { AdapterDateFns } from "@mui/x-date-pickers/AdapterDateFns";
import { ptBR } from "date-fns/locale";
import { DialogProvider } from "muibox";
import { SnackbarProvider } from "notistack";
import React, { useState } from "react";
import ReactDOM from "react-dom";
import { ReactQueryDevtools } from "react-query/devtools";
import App from "./app/App";
import { LoadingProvider } from "./components/loading/LoadingProvider";
import PostMessage from "./components/post-message/PostMessage";
import CustomQueryClientProvider from "./CustomQueryClientProvider";
import { NOME_APP } from "./shared/env";
import { initKeycloak } from "./shared/keycloak";
import theme from "./shared/theme";
import darkTheme from "./theme/darkTheme";

function renderApp() {
  const Root = () => {
    const [darkMode, setDarkMode] = useState(() => {
      const saved = localStorage.getItem('darkMode');
      return saved ? JSON.parse(saved) : false;
    });

    React.useEffect(() => {
      const handleStorageChange = (e) => {
        if (e.key === 'darkMode') {
          setDarkMode(JSON.parse(e.newValue));
        }
      };
      window.addEventListener('storage', handleStorageChange);
      return () => window.removeEventListener('storage', handleStorageChange);
    }, []);

    return (
      <StyledEngineProvider injectFirst>
        <ThemeProvider theme={darkMode ? darkTheme : theme}>
          <LocalizationProvider dateAdapter={AdapterDateFns} adapterLocale={ptBR}>
            <DialogProvider>
              <SnackbarProvider maxSnack={1}>
                <LoadingProvider>
                  <CustomQueryClientProvider>
                    <CssBaseline />
                    <PostMessage>
                      <App />
                    </PostMessage>
                    <ReactQueryDevtools initialIsOpen={false} />
                  </CustomQueryClientProvider>
                </LoadingProvider>
              </SnackbarProvider>
            </DialogProvider>
          </LocalizationProvider>
        </ThemeProvider>
      </StyledEngineProvider>
    );
  };

  ReactDOM.render(<Root />, document.getElementById("root"));
}

initKeycloak().then(renderApp);

document.title = NOME_APP;
