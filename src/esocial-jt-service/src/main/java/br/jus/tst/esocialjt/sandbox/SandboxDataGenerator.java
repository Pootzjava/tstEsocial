package br.jus.tst.esocialjt.sandbox;

import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.evento.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Gerador de dados sintéticos para ambiente de Sandbox/Desenvolvimento.
 * Cria eventos, empresas e apurações fictícias para testes e demonstrações.
 */
@Component
@ConfigurationProperties(prefix = "esocial.sandbox")
public class SandboxDataGenerator {

    @Autowired
    private EventoRepository eventoRepository;

    private boolean enabled = true;
    private int qtdEmpresas = 5;
    private int qtdEventosPorEmpresa = 10;

    /**
     * Gera dados sintéticos completos: empresas, eventos e apurações.
     * @return Mapa com resumo dos dados gerados
     */
    public Map<String, Object> gerarDadosSinteticos() {
        if (!enabled) {
            throw new IllegalStateException("Sandbox está desabilitado nas configurações");
        }

        Map<String, Object> resumo = new HashMap<>();
        List<String> cnpjsGerados = new ArrayList<>();

        for (int i = 0; i < qtdEmpresas; i++) {
            String cnpj = gerarCNPJValido();
            cnpjsGerados.add(cnpj);

            // Gera eventos variados para cada empresa
            gerarEventosParaEmpresa(cnpj, i);
        }

        resumo.put("empresasCriadas", qtdEmpresas);
        resumo.put("eventosCriados", qtdEmpresas * qtdEventosPorEmpresa);
        resumo.put("cnpjs", cnpjsGerados);
        resumo.put("dataGeracao", LocalDateTime.now());

        return resumo;
    }

    private void gerarEventosParaEmpresa(String cnpj, int indice) {
        Random random = new Random(indice);
        LocalDate[] competencias = {
            LocalDate.of(2024, 1, 1),
            LocalDate.of(2024, 2, 1),
            LocalDate.of(2024, 3, 1)
        };

        TipoEvento[] tiposEvento = {
            TipoEvento.S1000,
            TipoEvento.S1005,
            TipoEvento.S1200,
            TipoEvento.S2200,
            TipoEvento.S2299,
            TipoEvento.S2300
        };

        Estado[] estados = {
            Estado.PROCESSADO_COM_SUCESSO,
            Estado.PROCESSADO_COM_SUCESSO,
            Estado.PROCESSADO_COM_SUCESSO,
            Estado.ERRO,
            Estado.EM_PROCESSAMENTO
        ];

        for (int j = 0; j < qtdEventosPorEmpresa; j++) {
            Evento evento = new Evento();
            evento.setTipoEvento(tiposEvento[random.nextInt(tiposEvento.length)]);
            evento.setCompetencia(competencias[random.nextInt(competencias.length)]);
            evento.setEstado(estados[random.nextInt(estados.length)]);
            evento.setCnpj(cnpj);
            evento.setCpf(gerarCPFValido(random));
            evento.setDataCriacao(LocalDateTime.now().minusDays(random.nextInt(30)));
            evento.setDataProcessamento(LocalDateTime.now().minusDays(random.nextInt(25)));
            evento.setNumeroLote("LT" + System.currentTimeMillis() + "-" + j);
            evento.setConteudoXml(gerarXmlSintetico(evento.getTipoEvento(), cnpj, evento.getCpf()));
            
            eventoRepository.save(evento);
        }
    }

    private String gerarCNPJValido() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 14; i++) {
            sb.append(random.nextInt(10));
        }
        // Adiciona formatação: XX.XXX.XXX/XXXX-XX
        String cnpj = sb.toString();
        return cnpj.replaceFirst("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
    }

    private String gerarCPFValido(Random random) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            sb.append(random.nextInt(10));
        }
        String cpf = sb.toString();
        return cpf.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }

    private String gerarXmlSintetico(TipoEvento tipo, String cnpj, String cpf) {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
               "<eSocial xmlns=\"http://www.esocial.gov.br/schema/lote/eventos/v" + tipo + "\">\n" +
               "  <evento>\n" +
               "    <ideEmpregador>\n" +
               "      <tpInsc>1</tpInsc>\n" +
               "      <nrInsc>" + cnpj.replaceAll("[^0-9]", "") + "</nrInsc>\n" +
               "    </ideEmpregador>\n" +
               "    <cpf>" + cpf.replaceAll("[^0-9]", "") + "</cpf>\n" +
               "    <dadosSinteticos>Gerado automaticamente pelo Sandbox</dadosSinteticos>\n" +
               "  </evento>\n" +
               "</eSocial>";
    }

    // Getters e Setters
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public int getQtdEmpresas() { return qtdEmpresas; }
    public void setQtdEmpresas(int qtdEmpresas) { this.qtdEmpresas = qtdEmpresas; }
    public int getQtdEventosPorEmpresa() { return qtdEventosPorEmpresa; }
    public void setQtdEventosPorEmpresa(int qtdEventosPorEmpresa) { this.qtdEventosPorEmpresa = qtdEventosPorEmpresa; }
}
