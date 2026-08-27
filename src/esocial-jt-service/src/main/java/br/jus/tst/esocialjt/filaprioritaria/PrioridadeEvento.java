package br.jus.tst.esocialjt.filaprioritaria;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Níveis de prioridade para processamento de eventos do eSocial.
 * 
 * Regras de negócio:
 * - CRÍTICA: Eventos que impactam obrigações fiscais imediatas ou prazos legais
 * - ALTA: Eventos de admissão/demissão que afetam folha corrente
 * - MEDIA: Eventos periódicos normais
 * - BAIXA: Eventos cadastrais sem impacto imediato
 */
@Getter
@AllArgsConstructor
public enum PrioridadeEvento {
    CRITICA(1, "Crítica", "Eventos com prazo legal vencendo ou impactos fiscais imediatos"),
    ALTA(2, "Alta", "Admissões, demissões e alterações contratuais da folha corrente"),
    MEDIA(3, "Média", "Eventos periódicos normais (S-1200, S-2299, S-2300)"),
    BAIXA(4, "Baixa", "Eventos cadastrais sem urgência (S-1000, S-1010, S-1020)");

    private final int nivel;
    private final String descricao;
    private final String justificativa;

    /**
     * Verifica se esta prioridade é mais urgente que outra
     */
    public boolean isMaisUrgenteQue(PrioridadeEvento outra) {
        return this.nivel < outra.nivel;
    }
}
