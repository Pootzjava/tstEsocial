package br.jus.tst.esocialjt.multitenant.infraestrutura.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Configuração de DataSource para suporte a multi-tenancy com schema-per-tenant.
 * 
 * Estratégia:
 * - Cria um DataSource mestre que roteia para schemas dinâmicos
 * - Cada tenant terá seu schema isolado no PostgreSQL
 * - O search_path é alterado automaticamente via TenantContext
 * 
 * @author Analista de Sistemas Sênior - Especialista eSocial
 */
@Configuration("multitenantDataSourceConfig")
public class DataSourceConfig {

    private static final Logger log = LoggerFactory.getLogger(DataSourceConfig.class);

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @Bean
    @Primary
    public DataSource routingDataSource(@Qualifier("defaultDataSource") DataSource defaultDataSource) {
        log.info("Configurando DataSource com roteamento por tenant (Schema-per-Tenant)");
        
        AbstractRoutingDataSource routingDataSource = new TenantDataSourceRouter();
        
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put("public", defaultDataSource);
        
        routingDataSource.setDefaultTargetDataSource(defaultDataSource);
        routingDataSource.setTargetDataSources(targetDataSources);
        routingDataSource.afterPropertiesSet();
        
        log.info("DataSource de roteamento configurado com sucesso");
        return routingDataSource;
    }

    @Bean(name = "defaultDataSource")
    @Configuration("multitenantDataSourceConfig")Properties(prefix = "spring.datasource")
    public DataSource defaultDataSource() {
        log.info("Criando DataSource padrão para PostgreSQL");
        return DataSourceBuilder.create().build();
    }

    @Bean
    public JdbcTemplate jdbcTemplate(@Qualifier("routingDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
