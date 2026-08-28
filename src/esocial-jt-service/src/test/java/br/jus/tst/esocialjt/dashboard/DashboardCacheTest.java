package br.jus.tst.esocialjt.dashboard;

import br.jus.tst.esocialjt.tenant.TenantContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Testes de integração para cache do dashboard.
 * Valida que o cache Caffeine está configurado corretamente.
 */
@SpringBootTest
@ActiveProfiles("test")
class DashboardCacheTest {

    @Autowired
    private CacheManager cacheManager;

    @Autowired
    private DashboardServico dashboardServico;

    @BeforeEach
    void setUp() {
        TenantContext.setTenantId("tenant-test-cache");
    }

    @Test
    void deveTerCacheManagerConfigurado() {
        assertThat(cacheManager).isNotNull();
        assertThat(cacheManager.getCacheNames()).contains("dashboard-estatisticas");
    }

    @Test
    void deveUsarCaffeineComoImplementacao() {
        assertThat(cacheManager.getClass().getName())
                .containsIgnoringCase("caffeine");
    }

    @Test
    void deveArmazenarResultadoNoCache() {
        // Limpa cache antes do teste
        cacheManager.getCache("dashboard-estatisticas").clear();

        // Primeira chamada - deve executar consulta
        DashboardEstatisticasDTO resultado1 = dashboardServico.gerarEstatisticas();
        assertThat(resultado1).isNotNull();

        // Segunda chamada - deve vir do cache (mesmo tenant)
        DashboardEstatisticasDTO resultado2 = dashboardServico.gerarEstatisticas();
        assertThat(resultado2).isSameAs(resultado1);
    }

    @Test
    void deveDiferenciarCachePorTenant() {
        // Limpa cache
        cacheManager.getCache("dashboard-estatisticas").clear();

        // Gera para tenant 1
        TenantContext.setTenantId("tenant-1");
        DashboardEstatisticasDTO dto1 = dashboardServico.gerarEstatisticas();

        // Gera para tenant 2
        TenantContext.setTenantId("tenant-2");
        DashboardEstatisticasDTO dto2 = dashboardServico.gerarEstatisticas();

        // Devem ser instâncias diferentes
        assertThat(dto1).isNotSameAs(dto2);
        assertThat(dto1.getTenantId()).isEqualTo("tenant-1");
        assertThat(dto2.getTenantId()).isEqualTo("tenant-2");
    }
}
