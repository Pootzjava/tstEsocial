package br.jus.tst.esocialjt.multitenant.infraestrutura.config;

import br.jus.tst.esocialjt.tenant.TenantContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

/**
 * Implementação de roteamento dinâmico de DataSource baseado no tenant atual.
 * 
 * Estratégia: Schema-per-tenant no PostgreSQL
 * - Cada tenant possui um schema dedicado no mesmo banco de dados
 * - O routing é feito via ThreadLocal (TenantContext)
 * - O search_path do PostgreSQL é alterado dinamicamente
 * 
 * @author Analista de Sistemas Sênior - Especialista eSocial
 */
@Component
public class TenantDataSourceRouter extends AbstractRoutingDataSource {

    private static final Logger log = LoggerFactory.getLogger(TenantDataSourceRouter.class);

    @Override
    protected Object determineCurrentLookupKey() {
        String tenantId = TenantContext.getTenantIdStatic();
        
        if (tenantId == null || tenantId.isBlank()) {
            log.warn("TenantId não definido no contexto. Usando schema 'public' como fallback.");
            return "public";
        }
        
        log.debug("Roteando conexão para o tenant/schema: {}", tenantId);
        return tenantId;
    }
}
