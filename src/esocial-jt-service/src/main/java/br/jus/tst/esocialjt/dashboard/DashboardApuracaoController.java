package br.jus.tst.esocialjt.dashboard;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

/**
 * Controller REST para histórico de apurações do dashboard.
 * Fornece dados para gráficos de evolução mensal de FGTS, IRRF e Contribuições.
 */
@RestController
@RequestMapping("/dashboard/apuracao")
@Slf4j
@Tag(name = "Dashboard - Histórico de Apuração", description = "API de histórico mensal de apurações S-50XX por tenant")
public class DashboardApuracaoController {

    @Autowired
    private DashboardServico dashboardServico;

    /**
     * Retorna histórico mensal de apurações para gráfico de evolução.
     * 
     * @param dataInicio Data inicial do período (opcional, padrão: 12 meses atrás)
     * @param dataFim Data final do período (opcional, padrão: hoje)
     * @return Histórico com valores mensais de FGTS, IRRF e Contribuição Previdenciária
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
        summary = "Histórico Mensal de Apurações",
        description = "Retorna série histórica de apurações S-5010 e S-5020 para gráficos de evolução. " +
                      "Dados isolados por tenant."
    )
    public ResponseEntity<DashboardHistoricoApuracaoDTO> obterHistoricoApuracao(
            @RequestParam(required = false) 
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataInicio,
            @RequestParam(required = false) 
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataFim) {
        
        try {
            log.info("Requisição de histórico de apuração para tenant atual");
            
            // Em implementação futura, chamar serviço para buscar histórico real
            DashboardHistoricoApuracaoDTO historico = dashboardServico.gerarHistoricoApuracao(
                    dataInicio, dataFim);
            
            return ResponseEntity.ok(historico);
            
        } catch (Exception e) {
            log.error("Erro ao obter histórico de apuração", e);
            return ResponseEntity.internalServerError().build();
        }
    }

    /**
     * Retorna ranking de maiores apurações por tipo de evento.
     */
    @GetMapping(path = "/ranking", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(
        summary = "Ranking de Apurações",
        description = "Retorna top 10 maiores valores de apuração por competência."
    )
    public ResponseEntity<?> obterRankingApuracoes() {
        try {
            var ranking = dashboardServico.gerarRankingApuracoes();
            return ResponseEntity.ok(ranking);
        } catch (Exception e) {
            log.error("Erro ao obter ranking de apurações", e);
            return ResponseEntity.internalServerError().build();
        }
    }
}
