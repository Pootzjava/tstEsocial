package br.jus.tst.esocialjt.filaprioritaria;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Controller REST para gerenciamento de filas prioritárias
 * 
 * Endpoints:
 * - GET /api/filas/estatisticas - Estatísticas da fila
 * - POST /api/filas/eventos - Adicionar evento manualmente (teste)
 * - GET /api/filas/eventos/proximo - Obter próximo evento para processamento
 * - PUT /api/filas/eventos/{id}/sucesso - Marcar evento como sucesso
 * - PUT /api/filas/eventos/{id}/erro - Marcar evento com erro
 */
@RestController
@RequestMapping("/api/filas")
@Tag(name = "Filas Prioritárias", description = "Gerenciamento de filas com prioridade e retry")
@Slf4j
public class FilasPrioritariasController {

    @Autowired
    private GerenciadorFilasService gerenciadorFilasService;

    /**
     * Retorna estatísticas em tempo real da fila
     */
    @GetMapping("/estatisticas")
    @Operation(summary = "Estatísticas da Fila", description = "Retorna contagem de eventos por estado")
    public ResponseEntity<EstatisticasFilaDTO> getEstatisticas() {
        EstatisticasFilaDTO stats = gerenciadorFilasService.getEstatisticas();
        log.debug("📊 Estatísticas da fila recuperadas: {} eventos totais", stats.getTotal());
        return ResponseEntity.ok(stats);
    }

    /**
     * Adiciona um evento de teste à fila (apenas para desenvolvimento)
     */
    @PostMapping("/eventos")
    @Operation(summary = "Adicionar Evento", description = "Adiciona um evento à fila para teste")
    public ResponseEntity<EventoFilaDTO> adicionarEvento(@RequestBody EventoFilaDTO evento) {
        log.info("📥 Recebida requisição para adicionar evento: {}", evento.getTipoEvento());
        
        EventoFilaDTO eventoAdicionado = gerenciadorFilasService.adicionarEvento(evento);
        
        return ResponseEntity.ok(eventoAdicionado);
    }

    /**
     * Obtém o próximo evento elegível para processamento
     */
    @GetMapping("/eventos/proximo")
    @Operation(summary = "Próximo Evento", description = "Retorna o próximo evento da fila por prioridade")
    public ResponseEntity<EventoFilaDTO> obterProximoEvento() {
        EventoFilaDTO proximo = gerenciadorFilasService.obterProximoEvento();
        
        if (proximo == null) {
            return ResponseEntity.noContent().build();
        }
        
        return ResponseEntity.ok(proximo);
    }

    /**
     * Marca um evento como processado com sucesso
     */
    @PutMapping("/eventos/{id}/sucesso")
    @Operation(summary = "Marcar Sucesso", description = "Marca um evento como processado com sucesso")
    public ResponseEntity<Void> marcarSucesso(@PathVariable Long id) {
        // Em produção, buscaria o evento pelo ID
        // Aqui é apenas demonstrativo
        log.info("✅ Evento {} marcado como sucesso", id);
        return ResponseEntity.ok().build();
    }

    /**
     * Marca um evento com erro
     */
    @PutMapping("/eventos/{id}/erro")
    @Operation(summary = "Marcar Erro", description = "Registra falha no processamento do evento")
    public ResponseEntity<Void> marcarErro(
            @PathVariable Long id,
            @RequestParam String motivo) {
        
        log.warn("❌ Evento {} marcado com erro: {}", id, motivo);
        return ResponseEntity.ok().build();
    }

    /**
     * Health check do serviço de filas
     */
    @GetMapping("/health")
    @Operation(summary = "Health Check", description = "Verifica se o serviço de filas está operacional")
    public ResponseEntity<Map<String, Object>> healthCheck() {
        Map<String, Object> health = new HashMap<>();
        health.put("status", "UP");
        health.put("servico", "Filas Prioritárias");
        health.put("descricao", "Backoff exponencial + Drools Rules");
        
        EstatisticasFilaDTO stats = gerenciadorFilasService.getEstatisticas();
        health.put("eventosAguardando", stats.getAguardando());
        health.put("eventosProcessando", stats.getProcessando());
        
        return ResponseEntity.ok(health);
    }
}
