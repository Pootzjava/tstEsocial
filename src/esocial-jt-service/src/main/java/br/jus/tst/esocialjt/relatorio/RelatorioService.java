package br.jus.tst.esocialjt.relatorio;

import br.jus.tst.esocialjt.dashboard.DashboardHistoricoApuracaoDTO;
import br.jus.tst.esocialjt.dashboard.DashboardServico;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RelatorioService {

    @Autowired
    private DashboardServico dashboardServico;

    /**
     * Gera relatório de apuração em PDF com os dados do período
     */
    public byte[] gerarRelatorioApuracaoPDF(LocalDate inicio, LocalDate fim, String tenant) throws JRException {
        // Buscar dados do dashboard
        List<DashboardHistoricoApuracaoDTO> dados = dashboardServico.buscarHistoricoApuracao(inicio, fim);

        // Carregar template do relatório
        InputStream reportStream = getClass().getResourceAsStream("/reports/apuracao_folha.jrxml");
        if (reportStream == null) {
            throw new JRException("Template do relatório não encontrado: apuracao_folha.jrxml");
        }

        JasperReport jasperReport = JasperCompileManager.compileReport(reportStream);

        // Preparar parâmetros
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("PERIODO_INICIO", inicio.toString());
        parametros.put("PERIODO_FIM", fim.toString());
        parametros.put("TENANT", tenant != null ? tenant : "Geral");
        parametros.put("DATA_EMISSAO", LocalDate.now().toString());

        // Criar datasource a partir dos DTOs
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dados);

        // Preencher e exportar o relatório
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, dataSource);
        
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);

        return outputStream.toByteArray();
    }

    /**
     * Gera CSV com validações de folha para exportação Excel
     */
    public String gerarValidacoesCSV(List<Object> validacoes) {
        StringBuilder csv = new StringBuilder();
        
        // Cabeçalho
        csv.append("Data;Tipo Evento;CPF/CNPJ;Tipo Erro;Descrição;Severidade\n");
        
        // Dados (implementação genérica - adaptar conforme DTO real)
        for (Object validacao : validacoes) {
            // TODO: Implementar conversão específica quando DTO de validação estiver definido
            csv.append(";;Sem dados implementados;;;\n");
        }
        
        return csv.toString();
    }
}
