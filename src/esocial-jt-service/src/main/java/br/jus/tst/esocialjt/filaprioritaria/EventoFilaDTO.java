package br.jus.tst.esocialjt.filaprioritaria;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * DTO para representar um evento na fila de processamento com prioridade.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventoFilaDTO {
    
    private Long idEvento;
    private String tipoEvento;
    private String cpfCnpj;
    private PrioridadeEvento prioridade;
    private int tentativasProcessamento;
    private LocalDateTime dataCriacao;
    private LocalDateTime ultimaTentativa;
    private LocalDateTime proximaTentativa;
    private String motivoErro;
    private EstadoFila estado;
    
    /**
     * Estados possíveis de um evento na fila
     */
    public enum EstadoFila {
        AGUARDANDO,      // Aguardando processamento
        PROCESSANDO,     // Sendo processado atualmente
        AGUARDANDO_RETRY,// Aguardando nova tentativa (backoff)
        ERRO_PERMANENTE, // Erro não recuperável
        SUCESSO          // Processado com sucesso
    }
    
    /**
     * Calcula o tempo de backoff exponencial baseado no número de tentativas
     * Fórmula: 2^tentativas * 30 segundos (máximo 4 horas)
     */
    public long calcularBackoffSegundos() {
        if (tentativasProcessamento == 0) {
            return 0;
        }
        
        long backoff = (long) Math.pow(2, tentativasProcessamento) * 30;
        long maxBackoff = 4 * 60 * 60; // 4 horas em segundos
        
        return Math.min(backoff, maxBackoff);
    }
    
    /**
     * Verifica se o evento está elegível para retry baseado no backoff
     */
    public boolean isElegivelParaRetry() {
        if (estado != EstadoFila.AGUARDANDO_RETRY) {
            return false;
        }
        
        if (proximaTentativa == null) {
            return true;
        }
        
        return LocalDateTime.now().isAfter(proximaTentativa);
    }
}
