package br.jus.tst.esocialjt.auditoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/auditoria")
@PreAuthorize("hasAnyRole('ADMIN', 'AUDITOR')")
public class AuditoriaController {

    @Autowired
    private AuditoriaLogService service;

    @GetMapping("/logs")
    public ResponseEntity<List<AuditoriaLog>> listarLogs(
            @RequestParam(required = false) String usuario,
            @RequestParam(required = false) AcaoAuditoria acao,
            @RequestParam(required = false) String entidade,
            @RequestParam(required = false) LocalDateTime inicio,
            @RequestParam(required = false) LocalDateTime fim,
            @RequestHeader(value = "X-Tenant-ID", required = false) String tenantId) {
        
        List<AuditoriaLog> logs = service.buscarLogs(usuario, acao, entidade, inicio, fim, tenantId);
        return ResponseEntity.ok(logs);
    }

    @GetMapping("/logs/{id}")
    public ResponseEntity<AuditoriaLog> buscarLogPorId(@PathVariable Long id) {
        // Implementação simplificada - em produção adicionar busca por ID
        return ResponseEntity.ok(null);
    }

    @GetMapping("/por-entidade")
    public ResponseEntity<List<AuditoriaLog>> buscarPorEntidade(
            @RequestParam String entidade,
            @RequestParam String entidadeId) {
        
        List<AuditoriaLog> logs = service.buscarPorEntidade(entidade, entidadeId);
        return ResponseEntity.ok(logs);
    }

    @GetMapping("/resumo")
    public ResponseEntity<Map<String, Object>> getResumoAuditoria(
            @RequestParam(required = false, defaultValue = "7") int dias) {
        
        LocalDateTime inicio = LocalDateTime.now().minusDays(dias);
        LocalDateTime fim = LocalDateTime.now();
        
        Map<String, Object> resumo = new HashMap<>();
        resumo.put("totalAcoes", service.contarAcoesNoPeriodo(inicio, fim));
        resumo.put("periodoInicio", inicio);
        resumo.put("periodoFim", fim);
        resumo.put("mensagem", "Funcionalidade de resumo detalhado em implementação");
        
        return ResponseEntity.ok(resumo);
    }
}
