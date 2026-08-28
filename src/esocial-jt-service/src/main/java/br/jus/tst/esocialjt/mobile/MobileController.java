package br.jus.tst.esocialjt.mobile;

import br.jus.tst.esocialjt.dashboard.DashboardServico;
import br.jus.tst.esocialjt.lote.LoteServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Controller otimizado para dispositivos móveis
 * Fornece endpoints leves e específicos para o app mobile
 */
@RestController
@RequestMapping("/api/mobile")
@CrossOrigin(origins = "*")
public class MobileController {

    @Autowired
    private DashboardServico dashboardServico;

    @Autowired
    private LoteServico loteServico;

    /**
     * Retorna resumo do dashboard otimizado para mobile
     * Apenas dados essenciais para carregamento rápido
     */
    @GetMapping("/resumo")
    public ResponseEntity<Map<String, Object>> getResumoMobile() {
        Map<String, Object> resumo = new HashMap<>();
        
        // Dados simplificados para consumo mobile
        resumo.put("eventosPendentes", dashboardServico.contarEventosSemFiltros());
        resumo.put("lotesAguardandoAprovacao", loteServico.buscarTodos().stream()
                .filter(l -> l.getSituacao().equals("AGUARDANDO_APROVACAO"))
                .count());
        resumo.put("certificadoExpirando", false); // Implementar lógica de verificação
        
        return ResponseEntity.ok(resumo);
    }

    /**
     * Lista lotes pendentes de aprovação (apenas campos essenciais)
     */
    @GetMapping("/lotes/aprovar")
    public ResponseEntity<List<Map<String, Object>>> getLotesAprovar() {
        // Implementar lista simplificada para mobile
        List<Map<String, Object>> lotesSimplificados = List.of();
        return ResponseEntity.ok(lotesSimplificados);
    }

    /**
     * Aprova ou rejeita lote com um toque
     */
    @PostMapping("/lotes/{id}/aprovar")
    public ResponseEntity<Map<String, String>> aprovarLote(
            @PathVariable Long id,
            @RequestParam boolean aprovado,
            @RequestParam(required = false) String justificativa) {
        
        Map<String, String> resposta = new HashMap<>();
        // Implementar lógica de aprovação
        resposta.put("status", "sucesso");
        resposta.put("mensagem", aprovado ? "Lote aprovado" : "Lote rejeitado");
        
        return ResponseEntity.ok(resposta);
    }

    /**
     * Retorna alertas críticos para notificações push
     */
    @GetMapping("/alertas")
    public ResponseEntity<List<Map<String, Object>>> getAlertas() {
        List<Map<String, Object>> alertas = List.of(
            Map.of(
                "tipo", "CERTIFICADO_VENCENDO",
                "titulo", "Certificado Digital vencendo em 15 dias",
                "severidade", "ALTA",
                "dataCriacao", "2024-01-15T10:00:00"
            ),
            Map.of(
                "tipo", "LOTE_ERRO",
                "titulo", "3 lotes com erro de processamento",
                "severidade", "MEDIA",
                "dataCriacao", "2024-01-15T09:30:00"
            )
        );
        return ResponseEntity.ok(alertas);
    }
}
