package br.jus.tst.esocialjt.relatorio;

import br.jus.tst.esocialjt.dashboard.DashboardHistoricoApuracaoDTO;
import br.jus.tst.esocialjt.dashboard.DashboardServico;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/api/relatorios")
@CrossOrigin(origins = "*")
public class RelatorioController {

    @Autowired
    private RelatorioService relatorioService;

    @Autowired
    private DashboardServico dashboardServico;

    @GetMapping(value = "/apuracao/pdf", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> gerarRelatorioApuracao(
            @RequestParam(required = false) String periodoInicio,
            @RequestParam(required = false) String periodoFim,
            @RequestHeader(value = "X-Tenant-ID", required = false) String tenantId) {
        
        try {
            LocalDate inicio = periodoInicio != null ? 
                LocalDate.parse(periodoInicio, DateTimeFormatter.ISO_LOCAL_DATE) : 
                LocalDate.now().minusMonths(6);
            
            LocalDate fim = periodoFim != null ? 
                LocalDate.parse(periodoFim, DateTimeFormatter.ISO_LOCAL_DATE) : 
                LocalDate.now();
            
            List<DashboardHistoricoApuracaoDTO> dados = dashboardServico.buscarHistoricoApuracao(
                inicio.toString(), 
                fim.toString()
            );
            
            byte[] pdfContent = relatorioService.gerarRelatorioApuracaoPDF(
                dados, 
                periodoInicio != null ? periodoInicio : inicio.toString(),
                periodoFim != null ? periodoFim : fim.toString(),
                tenantId != null ? tenantId : "default"
            );
            
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentDispositionFormData("attachment", "relatorio_apuracao_" + LocalDate.now() + ".pdf");
            headers.setContentLength(pdfContent.length);
            
            return ResponseEntity.ok()
                    .headers(headers)
                    .body(pdfContent);
                    
        } catch (JRException e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }
}
