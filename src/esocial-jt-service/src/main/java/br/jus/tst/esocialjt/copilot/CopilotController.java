package br.jus.tst.esocialjt.copilot;

import br.jus.tst.esocialjt.copilot.CopilotService.RespostaCopilot;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Controller REST do eSocial Copilot.
 * Expõe endpoints para tradução de erros e sugestões preventivas.
 */
@RestController
@RequestMapping("/api/copilot")
@Tag(name = "eSocial Copilot", description = "API de Inteligência Artificial para tradução de erros e sugestões")
@CrossOrigin(origins = "*")
public class CopilotController {

    @Autowired
    private CopilotService copilotService;

    /**
     * Traduz um erro técnico em linguagem humana
     * 
     * @param mensagemErro Mensagem de erro original do eSocial
     * @return Resposta humanizada com explicação, causa e solução
     */
    @GetMapping("/traduzir-erro")
    @Operation(summary = "Traduzir Erro", description = "Converte mensagem técnica de erro em explicação simples com passos de resolução")
    public ResponseEntity<RespostaCopilot> traduzirErro(
            @RequestParam String mensagemErro) {
        
        RespostaCopilot resposta = copilotService.traduzirErro(mensagemErro);
        return ResponseEntity.ok(resposta);
    }

    /**
     * Sugere ações preventivas baseadas em histórico de erros
     * 
     * @param erros Lista de mensagens de erro recentes
     * @return Lista de sugestões preventivas
     */
    @PostMapping("/sugerir-prevencao")
    @Operation(summary = "Sugerir Prevenção", description = "Analisa histórico de erros e retorna ações preventivas recomendadas")
    public ResponseEntity<List<String>> sugerirPrevencao(
            @RequestBody List<String> erros) {
        
        List<String> sugestoes = copilotService.sugerirAcoesPreventivas(erros);
        return ResponseEntity.ok(sugestoes);
    }

    /**
     * Endpoint de saúde do Copilot
     */
    @GetMapping("/health")
    @Operation(summary = "Health Check", description = "Verifica se o serviço Copilot está operacional")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("Copilot OK - Base de conhecimento carregada");
    }
}
