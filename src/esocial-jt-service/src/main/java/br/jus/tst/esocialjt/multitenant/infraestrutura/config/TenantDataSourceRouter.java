package br.jus.tst.esocialjt.multitenant.infraestrutura.config;

import br.jus.tst.esocialjt.tenant.TenantContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Implementação de DataSource dinâmico para roteamento por tenant.
 * Cada requisição usa o schema PostgreSQL associado ao tenant ativo.
 * 
 * Estratégia: Schema-per-tenant no PostgreSQL
 * - Vantagens: Isolamento lógico de dados, custo otimizado, backup por schema
 * - Schema naming: tenant_<id> em lowercase
 */
public class TenantDataSourceRouter extends AbstractRoutingDataSource {

    private static final Logger LOGGER = LoggerFactory.getLogger(TenantDataSourceRouter.class);

    public TenantDataSourceRouter() {
        // Construtor padrão para evitar dependência circular
    }

    @Override
    protected Object determineCurrentLookupKey() {
        String schemaName = TenantContext.getSchemaNameStatic();
        
        if (schemaName == null) {
            LOGGER.debug("Não há tenant ativo no contexto - usando datasource default");
            return "default";
        }
        
        LOGGER.debug("Roteando para schema do tenant: {}", schemaName);
        return schemaName;
    }
}
