package br.jus.tst.esocialjt.validacao;

import br.jus.tst.esocialjt.dominio.Evento;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/validacoes")
@RequiredArgsConstructor
@Tag(name = "Validações de Folha", description = "API para validação preventiva de eventos do eSocial")
public class ValidacaoController {

    private final ValidadorFolhaPagamentoService validadorService;

    @PostMapping("/validar-lote")
    @Operation(summary = "Validar lote de eventos", 
               description = "Realiza validações preventivas em um lote de eventos antes do envio ao eSocial. Retorna erros e avisos.")
    public ResponseEntity<List<ResultadoValidacaoDTO>> validarLote(@RequestBody List<Evento> eventos) {
        List<ResultadoValidacaoDTO> resultados = validadorService.validarEventos(eventos);
        
        // Retorna 200 se não houver erros críticos, 400 se houver pelo menos um erro
        boolean temErro = resultados.stream()
                .anyMatch(r -> r.getTipo() == ResultadoValidacaoDTO.TipoValidacao.ERRO);
        
        if (temErro) {
            return ResponseEntity.badRequest().body(resultados);
        }
        return ResponseEntity.ok(resultados);
    }

    @GetMapping("/resumo")
    @Operation(summary = "Resumo de validações", 
               description = "Retorna contagem de erros e avisos encontrados nas últimas validações")
    public ResponseEntity<ResumoValidacaoDTO> getResumo() {
        // Implementação simplificada - pode ser expandida para buscar do banco
        ResumoValidacaoDTO resumo = new ResumoValidacaoDTO(0L, 0L, 0L);
        return ResponseEntity.ok(resumo);
    }

    /**
     * DTO simples para resumo de validações
     */
    public record ResumoValidacaoDTO(
        Long totalValidacoes,
        Long totalErros,
        Long totalAvisos
    ) {}
}
