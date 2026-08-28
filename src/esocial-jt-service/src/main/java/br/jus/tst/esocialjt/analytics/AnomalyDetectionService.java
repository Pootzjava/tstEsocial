package br.jus.tst.esocialjt.analytics;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Motor de Detecção de Anomalias baseado em Estatística (Z-Score e Desvio Padrão).
 * Identifica padrões suspeitos na folha de pagamento que podem gerar passivo trabalhista.
 */
@Service
public class AnomalyDetectionService {

    private static final double Z_SCORE_THRESHOLD = 2.5; // Limite para considerar anomalia

    /**
     * Analisa uma lista de valores (ex: salários de um cargo) e retorna os outliers.
     */
    public List<AnomalyResultDTO> detectSalaryAnomalies(List<Double> values, String context) {
        List<AnomalyResultDTO> anomalies = new ArrayList<>();
        if (values.size() < 3) return anomalies; // Amostra muito pequena

        double mean = calculateMean(values);
        double stdDev = calculateStdDev(values, mean);

        for (int i = 0; i < values.size(); i++) {
            double value = values.get(i);
            double zScore = (stdDev == 0) ? 0 : (value - mean) / stdDev;

            if (Math.abs(zScore) > Z_SCORE_THRESHOLD) {
                anomalies.add(new AnomalyResultDTO(
                    "SALARIO_ATIPICO",
                    String.format("Salário %.2f desvia %.2f desvios padrão da média (%.2f) no contexto: %s", 
                                  value, zScore, mean, context),
                    "HIGH",
                    zScore
                ));
            }
        }
        return anomalies;
    }

    /**
     * Detecta excesso de horas extras consistentes (risco de processo por exaustão ou erro de cálculo).
     */
    public List<AnomalyResultDTO> detectOvertimePatterns(List<Double> hoursExtraList, String employeeName) {
        List<AnomalyResultDTO> anomalies = new ArrayList<>();
        double avgHours = calculateMean(hoursExtraList);
        
        // Regra de negócio: Média > 2h extras/dia por 3 meses é risco alto
        if (avgHours > 60.0) { // 2h * 30 dias
            anomalies.add(new AnomalyResultDTO(
                "EXCESSO_HORAS_EXTRAS",
                String.format("Funcionário %s tem média de %.1f horas extras/mês. Risco de passivo.", employeeName, avgHours),
                "CRITICAL",
                avgHours / 60.0
            ));
        }
        return anomalies;
    }

    /**
     * Detecta funcionários sem férias registradas há mais de 24 meses (Risco grave).
     * Nota: Esta lógica depende da data da última férias no banco.
     */
    public AnomalyResultDTO checkVacationRisk(Integer monthsSinceLastVacation, String employeeName) {
        if (monthsSinceLastVacation != null && monthsSinceLastVacation > 24) {
            return new AnomalyResultDTO(
                "FERIAS_VENCIDAS",
                String.format("Funcionário %s está há %d meses sem tirar férias. Risco de multa em dobro.", employeeName, monthsSinceLastVacation),
                "CRITICAL",
                (double) monthsSinceLastVacation
            );
        }
        return null;
    }

    private double calculateMean(List<Double> values) {
        return values.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    private double calculateStdDev(List<Double> values, double mean) {
        double sum = values.stream()
                .mapToDouble(v -> Math.pow(v - mean, 2))
                .sum();
        return Math.sqrt(sum / values.size());
    }
}
