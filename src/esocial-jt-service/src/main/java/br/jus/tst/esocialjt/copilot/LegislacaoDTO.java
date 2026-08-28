package br.jus.tst.esocialjt.copilot;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * DTO para representar itens da base de conhecimento legislativo.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LegislacaoDTO {
    
    private String id;
    private String topic;
    private String question;
    private String answer;
    private String legalBasis;
    private String[] tags;
    private String severity;
}
