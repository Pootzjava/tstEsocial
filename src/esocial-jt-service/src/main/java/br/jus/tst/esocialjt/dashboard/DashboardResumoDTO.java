package br.jus.tst.esocialjt.dashboard;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO resumido para cards de dashboard.
 * Contém apenas os contadores principais para exibição rápida.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DashboardResumoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long totalEventos;
    private Long eventosEmFila;
    private Long eventosEmProcessamento;
    private Long eventosSucesso;
    private Long eventosErro;
    
    private Boolean certificadoAtivo;
    private Integer diasParaVencimentoCertificado;
}
