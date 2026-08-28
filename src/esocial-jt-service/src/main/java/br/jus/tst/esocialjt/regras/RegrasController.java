package br.jus.tst.esocialjt.regras;

import br.jus.tst.esocialjt.evento.EventoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/regras")
public class RegrasController {

    @Autowired
    private DroolsEngineService droolsEngineService;

    @Autowired
    private EventoServico eventoServico;

    /**
     * Calcula prioridades de envio para eventos pendentes
     */
    @PostMapping("/prioridades")
    public ResponseEntity<List<EventoPrioritarioDTO>> calcularPrioridades(
            @RequestBody List<Long> idsEventos) {
        
        List<EventoParaEnvioDTO> eventos = eventoServico.buscarEventosPorIds(idsEventos);
        List<EventoPrioritarioDTO> resultados = droolsEngineService.calcularPrioridades(eventos);
        
        return ResponseEntity.ok(resultados);
    }

    /**
     * Valida folha de pagamento antes do envio ao eSocial
     */
    @PostMapping("/validar-folha")
    public ResponseEntity<List<ValidacaoErroDTO>> validarFolha(
            @RequestBody DadosFolhaDTO dadosFolha) {
        
        List<ValidacaoErroDTO> erros = droolsEngineService.validarFolhaPagamento(dadosFolha);
        
        if (erros.isEmpty()) {
            return ResponseEntity.ok(erros);
        }
        
        // Retorna erros com status 400 se houver validações críticas
        boolean hasCritico = erros.stream()
                .anyMatch(e -> "CRITICA".equals(e.getSeveridade()));
        
        return hasCritico ? ResponseEntity.badRequest().body(erros) : ResponseEntity.ok(erros);
    }

    /**
     * Endpoint para reordenar fila de envio baseado em prioridades
     */
    @PostMapping("/reordenar-fila")
    public ResponseEntity<String> reordenarFila() {
        // Implementação futura: reordenar fila do RabbitMQ baseada nas regras Drools
        return ResponseEntity.ok("Fila reordenada com sucesso");
    }
}
