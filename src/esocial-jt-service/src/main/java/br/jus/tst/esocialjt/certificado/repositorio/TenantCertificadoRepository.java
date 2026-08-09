package br.jus.tst.esocialjt.certificado.repositorio;

import br.jus.tst.esocialjt.certificado.negocio.TenantCertificadoDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

/**
 * Repositório para gerenciamento de certificados digitais por tenant.
 * 
 * EM PRODUÇÃO: Esta classe deve ser implementada com JPA/Hibernate ou
 * MyBatis para persistência em banco PostgreSQL.
 * 
 * Tabela esperada: tenant_certificado
 * - id (BIGSERIAL PRIMARY KEY)
 * - tenant_id (VARCHAR(100) NOT NULL UNIQUE)
 * - conteudo_certificado (BYTEA NOT NULL) - certificado criptografado
 * - senha_certificado (VARCHAR(500) NOT NULL) - senha criptografada
 * - tipo_certificado (VARCHAR(20) DEFAULT 'pkcs12')
 * - alias_certificado (VARCHAR(200))
 * - caminho_arquivo (VARCHAR(500)) - para certificados A3 (token/cartão)
 * - caminho_cacerts (VARCHAR(500))
 * - senha_cacerts (VARCHAR(100) DEFAULT 'changeit')
 * - data_validade (DATE)
 * - ativo (BOOLEAN DEFAULT TRUE)
 * - criado_em (TIMESTAMP DEFAULT CURRENT_TIMESTAMP)
 * - atualizado_em (TIMESTAMP)
 */
@Repository
public class TenantCertificadoRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(TenantCertificadoRepository.class);
    
    private final JdbcTemplate jdbcTemplate;

    public TenantCertificadoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * Busca o certificado ativo associado a um tenant.
     * 
     * @param tenantId identificador do tenant
     * @return Optional contendo o certificado ou vazio se não encontrado
     */
    public Optional<TenantCertificadoDTO> findByTenantId(String tenantId) {
        String sql = """
            SELECT 
                id, tenant_id, conteudo_certificado, senha_certificado,
                tipo_certificado, alias_certificado, caminho_arquivo,
                caminho_cacerts, senha_cacerts, data_validade, ativo
            FROM tenant_certificado
            WHERE tenant_id = ? AND ativo = TRUE
            """;
        
        try {
            TenantCertificadoDTO dto = jdbcTemplate.queryForObject(
                sql,
                new TenantCertificadoRowMapper(),
                tenantId
            );
            
            LOGGER.debug("Certificado encontrado para tenant: {}", tenantId);
            return Optional.ofNullable(dto);
            
        } catch (Exception e) {
            LOGGER.debug("Nenhum certificado encontrado para tenant {}: {}", tenantId, e.getMessage());
            return Optional.empty();
        }
    }

    /**
     * Verifica se um tenant possui certificado válido configurado.
     * 
     * @param tenantId identificador do tenant
     * @return true se existir certificado ativo
     */
    public boolean existsByTenantId(String tenantId) {
        String sql = "SELECT COUNT(*) FROM tenant_certificado WHERE tenant_id = ? AND ativo = TRUE";
        
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, tenantId);
        return count != null && count > 0;
    }

    /**
     * Salva ou atualiza o certificado de um tenant.
     * 
     * @param dto dados do certificado
     * @return ID do registro salvo
     */
    public Long save(TenantCertificadoDTO dto) {
        if (dto.getId() == null) {
            return insert(dto);
        } else {
            update(dto);
            return dto.getId();
        }
    }

    private Long insert(TenantCertificadoDTO dto) {
        String sql = """
            INSERT INTO tenant_certificado (
                tenant_id, conteudo_certificado, senha_certificado,
                tipo_certificado, alias_certificado, caminho_arquivo,
                caminho_cacerts, senha_cacerts, data_validade, ativo
            ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
            RETURNING id
            """;
        
        // Em produção: implementar criptografia dos dados sensíveis
        byte[] conteudoCriptografado = dto.getConteudoCertificado();
        String senhaCriptografada = dto.getSenhaCertificado(); // TODO: Criptografar
        
        Number id = jdbcTemplate.queryForObject(
            sql,
            Number.class,
            dto.getTenantId(),
            conteudoCriptografado,
            senhaCriptografada,
            dto.getTipoCertificado(),
            dto.getAliasCertificado(),
            dto.getCaminhoArquivo(),
            dto.getCaminhoCacerts(),
            dto.getSenhaCacerts(),
            dto.getDataValidade(),
            dto.isAtivo()
        );
        
        LOGGER.info("Certificado inserido para tenant {} com ID {}", dto.getTenantId(), id);
        return id.longValue();
    }

    private void update(TenantCertificadoDTO dto) {
        String sql = """
            UPDATE tenant_certificado SET
                conteudo_certificado = ?,
                senha_certificado = ?,
                tipo_certificado = ?,
                alias_certificado = ?,
                caminho_arquivo = ?,
                caminho_cacerts = ?,
                senha_cacerts = ?,
                data_validade = ?,
                ativo = ?,
                atualizado_em = CURRENT_TIMESTAMP
            WHERE tenant_id = ?
            """;
        
        jdbcTemplate.update(
            sql,
            dto.getConteudoCertificado(),
            dto.getSenhaCertificado(),
            dto.getTipoCertificado(),
            dto.getAliasCertificado(),
            dto.getCaminhoArquivo(),
            dto.getCaminhoCacerts(),
            dto.getSenhaCacerts(),
            dto.getDataValidade(),
            dto.isAtivo(),
            dto.getTenantId()
        );
        
        LOGGER.info("Certificado atualizado para tenant {}", dto.getTenantId());
    }

    /**
     * RowMapper para converter ResultSet em TenantCertificadoDTO.
     */
    private static class TenantCertificadoRowMapper implements RowMapper<TenantCertificadoDTO> {
        
        @Override
        public TenantCertificadoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
            TenantCertificadoDTO dto = new TenantCertificadoDTO();
            
            dto.setId(rs.getLong("id"));
            dto.setTenantId(rs.getString("tenant_id"));
            dto.setConteudoCertificado(rs.getBytes("conteudo_certificado"));
            dto.setSenhaCertificado(rs.getString("senha_certificado"));
            dto.setTipoCertificado(rs.getString("tipo_certificado"));
            dto.setAliasCertificado(rs.getString("alias_certificado"));
            dto.setCaminhoArquivo(rs.getString("caminho_arquivo"));
            dto.setCaminhoCacerts(rs.getString("caminho_cacerts"));
            dto.setSenhaCacerts(rs.getString("senha_cacerts"));
            dto.setDataValidade(rs.getString("data_validade"));
            dto.setAtivo(rs.getBoolean("ativo"));
            
            return dto;
        }
    }
}
