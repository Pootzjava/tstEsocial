package br.jus.tst.esocialjt.connector;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IntegracaoConfigRepository extends JpaRepository<IntegracaoConfig, Long> {
    List<IntegracaoConfig> findBySistemaOrigem(String sistemaOrigem);
    List<IntegracaoConfig> findByStatus(IntegracaoConfig.StatusIntegracao status);
}
