package br.jus.tst.esocialjt.dashboard;

import br.jus.tst.esocialjt.multitenant.CertificadoDinamicoService;
import br.jus.tst.esocialjt.tenant.TenantContext;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller REST Premium para Dashboard Multi-tenant.
 * Todas as endpoints são automaticamente filtradas pelo tenant ativo no contexto.
 */
@RestController
@RequestMapping("/dashboard")
@Slf4j
@Tag(name = "Dashboard", description = "API de estatísticas e indicadores gerenciais por tenant")
public class DashboardController {

    @Autowired
    private DashboardServico dashboardServico;

    /**
     * Retorna estatísticas completas do dashboard para o tenant atual.
     * Os dados são isolados por schema PostgreSQL baseado no header X-Tenant-ID.
     * 
     * @return DashboardEstatisticasDTO com todos os indicadores
     * 
     * Headers obrigatórios:
     * - X-Tenant-ID: Identificador único do tenant (ex: CNPJ)
     * - X-Correlation-ID: ID de correlação para rastreabilidade (opcional, gerado automaticamente)
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
        summary = "Estatísticas do Dashboard por Tenant",
        description = "Retorna indicadores gerenciais completos incluindo: totais de eventos, lotes, certificados, apurações S-50XX e saúde do sistema. " +
                      "Os dados são estritamente isolados por tenant via schema PostgreSQL."
    )
    public ResponseEntity<DashboardEstatisticasDTO> obterDashboard() {
        try {
            String tenantId = TenantContext.getTenantIdStatic();
            
            if (tenantId == null) {
                log.warn("Acesso ao dashboard sem tenant definido");
                return ResponseEntity.badRequest().build();
            }

            log.info("Requisição de dashboard para tenant: {}", tenantId);
            
            DashboardEstatisticasDTO estatisticas = dashboardServico.gerarEstatisticas();
            
            return ResponseEntity.ok(estatisticas);
            
        } catch (IllegalStateException e) {
            log.error("Erro ao gerar dashboard: {}", e.getMessage());
            return ResponseEntity.badRequest().build();
        } catch (Exception e) {
            log.error("Erro inesperado ao gerar dashboard", e);
            return ResponseEntity.internalServerError().build();
        }
    }

    /**
     * Retorna apenas os indicadores de saúde do sistema para o tenant.
     * Endpoint leve para polling frequente em dashboards em tempo real.
     */
    @GetMapping(path = "/saude", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
        summary = "Status de Saúde do Sistema",
        description = "Retorna apenas indicadores críticos: percentual de sucesso, percentual de erro e status geral (SAUDAVEL/ATENCAO/CRITICO)."
    )
    public ResponseEntity<DashboardSaudeDTO> obterSaudeSistema() {
        try {
            DashboardEstatisticasDTO completo = dashboardServico.gerarEstatisticas();
            
            DashboardSaudeDTO saude = DashboardSaudeDTO.builder()
                    .tenantId(completo.getTenantId())
                    .percentualSucesso(completo.getPercentualSucesso())
                    .percentualErro(completo.getPercentualErro())
                    .statusSaude(completo.getStatusSaude())
                    .dataHoraGeracao(completo.getDataHoraGeracao())
                    .build();
            
            return ResponseEntity.ok(saude);
            
        } catch (Exception e) {
            log.error("Erro ao obter saúde do sistema", e);
            return ResponseEntity.internalServerError().build();
        }
    }

    /**
     * Retorna resumo simplificado para cards de dashboard.
     * Ideal para exibição rápida em painéis com múltiplos widgets.
     */
    @GetMapping(path = "/resumo", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
        summary = "Resumo do Dashboard",
        description = "Retorna contadores principais: total de eventos, eventos em fila, processamento, sucesso e erro."
    )
    public ResponseEntity<DashboardResumoDTO> obterResumo() {
        try {
            DashboardEstatisticasDTO completo = dashboardServico.gerarEstatisticas();
            
            DashboardResumoDTO resumo = DashboardResumoDTO.builder()
                    .totalEventos(completo.getTotalEventos())
                    .eventosEmFila(completo.getTotalEventosEmFila())
                    .eventosEmProcessamento(completo.getTotalEventosEmProcessamento())
                    .eventosSucesso(completo.getTotalEventosSucesso())
                    .eventosErro(completo.getTotalEventosErro())
                    .certificadoAtivo(completo.getCertificadoAtivo())
                    .diasParaVencimentoCertificado(completo.getDiasParaVencimentoCertificado())
                    .build();
            
            return ResponseEntity.ok(resumo);
            
        } catch (Exception e) {
            log.error("Erro ao obter resumo do dashboard", e);
            return ResponseEntity.internalServerError().build();
        }
    }
}
