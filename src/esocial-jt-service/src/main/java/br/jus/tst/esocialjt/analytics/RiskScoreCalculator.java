package br.jus.tst.esocialjt.analytics;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

/**
 * Calculadora de Score de Risco Trabalhista (0 a 100).
 * Combina múltiplos fatores para gerar um indicador de saúde do compliance.
 */
@Service
public class RiskScoreCalculator {

    /**
     * Calcula o score geral de risco baseado nas anomalias detectadas.
     * Quanto maior o score, maior o risco de passivo trabalhista.
     */
    public int calculateRiskScore(int anomalyCount, int criticalCount, int highCount) {
        int baseScore = 0;
        
        // Peso por quantidade de anomalias
        baseScore += Math.min(anomalyCount * 2, 30); // Máx 30 pontos
        
        // Peso crítico (muito alto)
        baseScore += criticalCount * 25; // Cada crítico adiciona 25 pontos
        
        // Peso alto
        baseScore += highCount * 10; // Cada alto adiciona 10 pontos
        
        // Normaliza para 0-100
        return Math.min(baseScore, 100);
    }

    /**
     * Retorna a classificação visual baseada no score.
     */
    public String getRiskClassification(int score) {
        if (score <= 20) return "LOW";       // Verde
        if (score <= 50) return "MEDIUM";    // Amarelo
        if (score <= 80) return "HIGH";      // Laranja
        return "CRITICAL";                   // Vermelho
    }

    /**
     * Gera recomendações baseadas no score e tipo de risco.
     */
    public Map<String, String> getRecommendations(int score, String classification) {
        Map<String, String> recommendations = new HashMap<>();
        
        if ("CRITICAL".equals(classification)) {
            recommendations.put("action", "Ação Imediata Necessária");
            recommendations.put("detail", "Auditoria completa recomendada antes do próximo envio.");
        } else if ("HIGH".equals(classification)) {
            recommendations.put("action", "Atenção Alta");
            recommendations.put("detail", "Revisar eventos críticos e validar cálculos de folha.");
        } else if ("MEDIUM".equals(classification)) {
            recommendations.put("action", "Monitoramento");
            recommendations.put("detail", "Acompanhar tendências nas próximas competências.");
        } else {
            recommendations.put("action", "Manter Rotina");
            recommendations.put("detail", "Compliance dentro dos padrões esperados.");
        }
        
        return recommendations;
    }
}
