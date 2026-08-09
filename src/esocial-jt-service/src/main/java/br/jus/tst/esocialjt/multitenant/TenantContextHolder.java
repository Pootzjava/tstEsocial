package br.jus.tst.esocialjt.multitenant;

import br.jus.tst.esocialjt.tenant.TenantContext;

/**
 * Classe utilitária para acesso ao contexto do tenant.
 * Facilita o uso do TenantContext em classes que não são beans Spring.
 * 
 * @author eSocial-JT
 */
public class TenantContextHolder {

    /**
     * Define o tenant ID no contexto atual.
     */
    public static void setTenantId(String tenantId) {
        TenantContext.setTenantIdStatic(tenantId);
    }

    /**
     * Obtém o tenant ID do contexto atual.
     */
    public static String getTenantId() {
        return TenantContext.getTenantIdStatic();
    }

    /**
     * Limpa o contexto do tenant.
     */
    public static void clear() {
        TenantContext.clearStatic();
    }

    private TenantContextHolder() {
        // Classe utilitária não instanciável
    }
}
