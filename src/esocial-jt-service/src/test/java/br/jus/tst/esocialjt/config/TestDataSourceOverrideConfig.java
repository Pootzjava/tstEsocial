package br.jus.tst.esocialjt.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Configuração de DataSource para testes.
 * Substitui o DataSource multitenant por um DataSource H2 simples.
 */
@Configuration
@ConditionalOnProperty(name = "esocialjt.multitenant.enabled", havingValue = "false", matchIfMissing = false)
public class TestDataSourceOverrideConfig {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}
