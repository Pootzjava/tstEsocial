package br.jus.tst.esocialjt.multitenant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repositório JPA para gerenciamento de certificados digitais por tenant.
 * 
 * @author eSocial-JT
 */
@Repository
public interface TenantCertificadoRepository extends JpaRepository<TenantCertificado, Long> {

    /**
     * Busca o certificado ativo de um tenant específico.
     * 
     * @param tenantId identificador do tenant
     * @return Optional contendo o certificado se encontrado
     */
    @Query("SELECT tc FROM TenantCertificado tc WHERE tc.tenantId = :tenantId AND tc.ativo = true")
    Optional<TenantCertificado> findByTenantIdAndAtivo(@Param("tenantId") String tenantId);

    /**
     * Verifica se existe certificado ativo para um tenant.
     * 
     * @param tenantId identificador do tenant
     * @return true se existir certificado ativo
     */
    @Query("SELECT COUNT(tc) > 0 FROM TenantCertificado tc WHERE tc.tenantId = :tenantId AND tc.ativo = true")
    boolean existsByTenantIdAndAtivo(@Param("tenantId") String tenantId);

    /**
     * Busca todos os certificados (ativos e inativos) de um tenant.
     * 
     * @param tenantId identificador do tenant
     * @return lista de certificados do tenant
     */
    @Query("SELECT tc FROM TenantCertificado tc WHERE tc.tenantId = :tenantId ORDER BY tc.criadoEm DESC")
    java.util.List<TenantCertificado> findAllByTenantIdOrderByCriadoEmDesc(@Param("tenantId") String tenantId);

    /**
     * Busca certificado pelo número de série.
     * 
     * @param numeroSerie número de série do certificado
     * @return Optional contendo o certificado se encontrado
     */
    Optional<TenantCertificado> findByNumeroSerie(String numeroSerie);

    /**
     * Conta quantos certificados ativos existem no sistema.
     * 
     * @return quantidade de certificados ativos
     */
    long countByAtivoTrue();
}
