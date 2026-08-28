package br.jus.tst.esocialjt.parecer;

import br.jus.tst.esocialjt.copilot.CopilotService;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Controller REST para geração de Pareceres Jurídicos automáticos.
 * Endpoint: POST /api/parecer/gerar
 */
@RestController
@RequestMapping("/api/parecer")
public class ParecerJuridicoController {

    @Autowired
    private ParecerJuridicoService parecerService;

    @Autowired
    private CopilotService copilotService;

    /**
     * Gera e retorna PDF de parecer jurídico para um evento com erro.
     */
    @PostMapping("/gerar")
    public ResponseEntity<byte[]> gerarParecer(@RequestBody ParecerRequestDTO request) {
        try {
            byte[] pdfContent = parecerService.gerarParecerJuridico(
                request.getEventoId(),
                request.getTipoEvento(),
                request.getErroDescricao(),
                request.getTenant()
            );

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentDispositionFormData(
                "attachment", 
                String.format("parecer_%s_%s.pdf", request.getTipoEvento(), LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")))
            );

            return ResponseEntity.ok()
                .headers(headers)
                .body(pdfContent);

        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    /**
     * Retorna uma prévia textual do parecer (sem PDF).
     */
    @PostMapping("/previa")
    public ResponseEntity<ParecerPreviewDTO> getPrevia(@RequestBody ParecerRequestDTO request) {
        String explicacao = copilotService.traduzirErro(request.getErroDescricao());
        String fundamentacao = copilotService.buscarFundamentacaoLegal(request.getTipoEvento(), request.getErroDescricao());
        
        ParecerPreviewDTO preview = new ParecerPreviewDTO();
        preview.setTitulo("PARECER TÉCNICO-JURÍDICO - eSocial");
        preview.setNumeroParecer(String.format("PJ-%d-%s", request.getEventoId(), LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"))));
        preview.setEmpresa(request.getTenant());
        preview.setErroDescricao(request.getErroDescricao());
        preview.setExplicacaoTecnica(explicacao);
        preview.setFundamentacaoLegal(fundamentacao);
        preview.setRiscoJuridico(classificarRisco(request.getErroDescricao()));
        
        return ResponseEntity.ok(preview);
    }

    private String classificarRisco(String erroDescricao) {
        String lower = erroDescricao.toLowerCase();
        if (lower.contains("omissão") || lower.contains("atraso") || lower.contains("divergente")) {
            return "ALTO";
        } else if (lower.contains("cadastro") || lower.contains("endereco")) {
            return "MÉDIO";
        }
        return "BAIXO";
    }

    // DTOs
    public static class ParecerRequestDTO {
        private Long eventoId;
        private String tipoEvento;
        private String erroDescricao;
        private String tenant;

        // Getters e Setters
        public Long getEventoId() { return eventoId; }
        public void setEventoId(Long eventoId) { this.eventoId = eventoId; }
        public String getTipoEvento() { return tipoEvento; }
        public void setTipoEvento(String tipoEvento) { this.tipoEvento = tipoEvento; }
        public String getErroDescricao() { return erroDescricao; }
        public void setErroDescricao(String erroDescricao) { this.erroDescricao = erroDescricao; }
        public String getTenant() { return tenant; }
        public void setTenant(String tenant) { this.tenant = tenant; }
    }

    public static class ParecerPreviewDTO {
        private String titulo;
        private String numeroParecer;
        private String empresa;
        private String erroDescricao;
        private String explicacaoTecnica;
        private String fundamentacaoLegal;
        private String riscoJuridico;

        // Getters e Setters
        public String getTitulo() { return titulo; }
        public void setTitulo(String titulo) { this.titulo = titulo; }
        public String getNumeroParecer() { return numeroParecer; }
        public void setNumeroParecer(String numeroParecer) { this.numeroParecer = numeroParecer; }
        public String getEmpresa() { return empresa; }
        public void setEmpresa(String empresa) { this.empresa = empresa; }
        public String getErroDescricao() { return erroDescricao; }
        public void setErroDescricao(String erroDescricao) { this.erroDescricao = erroDescricao; }
        public String getExplicacaoTecnica() { return explicacaoTecnica; }
        public void setExplicacaoTecnica(String explicacaoTecnica) { this.explicacaoTecnica = explicacaoTecnica; }
        public String getFundamentacaoLegal() { return fundamentacaoLegal; }
        public void setFundamentacaoLegal(String fundamentacaoLegal) { this.fundamentacaoLegal = fundamentacaoLegal; }
        public String getRiscoJuridico() { return riscoJuridico; }
        public void setRiscoJuridico(String riscoJuridico) { this.riscoJuridico = riscoJuridico; }
    }
}
