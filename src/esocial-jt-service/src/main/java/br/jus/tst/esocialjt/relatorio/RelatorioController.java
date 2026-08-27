package br.jus.tst.esocialjt.relatorio;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import net.sf.jasperreports.engine.JRException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@RestController
@RequestMapping("/api/relatorios")
@Tag(name = "Relatórios", description = "API para geração de relatórios em PDF e CSV")
public class RelatorioController {

    @Autowired
    private RelatorioService relatorioService;

    /**
     * Gera e retorna PDF com relatório de apuração da folha
     */
    @GetMapping("/apuracao")
    @Operation(summary = "Baixar PDF de Apuração", description = "Gera relatório PDF com totais de apuração no período")
    public ResponseEntity<byte[]> baixarRelatorioApuracao(
            @RequestParam String inicio,
            @RequestParam String fim,
            @RequestParam(required = false) String tenant) {

        try {
            LocalDate dataInicio = LocalDate.parse(inicio, DateTimeFormatter.ISO_LOCAL_DATE);
            LocalDate dataFim = LocalDate.parse(fim, DateTimeFormatter.ISO_LOCAL_DATE);

            byte[] pdfBytes = relatorioService.gerarRelatorioApuracaoPDF(dataInicio, dataFim, tenant);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentDispositionFormData("attachment", "relatorio_apuracao_" + inicio + "_a_" + fim + ".pdf");
            headers.setContentLength(pdfBytes.length);

            return ResponseEntity.ok()
                    .headers(headers)
                    .body(pdfBytes);

        } catch (DateTimeParseException e) {
            return ResponseEntity.badRequest().build();
        } catch (JRException e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    /**
     * Gera e retorna CSV com validações de folha
     */
    @GetMapping("/validacoes")
    @Operation(summary = "Baixar CSV de Validações", description = "Exporta validações de folha em formato CSV")
    public ResponseEntity<String> baixarValidacoesCSV() {
        // TODO: Implementar quando serviço de validações estiver completo
        String csv = relatorioService.gerarValidacoesCSV(java.util.Collections.emptyList());
        
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        headers.setContentDispositionFormData("attachment", "validacoes_folha.csv");
        
        return ResponseEntity.ok()
                .headers(headers)
                .body(csv);
    }
}
