package br.jus.tst.esocialjt.filaprioritaria;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO para estatísticas da fila de processamento
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstatisticasFilaDTO {
    
    private int total;
    private long aguardando;
    private long processando;
    private long aguardandoRetry;
    private long erroPermanente;
    private long sucesso;
    
    /**
     * Calcula a taxa de sucesso
     */
    public double getTaxaSucesso() {
        if (total == 0) {
            return 0.0;
        }
        return (double) sucesso / total * 100;
    }
    
    /**
     * Calcula a taxa de erro permanente
     */
    public double getTaxaErro() {
        if (total == 0) {
            return 0.0;
        }
        return (double) erroPermanente / total * 100;
    }
    
    /**
     * Verifica se há eventos críticos na fila
     */
    public boolean hasEventosCriticos() {
        return aguardando > 0 || processando > 0;
    }
}
