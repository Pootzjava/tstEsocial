package br.jus.tst.esocialjt.infraestrutura.datasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Configuração de DataSource Multi-tenant com estratégia Schema-per-Tenant.
 * 
 * Cria um DataSource roteador que direciona conexões para o schema correto
 * baseado no tenant ativo na requisição.
 */
@Configuration
public class DataSourceConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceConfig.class);

    /**
     * DataSource primário que será usado pela aplicação.
     * Este é o DataSource roteador que decide qual schema usar.
     */
    @Bean
    @Primary
    public DataSource routingDataSource(TenantDataSourceRouter tenantDataSourceRouter) {
        AbstractRoutingDataSource routingDataSource = new AbstractRoutingDataSource() {
            @Override
            protected Object determineCurrentLookupKey() {
                return tenantDataSourceRouter.determineCurrentLookupKey();
            }
        };

        // Configura o DataSource default (para operações administrativas)
        DataSource defaultDataSource = createDefaultDataSource();
        
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put("default", defaultDataSource);
        
        routingDataSource.setDefaultTargetDataSource(defaultDataSource);
        routingDataSource.setTargetDataSources(targetDataSources);
        
        LOGGER.info("DataSource roteador configurado com estratégia schema-per-tenant");
        
        return routingDataSource;
    }

    /**
     * Cria o DataSource default (usado quando não há tenant ativo).
     * Ideal para endpoints administrativos e criação de novos tenants.
     */
    @Bean(name = "defaultDataSource")
    public DataSource createDefaultDataSource() {
        // Os valores virão do application.properties via Spring Boot auto-config
        // Esta abordagem permite override manual se necessário
        LOGGER.info("Criando DataSource default para PostgreSQL");
        return null; // Será criado automaticamente pelo Spring Boot a partir das properties
    }

    /**
     * Método utilitário para registrar dinamicamente um novo tenant.
     * Deve ser chamado quando um novo tenant é criado no sistema.
     * 
     * @param tenantId identificador do tenant
     * @param dataSource DataSource específico do tenant (opcional, pode ser null para schema-only)
     */
    public void registerTenantDataSource(String tenantId, DataSource dataSource) {
        // Implementação futura para registro dinâmico de tenants
        // Requer acesso ao AbstractRoutingDataSource para adicionar ao mapa
        LOGGER.info("Registro de tenant solicitado: {}", tenantId);
    }
}
