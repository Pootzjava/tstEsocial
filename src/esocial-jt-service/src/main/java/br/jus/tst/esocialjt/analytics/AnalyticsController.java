package br.jus.tst.esocialjt.analytics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

/**
 * API REST para exposição de insights preditivos e score de risco.
 */
@RestController
@RequestMapping("/api/analytics")
@CrossOrigin(origins = "*")
public class AnalyticsController {

    @Autowired
    private AnomalyDetectionService anomalyDetectionService;

    @Autowired
    private RiskScoreCalculator riskScoreCalculator;

    /**
     * Endpoint principal que retorna o dashboard analítico completo.
     * GET /api/analytics/dashboard
     */
    @GetMapping("/dashboard")
    public Map<String, Object> getAnalyticsDashboard() {
        Map<String, Object> response = new HashMap<>();
        
        // Simulação de dados (em produção viria do banco)
        List<Double> salaries = Arrays.asList(2500.0, 2600.0, 2550.0, 15000.0, 2700.0); // 15000 é outlier
        List<AnomalyResultDTO> anomalies = anomalyDetectionService.detectSalaryAnomalies(salaries, "Cargo: Vendedor");
        
        int criticalCount = (int) anomalies.stream().filter(a -> "CRITICAL".equals(a.getSeverity())).count();
        int highCount = (int) anomalies.stream().filter(a -> "HIGH".equals(a.getSeverity())).count();
        
        int riskScore = riskScoreCalculator.calculateRiskScore(anomalies.size(), criticalCount, highCount);
        String classification = riskScoreCalculator.getRiskClassification(riskScore);
        Map<String, String> recommendations = riskScoreCalculator.getRecommendations(riskScore, classification);
        
        response.put("riskScore", riskScore);
        response.put("classification", classification);
        response.put("anomalies", anomalies);
        response.put("totalAnomalies", anomalies.size());
        response.put("recommendations", recommendations);
        response.put("generatedAt", new Date());
        
        return response;
    }

    /**
     * Retorna apenas o score de risco atual.
     * GET /api/analytics/score
     */
    @GetMapping("/score")
    public Map<String, Object> getRiskScore() {
        Map<String, Object> response = new HashMap<>();
        int score = 45; // Exemplo fixo para demonstração
        response.put("score", score);
        response.put("classification", riskScoreCalculator.getRiskClassification(score));
        response.put("maxScore", 100);
        return response;
    }

    /**
     * Lista todas as anomalias detectadas com filtros opcionais.
     * GET /api/analytics/anomalies?severity=HIGH
     */
    @GetMapping("/anomalies")
    public List<AnomalyResultDTO> listAnomalies(
            @RequestParam(required = false) String severity) {
        
        List<AnomalyResultDTO> allAnomalies = new ArrayList<>();
        // Em produção: buscar do banco de dados
        allAnomalies.add(new AnomalyResultDTO("SALARIO_ATIPICO", "Salário muito acima da média", "HIGH", 3.2));
        allAnomalies.add(new AnomalyResultDTO("FERIAS_VENCIDAS", "Funcionário sem férias há 26 meses", "CRITICAL", 26.0));
        
        if (severity != null) {
            return allAnomalies.stream()
                    .filter(a -> a.getSeverity().equals(severity))
                    .toList();
        }
        return allAnomalies;
    }
}
