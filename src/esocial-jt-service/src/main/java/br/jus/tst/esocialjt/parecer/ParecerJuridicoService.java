package br.jus.tst.esocialjt.parecer;

import br.jus.tst.esocialjt.copilot.CopilotService;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Serviço para geração automática de Pareceres Jurídicos sobre erros críticos do eSocial.
 * Gera documento PDF formal com fundamentação legal, pronto para apresentação a diretores e auditores.
 */
@Service
public class ParecerJuridicoService {

    @Autowired
    private CopilotService copilotService;

    /**
     * Gera parecer jurídico em PDF para um evento com erro crítico.
     */
    public byte[] gerarParecerJuridico(Long eventoId, String tipoEvento, String erroDescricao, String tenant) throws JRException {
        
        // 1. Consultar explicação detalhada do erro via Copilot
        String explicacaoTecnica = copilotService.traduzirErro(erroDescricao);
        String fundamentacaoLegal = copilotService.buscarFundamentacaoLegal(tipoEvento, erroDescricao);
        
        // 2. Preparar dados para o relatório
        Map<String, Object> params = new HashMap<>();
        params.put("titulo", "PARECER TÉCNICO-JURÍDICO - eSocial");
        params.put("numeroParecer", String.format("PJ-%d-%s", eventoId, LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"))));
        params.put("dataEmissao", LocalDate.now().format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy")));
        params.put("empresa", tenant);
        params.put("tipoEvento", tipoEvento);
        params.put("eventoId", eventoId.toString());
        params.put("erroCodigo", extrairCodigoErro(erroDescricao));
        params.put("erroDescricao", erroDescricao);
        params.put("explicacaoTecnica", explicacaoTecnica);
        params.put("fundamentacaoLegal", fundamentacaoLegal);
        params.put("recomendacao", gerarRecomendacao(tipoEvento, erroDescricao));
        params.put("riscoJuridico", calcularRiscoJuridico(tipoEvento, erroDescricao));
        
        // 3. Carregar template Jasper
        JasperReport report = JasperCompileManager.compileReport(
            getClass().getResourceAsStream("/reports/parecer_juridico_template.jrxml")
        );
        
        // 4. Preencher e exportar para PDF
        JasperPrint print = JasperFillManager.fillReport(report, params, new JRBeanCollectionDataSource(Collections.emptyList()));
        
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        JasperExportManager.exportReportToPdfStream(print, outputStream);
        
        return outputStream.toByteArray();
    }
    
    private String extrairCodigoErro(String erroDescricao) {
        if (erroDescricao.contains("Rejeição")) {
            String[] partes = erroDescricao.split(":");
            return partes.length > 0 ? partes[0].trim() : "Desconhecido";
        }
        return "Erro Geral";
    }
    
    private String gerarRecomendacao(String tipoEvento, String erroDescricao) {
        StringBuilder rec = new StringBuilder();
        rec.append("1. Verificar os dados cadastrais do evento ");
        rec.append(tipoEvento);
        rec.append(" no sistema de origem.\n");
        
        if (erroDescricao.toLowerCase().contains("cpf")) {
            rec.append("2. Validar o CPF junto à Receita Federal.\n");
        } else if (erroDescricao.toLowerCase().contains("certificado")) {
            rec.append("2. Renovar ou reinstalar o certificado digital.\n");
        } else if (erroDescricao.toLowerCase().contains("prazo")) {
            rec.append("2. Verificar a competência e data de ocorrência do fato.\n");
        }
        
        rec.append("3. Após correção, realizar novo envio através do módulo de Lotes.\n");
        rec.append("4. Manter este parecer arquivado para fins de auditoria futura.");
        
        return rec.toString();
    }
    
    private String calcularRiscoJuridico(String tipoEvento, String erroDescricao) {
        List<String> errosAltoRisco = Arrays.asList("omissão", "atraso", "valor divergente", "base cálculo");
        List<String> errosMedioRisco = Arrays.asList("cadastro incompleto", "endereco", "banco");
        
        String erroLower = erroDescricao.toLowerCase();
        
        if (errosAltoRisco.stream().anyMatch(erroLower::contains)) {
            return "ALTO - Risco de autuação fiscal ou processo trabalhista iminente.";
        } else if (errosMedioRisco.stream().anyMatch(erroLower::contains)) {
            return "MÉDIO - Necessidade de regularização em até 5 dias úteis.";
        } else {
            return "BAIXO - Erro operacional sem impacto financeiro imediato.";
        }
    }
}
