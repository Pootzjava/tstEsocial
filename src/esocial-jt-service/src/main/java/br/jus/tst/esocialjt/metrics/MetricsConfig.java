package br.jus.tst.esocialjt.metrics;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Configuração de métricas customizadas para monitoramento do eSocial-JT
 * Integra com Micrometer/Prometheus para expor métricas de negócio
 */
@Component
public class MetricsConfig {

    @Autowired(required = false)
    private MeterRegistry meterRegistry;

    @PostConstruct
    public void init() {
        if (meterRegistry != null) {
            configurarMetricasNegocio();
        }
    }

    private void configurarMetricasNegocio() {
        // Métrica gauge para cache hit ratio (valor inicial 0.0)
        Gauge.builder("esocial.cache.hit.ratio", this, m -> 0.0)
                .description("Taxa de acertos do cache (0.0 a 1.0)")
                .baseUnit("ratio")
                .register(meterRegistry);

        // Métrica gauge para eventos em fila
        Gauge.builder("esocial.eventos.fila.count", this, m -> 0.0)
                .description("Quantidade de eventos na fila de processamento")
                .baseUnit("events")
                .register(meterRegistry);

        // Métrica gauge para certificados próximos do vencimento
        Gauge.builder("esocial.certificados.vencendo.soon", this, m -> 0.0)
                .description("Quantidade de certificados vencendo em menos de 30 dias")
                .baseUnit("certificates")
                .register(meterRegistry);
    }

    /**
     * Customiza etiquetas (tags) padrão para todas as métricas
     */
    @Bean
    public MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
        return registry -> registry.config()
                .commonTags(
                        Tag.of("application", "esocial-jt"),
                        Tag.of("environment", System.getenv("SPRING_PROFILES_ACTIVE") != null ? 
                                System.getenv("SPRING_PROFILES_ACTIVE") : "default")
                );
    }
}
