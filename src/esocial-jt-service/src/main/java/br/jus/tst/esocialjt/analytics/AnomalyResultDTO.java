package br.jus.tst.esocialjt.analytics;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;

/**
 * DTO que representa uma anomalia detectada no sistema.
 */
@Data
@AllArgsConstructor
public class AnomalyResultDTO implements Serializable {
    
    private String type;        // Tipo da anomalia (ex: SALARIO_ATIPICO)
    private String description; // Descrição detalhada do problema
    private String severity;    // Nível: LOW, MEDIUM, HIGH, CRITICAL
    private Double score;       // Score numérico da anomalia (ex: Z-Score)
    
    public AnomalyResultDTO() {}
}
