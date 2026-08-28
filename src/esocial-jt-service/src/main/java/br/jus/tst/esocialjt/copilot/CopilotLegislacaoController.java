package br.jus.tst.esocialjt.copilot;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Controller para consultas legislativas via Copilot.
 * Endpoint dedicado para dúvidas sobre legislação do eSocial.
 */
@RestController
@RequestMapping("/api/copilot")
@RequiredArgsConstructor
@Slf4j
public class CopilotLegislacaoController {

    private final LegislationSearchService legislationSearchService;

    /**
     * Consulta a base de conhecimento legislativo.
     * @param query Pergunta do usuário
     * @return Lista de respostas relevantes com fundamentação legal
     */
    @GetMapping("/consultar-legislacao")
    public Map<String, Object> consultarLegislacao(@RequestParam String query) {
        log.info("Consulta legislativa recebida: {}", query);
        
        List<LegislacaoDTO> resultados = legislationSearchService.search(query);
        
        Map<String, Object> response = new HashMap<>();
        response.put("query", query);
        response.put("resultados", resultados);
        response.put("total", resultados.size());
        
        if (resultados.isEmpty()) {
            response.put("mensagem", "Não encontramos legislação específica para sua dúvida. Tente reformular a pergunta ou contate o suporte.");
        }
        
        return response;
    }
}
