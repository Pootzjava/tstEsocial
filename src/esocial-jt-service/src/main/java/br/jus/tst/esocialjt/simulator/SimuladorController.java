package br.jus.tst.esocialjt.simulator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Controller REST para o Simulador de Folha (Safe Mode)
 */
@RestController
@RequestMapping("/api/simulador")
@CrossOrigin(origins = "*")
public class SimuladorController {

    @Autowired
    private CalculadoraTributosService calculadoraService;

    /**
     * Simula a apuração de impostos com base nas rubricas enviadas
     */
    @PostMapping("/apuracao")
    public ResponseEntity<SimulacaoSaidaDTO> simularApuracao(@RequestBody List<RubricaSimulacaoDTO> rubricas,
                                                             @RequestParam(defaultValue = "2024-01") String competencia) {
        try {
            SimulacaoSaidaDTO resultado = calculadoraService.simularApuracao(rubricas, competencia);
            return ResponseEntity.ok(resultado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    /**
     * Retorna as tabelas vigentes utilizadas no cálculo (INSS, IRRF, etc)
     */
    @GetMapping("/tabelas-vigentes")
    public ResponseEntity<Map<String, Object>> getTabelasVigentes() {
        Map<String, Object> tabelas = new HashMap<>();
        
        Map<String, String> inss = new HashMap<>();
        inss.put("teto", "7786.02");
        inss.put("aliquota_maxima", "14%");
        tabelas.put("INSS_2024", inss);

        Map<String, String> irrf = new HashMap<>();
        irrf.put("base_isenta", "2259.20");
        irrf.put("deducao_dependente", "189.59");
        tabelas.put("IRRF_2024", irrf);

        Map<String, String> fgts = new HashMap<>();
        fgts.put("aliquota_padrao", "8%");
        tabelas.put("FGTS", fgts);

        return ResponseEntity.ok(tabelas);
    }

    /**
     * Exemplo rápido de simulação com dados fictícios para teste
     */
    @GetMapping("/exemplo")
    public ResponseEntity<SimulacaoSaidaDTO> simularExemplo() {
        List<RubricaSimulacaoDTO> exemplo = Arrays.asList(
            new RubricaSimulacaoDTO("SAL001", "Salário Base", BigDecimal.valueOf(3000.00), "SALARIO", true, true),
            new RubricaSimulacaoDTO("HE001", "Horas Extras", BigDecimal.valueOf(500.00), "PROVENTO", true, true),
            new RubricaSimulacaoDTO("DEP001", "Dependentes", BigDecimal.ZERO, "DEPENDENTE", false, false)
        );
        exemplo.get(2).setQuantidade(2); // 2 dependentes

        SimulacaoSaidaDTO resultado = calculadoraService.simularApuracao(exemplo, "2024-01");
        return ResponseEntity.ok(resultado);
    }
}
