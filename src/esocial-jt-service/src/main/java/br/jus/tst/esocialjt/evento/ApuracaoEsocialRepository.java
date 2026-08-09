package br.jus.tst.esocialjt.evento;

import br.jus.tst.esocialjt.dominio.ApuracaoEsocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * Repositório JPA para a entidade ApuracaoEsocial.
 * Permite consultas otimizadas para o dashboard premium multi-tenant.
 */
@Repository
public interface ApuracaoEsocialRepository extends JpaRepository<ApuracaoEsocial, Long> {

    /**
     * Busca uma apuração pelo número do recibo (único)
     */
    Optional<ApuracaoEsocial> findByNumeroRecibo(String numeroRecibo);

    /**
     * Busca todas as apurações de um determinado tipo em um período
     * Usado para gerar histórico no dashboard
     */
    List<ApuracaoEsocial> findByTipoEventoAndCompetenciaBetweenOrderByCompetenciaDesc(
        String tipoEvento, 
        LocalDate competenciaInicio, 
        LocalDate competenciaFim
    );

    /**
     * Busca todas as apurações em um período (independente do tipo)
     */
    List<ApuracaoEsocial> findByCompetenciaBetweenOrderByCompetenciaDesc(
        LocalDate competenciaInicio, 
        LocalDate competenciaFim
    );

    /**
     * Query nativa para somar totais por competência (performance)
     * Retorna: [competencia, soma_base_fgts, soma_fgts_mensal, soma_base_irrf, soma_irrf]
     */
    @Query(value = """
        SELECT 
            competencia,
            COALESCE(SUM(total_base_fgts), 0) as totalBaseFgts,
            COALESCE(SUM(total_fgts_mensal), 0) as totalFgtsMensal,
            COALESCE(SUM(total_base_irrf), 0) as totalBaseIrrf,
            COALESCE(SUM(total_irrf), 0) as totalIrrf,
            COALESCE(SUM(total_base_contrib_prev), 0) as totalBaseContribPrev,
            COALESCE(SUM(total_contrib_prev_patronal), 0) as totalContribPrevPatronal,
            COALESCE(SUM(total_contrib_sindical_patronal), 0) as totalContribSindicalPatronal,
            COALESCE(SUM(total_outras_contribuicoes), 0) as totalOutrasContribuicoes
        FROM apuracao_esocial
        WHERE competencia BETWEEN :inicio AND :fim
        GROUP BY competencia
        ORDER BY competencia DESC
        """, nativeQuery = true)
    List<Object[]> buscarTotaisPorCompetencia(
        @Param("inicio") LocalDate inicio,
        @Param("fim") LocalDate fim
    );

    /**
     * Query para ranking das maiores apurações (top 10)
     */
    @Query(value = """
        SELECT 
            competencia,
            tipo_evento,
            (total_base_fgts + total_fgts_mensal + total_base_irrf + total_irrf) as valorTotal
        FROM apuracao_esocial
        WHERE competencia BETWEEN :inicio AND :fim
        ORDER BY valorTotal DESC
        LIMIT 10
        """, nativeQuery = true)
    List<Object[]> buscarRankingApuracoes(
        @Param("inicio") LocalDate inicio,
        @Param("fim") LocalDate fim
    );
}
