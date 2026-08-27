import React from "react";
import { Route, Routes as Switch } from "react-router-dom";
import NotFound from "./error/NotFound";
import EventoDetalhePage from "./eventos-detalhes/EventoDetalhePage";
import EventosPage from "./eventos/EventosPage";
import DashboardPage from "./dashboard/DashboardPage";

function Routes() {
  return (
    <Switch>
      <Route path="/" element={<DashboardPage />} />
      <Route path="/dashboard" element={<DashboardPage />} />
      <Route path="/eventos" element={<EventosPage />} />
      <Route path="/eventos/:id" element={<EventoDetalhePage />} />
      <Route path="*" element={<NotFound />} />
    </Switch>
  );
}

export default Routes;
