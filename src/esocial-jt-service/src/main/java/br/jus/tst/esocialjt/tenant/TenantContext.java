package br.jus.tst.esocialjt.tenant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

/**
 * Gerencia o contexto do tenant ativo durante o ciclo de vida da requisição.
 * Thread-safe através de ThreadLocal.
 * 
 * Versão híbrida: métodos de instância (Spring) e estáticos (acesso direto).
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
        CURRENT_SCHEMA_NAME.set(tenantId); // Schema = tenantId na estratégia schema-per-tenant
        LOGGER.debug("Tenant definido: {}", tenantId);
    }

    /**
     * Retorna o identificador do tenant atual.
     * @return tenantId ou null se não definido
     */
    public String getTenantId() {
        return CURRENT_TENANT_ID.get();
    }

    /**
     * Retorna o nome do schema do tenant atual.
     * @return schemaName ou null se não definido
     */
    public String getSchemaName() {
        return CURRENT_SCHEMA_NAME.get();
    }
    
    /**
     * Limpa o contexto do tenant (chamar no fim da requisição).
     */
    public void clear() {
        CURRENT_TENANT_ID.remove();
        CURRENT_SCHEMA_NAME.remove();
    }
    
    // ==================== MÉTODOS ESTÁTICOS ====================
    // Para uso em componentes que não são beans Spring
    
    public static void setTenantIdStatic(String tenantId) {
        if (tenantId == null || tenantId.trim().isEmpty()) {
            LOGGER.warn("Tentativa de definir tenantId estático nulo ou vazio");
            return;
        }
        CURRENT_TENANT_ID.set(tenantId);
        CURRENT_SCHEMA_NAME.set(tenantId);
        LOGGER.debug("Tenant estático definido: {}", tenantId);
    }
    
    public static String getTenantIdStatic() {
        return CURRENT_TENANT_ID.get();
    }
    
    public static String getSchemaNameStatic() {
        return CURRENT_SCHEMA_NAME.get();
    }
    
    public static void clearStatic() {
        CURRENT_TENANT_ID.remove();
        CURRENT_SCHEMA_NAME.remove();
    }
}
