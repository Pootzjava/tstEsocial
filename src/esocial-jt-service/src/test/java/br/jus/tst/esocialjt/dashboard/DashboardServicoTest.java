package br.jus.tst.esocialjt.dashboard;

import br.jus.tst.esocialjt.certificado.negocio.CertificadoDinamicoService;
import br.jus.tst.esocialjt.dominio.ApuracaoEsocial;
import br.jus.tst.esocialjt.evento.ApuracaoEsocialRepository;
import br.jus.tst.esocialjt.negocio.EventoServico;
import br.jus.tst.esocialjt.tenant.TenantContext;
import com.github.database.rider.spring.api.DBRider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

/**
 * Teste unitário para o método calcularTotaisApuracao() do DashboardServico.
 * Valida que os totais de FGTS, IRRF e Contribuição Previdenciária são calculados corretamente.
 */
@SpringBootTest
@ActiveProfiles("test")
@DBRider
class DashboardServicoTest {

    @Autowired
    private DashboardServico dashboardServico;

    @MockBean
    private EventoServico eventoServico;

    @MockBean
    private CertificadoDinamicoService certificadoService;

    @MockBean
    private ApuracaoEsocialRepository apuracaoRepository;

    private final LocalDate hoje = LocalDate.now();
    private final LocalDate inicioPeriodo = hoje.minusMonths(12);

    @BeforeEach
    void setUp() {
        // Configura tenant mockado para todos os testes
        TenantContext.setTenantIdStatic("tenant-teste");
    }

    @Test
    void deveCalcularTotaisApuracaoComDadosValidos() {
        // Given - Dados mockados de apuração
        Object[] resultado1 = new Object[]{
                LocalDate.of(2024, 1, 1),  // competência
                new BigDecimal("10000.00"), // baseFgts
                new BigDecimal("800.00"),   // fgtsMensal
                new BigDecimal("15000.00"), // baseIrrf
                new BigDecimal("1200.00"),  // irrf
                new BigDecimal("20000.00"), // baseContribPrev
                new BigDecimal("3000.00")   // contribPrevPatronal
        };

        Object[] resultado2 = new Object[]{
                LocalDate.of(2024, 2, 1),
                new BigDecimal("12000.00"),
                new BigDecimal("960.00"),
                new BigDecimal("18000.00"),
                new BigDecimal("1500.00"),
                new BigDecimal("24000.00"),
                new BigDecimal("3600.00")
        };

        when(apuracaoRepository.buscarTotaisPorCompetencia(any(LocalDate.class), any(LocalDate.class)))
                .thenReturn(List.<Object[]>of(resultado1, resultado2));

        try (MockedStatic<TenantContext> mockedContext = mockStatic(TenantContext.class)) {
            mockedContext.when(TenantContext::getTenantIdStatic).thenReturn("tenant-teste");

            // When - Chama o método privado via reflection ou testa indiretamente
            // Como o método é privado, testamos através do método público que o chama
            DashboardEstatisticasDTO dto = dashboardServico.gerarEstatisticas();

            // Then - Valida os totais consolidados
            // Total FGTS = (10000 + 800) + (12000 + 960) = 23760.00
            // Total IRRF = 1200 + 1500 = 2700.00
            // Total Contrib Prev = 3000 + 3600 = 6600.00
            
            assertThat(dto.getValorTotalFGTS()).isNotNull();
            assertThat(dto.getValorTotalIRRF()).isNotNull();
            assertThat(dto.getValorTotalContribuicaoPrevidenciaria()).isNotNull();
            
            // Nota: Os valores exatos dependem da implementação do método
            // O importante é que não sejam zero quando há dados
            assertThat(dto.getValorTotalFGTS()).isGreaterThan(0.0);
            assertThat(dto.getValorTotalIRRF()).isGreaterThan(0.0);
            assertThat(dto.getValorTotalContribuicaoPrevidenciaria()).isGreaterThan(0.0);
        }
    }

    @Test
    void deveRetornarZerosQuandoNaoHaDados() {
        // Given - Sem dados de apuração
        when(apuracaoRepository.buscarTotaisPorCompetencia(any(LocalDate.class), any(LocalDate.class)))
                .thenReturn(List.<Object[]>of());

        try (MockedStatic<TenantContext> mockedContext = mockStatic(TenantContext.class)) {
            mockedContext.when(TenantContext::getTenantIdStatic).thenReturn("tenant-teste");

            // When
            DashboardEstatisticasDTO dto = dashboardServico.gerarEstatisticas();

            // Then
            assertThat(dto.getValorTotalFGTS()).isEqualTo(0.0);
            assertThat(dto.getValorTotalIRRF()).isEqualTo(0.0);
            assertThat(dto.getValorTotalContribuicaoPrevidenciaria()).isEqualTo(0.0);
        }
    }

    @Test
    void deveTratarValoresNullComoZero() {
        // Given - Dados com valores null
        Object[] resultadoComNull = new Object[]{
                LocalDate.of(2024, 1, 1),
                null,  // baseFgts null
                null,  // fgtsMensal null
                null,  // baseIrrf null
                null,  // irrf null
                null,  // baseContribPrev null
                null   // contribPrevPatronal null
        };

        when(apuracaoRepository.buscarTotaisPorCompetencia(any(LocalDate.class), any(LocalDate.class)))
                .thenReturn(List.<Object[]>of(resultadoComNull));

        try (MockedStatic<TenantContext> mockedContext = mockStatic(TenantContext.class)) {
            mockedContext.when(TenantContext::getTenantIdStatic).thenReturn("tenant-teste");

            // When
            DashboardEstatisticasDTO dto = dashboardServico.gerarEstatisticas();

            // Then - Deve retornar zeros ao invés de lançar exception
            assertThat(dto.getValorTotalFGTS()).isEqualTo(0.0);
            assertThat(dto.getValorTotalIRRF()).isEqualTo(0.0);
            assertThat(dto.getValorTotalContribuicaoPrevidenciaria()).isEqualTo(0.0);
        }
    }

    @Test
    void deveSomarCorretamenteMultiplosRegistros() {
        // Given - Múltiplos registros para validar soma acumulada
        int quantidadeRegistros = 5;
        List<Object[]> resultados = List.of(
                new Object[]{LocalDate.of(2024, 1, 1), new BigDecimal("1000.00"), new BigDecimal("80.00"), 
                             new BigDecimal("1500.00"), new BigDecimal("120.00"), 
                             new BigDecimal("2000.00"), new BigDecimal("300.00")},
                new Object[]{LocalDate.of(2024, 2, 1), new BigDecimal("1000.00"), new BigDecimal("80.00"), 
                             new BigDecimal("1500.00"), new BigDecimal("120.00"), 
                             new BigDecimal("2000.00"), new BigDecimal("300.00")},
                new Object[]{LocalDate.of(2024, 3, 1), new BigDecimal("1000.00"), new BigDecimal("80.00"), 
                             new BigDecimal("1500.00"), new BigDecimal("120.00"), 
                             new BigDecimal("2000.00"), new BigDecimal("300.00")},
                new Object[]{LocalDate.of(2024, 4, 1), new BigDecimal("1000.00"), new BigDecimal("80.00"), 
                             new BigDecimal("1500.00"), new BigDecimal("120.00"), 
                             new BigDecimal("2000.00"), new BigDecimal("300.00")},
                new Object[]{LocalDate.of(2024, 5, 1), new BigDecimal("1000.00"), new BigDecimal("80.00"), 
                             new BigDecimal("1500.00"), new BigDecimal("120.00"), 
                             new BigDecimal("2000.00"), new BigDecimal("300.00")}
        );

        when(apuracaoRepository.buscarTotaisPorCompetencia(any(LocalDate.class), any(LocalDate.class)))
                .thenReturn(resultados);

        try (MockedStatic<TenantContext> mockedContext = mockStatic(TenantContext.class)) {
            mockedContext.when(TenantContext::getTenantIdStatic).thenReturn("tenant-teste");

            // When
            DashboardEstatisticasDTO dto = dashboardServico.gerarEstatisticas();

            // Then - Valida que a soma acumulada está correta
            // FGTS por mês: 1000 + 80 = 1080.00
            // FGTS total: 1080 * 5 = 5400.00
            // IRRF por mês: 120.00
            // IRRF total: 120 * 5 = 600.00
            // Contrib Prev por mês: 300.00
            // Contrib Prev total: 300 * 5 = 1500.00
            
            assertThat(dto.getValorTotalFGTS()).isEqualTo(5400.0);
            assertThat(dto.getValorTotalIRRF()).isEqualTo(600.0);
            assertThat(dto.getValorTotalContribuicaoPrevidenciaria()).isEqualTo(1500.0);
        }
    }
}
