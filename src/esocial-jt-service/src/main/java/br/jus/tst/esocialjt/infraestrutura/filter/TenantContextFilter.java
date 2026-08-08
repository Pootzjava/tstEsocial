package br.jus.tst.esocialjt.infraestrutura.filter;

import br.jus.tst.esocialjt.tenant.TenantContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * Filtro responsável por:
 * 1. Extrair o tenant ID do header da requisição
 * 2. Configurar o contexto do tenant
 * 3. Gerar Correlation ID para rastreabilidade de logs
 */
@Component
@Order(1)
public class TenantContextFilter extends OncePerRequestFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(TenantContextFilter.class);
    
    private static final String TENANT_ID_HEADER = "X-Tenant-ID";
    private static final String CORRELATION_ID_HEADER = "X-Correlation-ID";
    private static final String MDC_CORRELATION_ID = "correlationId";
    private static final String MDC_TENANT_ID = "tenantId";

    private final TenantContext tenantContext;

    public TenantContextFilter(TenantContext tenantContext) {
        this.tenantContext = tenantContext;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, 
                                    HttpServletResponse response, 
                                    FilterChain filterChain) 
            throws ServletException, IOException {
        
        try {
            // Extrai tenant ID do header
            String tenantId = request.getHeader(TENANT_ID_HEADER);
            
            // Gera correlation ID único para esta requisição
            String correlationId = UUID.randomUUID().toString();
            
            // Configura MDC para logs estruturados
            MDC.put(MDC_CORRELATION_ID, correlationId);
            
            if (tenantId != null && !tenantId.trim().isEmpty()) {
                tenantContext.setTenantId(tenantId);
                MDC.put(MDC_TENANT_ID, tenantId);
                LOGGER.debug("Requisição processada para tenant: {}", tenantId);
            } else {
                LOGGER.debug("Requisição sem tenant ID - possível operação administrativa");
            }
            
            // Adiciona correlation ID na resposta para debugging
            response.setHeader(CORRELATION_ID_HEADER, correlationId);
            
            filterChain.doFilter(request, response);
            
        } finally {
            // Limpeza obrigatória para evitar vazamento de contexto entre threads
            tenantContext.clear();
            MDC.clear();
        }
    }
}
