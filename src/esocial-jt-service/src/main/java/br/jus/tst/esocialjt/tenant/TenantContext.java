package br.jus.tst.esocialjt.tenant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

/**
 * Gerencia o contexto do tenant ativo durante o ciclo de vida da requisição.
 * Thread-safe através de ThreadLocal.
 */
@Component
@RequestScope
public class TenantContext {

    private static final Logger LOGGER = LoggerFactory.getLogger(TenantContext.class);
    
    private static final ThreadLocal<String> CURRENT_TENANT_ID = new ThreadLocal<>();
    private static final ThreadLocal<String> CURRENT_SCHEMA_NAME = new ThreadLocal<>();

    /**
     * Define o identificador do tenant para a requisição atual.
     * @param tenantId Identificador único do tenant (ex: CNPJ, UUID)
     */
    public void setTenantId(String tenantId) {
        if (tenantId == null || tenantId.trim().isEmpty()) {
            LOGGER.warn("Tentativa de definir tenantId nulo ou vazio");
            return;
        }
        CURRENT_TENANT_ID.set(tenantId);
        
        // Schema name segue padrão: tenant_<id> em lowercase
        String schemaName = "tenant_" + tenantId.toLowerCase().replaceAll("[^a-z0-9]", "_");
        CURRENT_SCHEMA_NAME.set(schemaName);
        
        LOGGER.debug("Tenant context definido: tenantId={}, schema={}", tenantId, schemaName);
    }

    /**
     * Recupera o identificador do tenant ativo.
     * @return tenantId ou null se não houver contexto
     */
    public String getTenantId() {
        return CURRENT_TENANT_ID.get();
    }

    /**
     * Recupera o nome do schema PostgreSQL associado ao tenant.
     * @return nome do schema ou null
     */
    public String getSchemaName() {
        return CURRENT_SCHEMA_NAME.get();
    }

    /**
     * Limpa o contexto do tenant (obrigatório no fim da requisição).
     */
    public void clear() {
        CURRENT_TENANT_ID.remove();
        CURRENT_SCHEMA_NAME.remove();
    }

    /**
     * Verifica se há um tenant ativo no contexto atual.
     */
    public boolean hasTenant() {
        return CURRENT_TENANT_ID.get() != null;
    }
}
