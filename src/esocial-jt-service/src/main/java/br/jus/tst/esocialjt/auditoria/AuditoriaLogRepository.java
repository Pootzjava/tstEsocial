package br.jus.tst.esocialjt.auditoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AuditoriaLogRepository extends JpaRepository<AuditoriaLog, Long> {

    List<AuditoriaLog> findByUsuarioOrderByTimestampDesc(String usuario);

    List<AuditoriaLog> findByAcaoOrderByTimestampDesc(AcaoAuditoria acao);

    List<AuditoriaLog> findByEntidadeAndEntidadeIdOrderByTimestampDesc(String entidade, String entidadeId);

    List<AuditoriaLog> findByTimestampBetweenOrderByTimestampDesc(LocalDateTime inicio, LocalDateTime fim);

    @Query("SELECT a FROM AuditoriaLog a WHERE " +
           "(:usuario IS NULL OR a.usuario = :usuario) AND " +
           "(:acao IS NULL OR a.acao = :acao) AND " +
           "(:entidade IS NULL OR a.entidade = :entidade) AND " +
           "(:inicio IS NULL OR a.timestamp >= :inicio) AND " +
           "(:fim IS NULL OR a.timestamp <= :fim) AND " +
           "(:tenantId IS NULL OR a.tenantId = :tenantId)")
    List<AuditoriaLog> filtrarLogs(
        @Param("usuario") String usuario,
        @Param("acao") AcaoAuditoria acao,
        @Param("entidade") String entidade,
        @Param("inicio") LocalDateTime inicio,
        @Param("fim") LocalDateTime fim,
        @Param("tenantId") String tenantId
    );

    long countByTimestampBetween(LocalDateTime inicio, LocalDateTime fim);

    long countByUsuarioAndTimestampBetween(String usuario, LocalDateTime inicio, LocalDateTime fim);
}
