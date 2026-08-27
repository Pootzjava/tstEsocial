package br.jus.tst.esocialjt.relatorio;

import br.jus.tst.esocialjt.dashboard.DashboardHistoricoApuracaoDTO;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class RelatorioService {

    public byte[] gerarRelatorioApuracaoPDF(List<DashboardHistoricoApuracaoDTO> dados, 
                                            String periodoInicio, 
                                            String periodoFim,
                                            String tenantId) throws JRException {
        
        Map<String, Object> params = new HashMap<>();
        params.put("PERIODO_INICIO", periodoInicio != null ? periodoInicio : "N/A");
        params.put("PERIODO_FIM", periodoFim != null ? periodoFim : "N/A");
        params.put("TENANT", tenantId != null ? tenantId : "Geral");
        params.put("DATA_EMISSAO", new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date()));
        
        JRDataSource dataSource = new JRBeanCollectionDataSource(dados);
        
        JasperReport jasperReport = JasperCompileManager.compileReport(
            getClass().getResourceAsStream("/reports/apuracao_folha.jrxml")
        );
        
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, dataSource);
        
        return JasperExportManager.exportReportToPdf(jasperPrint);
    }
}
