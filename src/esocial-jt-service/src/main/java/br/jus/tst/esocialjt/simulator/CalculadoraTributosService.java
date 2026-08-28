package br.jus.tst.esocialjt.simulator;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * Motor de Cálculo Tributário para Simulação de Folha (Safe Mode)
 * Implementa as regras de INSS, IRRF, FGTS e Salário Família vigentes (2024/2025)
 */
@Service
public class CalculadoraTributosService {

    // Tabelas INSS 2024 (Exemplo simplificado - deve ser atualizado anualmente)
    private static final BigDecimal[][] TABELA_INSS = {
            {BigDecimal.valueOf(1412.00), BigDecimal.valueOf(7.5)},
            {BigDecimal.valueOf(2666.68), BigDecimal.valueOf(9.0)},
            {BigDecimal.valueOf(4000.03), BigDecimal.valueOf(12.0)},
            {BigDecimal.valueOf(7786.02), BigDecimal.valueOf(14.0)}
    };

    // Teto do INSS
    private static final BigDecimal TETO_INSS = BigDecimal.valueOf(7786.02);

    // Tabelas IRRF 2024 (Base de cálculo mensal)
    private static final BigDecimal[][] TABELA_IRRF = {
            {BigDecimal.valueOf(2259.20), BigDecimal.valueOf(0.0), BigDecimal.valueOf(0.0)},
            {BigDecimal.valueOf(2826.65), BigDecimal.valueOf(7.5), BigDecimal.valueOf(169.44)},
            {BigDecimal.valueOf(3751.05), BigDecimal.valueOf(15.0), BigDecimal.valueOf(381.44)},
            {BigDecimal.valueOf(4664.68), BigDecimal.valueOf(22.5), BigDecimal.valueOf(662.77)},
            {BigDecimal.valueOf(Double.MAX_VALUE), BigDecimal.valueOf(27.5), BigDecimal.valueOf(896.00)}
    };

    // Alíquota FGTS
    private static final BigDecimal ALIQUOTA_FGTS = BigDecimal.valueOf(8.0);

    // Salário Família (por filho até 14 anos ou inválido)
    private static final BigDecimal SALARIO_FAMILIA_COTA = BigDecimal.valueOf(62.04);
    private static final BigDecimal LIMITE_SALARIO_FAMILIA = BigDecimal.valueOf(1813.36);

    /**
     * Realiza o cálculo completo da apuração com base nas rubricas informadas
     */
    public SimulacaoSaidaDTO simularApuracao(List<RubricaSimulacaoDTO> rubricas, String competencia) {
        BigDecimal totalBruto = BigDecimal.ZERO;
        BigDecimal totalBaseINSS = BigDecimal.ZERO;
        BigDecimal totalBaseIRRF = BigDecimal.ZERO;
        int totalDependentes = 0;
        double menorCnaeFap = 1.0; // Padrão

        for (RubricaSimulacaoDTO r : rubricas) {
            totalBruto = totalBruto.add(r.getValor());
            
            if (r.isCompoeBaseINSS()) {
                totalBaseINSS = totalBaseINSS.add(r.getValor());
            }
            if (r.isCompoeBaseIRRF()) {
                totalBaseIRRF = totalBaseIRRF.add(r.getValor());
            }
            if (r.getTipo().equals("DEPENDENTE")) {
                totalDependentes += r.getQuantidade();
            }
        }

        // Cálculos
        BigDecimal inssEmpregado = calcularINSS(totalBaseINSS);
        BigDecimal irrf = calcularIRRF(totalBaseIRRF.subtract(inssEmpregado), totalDependentes);
        BigDecimal fgts = totalBruto.multiply(ALIQUOTA_FGTS.divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP));
        
        // INSS Patronal (Estimativa genérica 20% + RAT/FAP simplificado)
        BigDecimal inssPatronal = totalBaseINSS.multiply(BigDecimal.valueOf(0.20)); 
        BigDecimal ratFap = inssPatronal.multiply(BigDecimal.valueOf(menorCnaeFap).subtract(BigDecimal.ONE));
        
        BigDecimal totalINSS = inssEmpregado.add(inssPatronal).add(ratFap);
        BigDecimal valorLiquido = totalBruto.subtract(inssEmpregado).subtract(irrf);
        BigDecimal dcftfWebEstimada = totalINSS.add(irrf).add(fgts); // Simplificação

        // Detecção de Anomalias
        List<String> alertas = new java.util.ArrayList<>();
        if (totalBruto.compareTo(BigDecimal.ZERO) > 0 && inssEmpregado.compareTo(BigDecimal.ZERO) == 0) {
            alertas.add("Atenção: INSS do empregado zerado com salário bruto positivo.");
        }
        if (irrf.compareTo(BigDecimal.ZERO) == 0 && totalBruto.compareTo(BigDecimal.valueOf(5000)) > 0) {
            alertas.add("Atenção: IRRF zerado com salário alto. Verificar dependentes ou pensão.");
        }

        return new SimulacaoSaidaDTO(
            competencia,
            totalBruto,
            inssEmpregado,
            inssPatronal.add(ratFap),
            irrf,
            fgts,
            valorLiquido,
            dcftfWebEstimada,
            alertas
        );
    }

    private BigDecimal calcularINSS(BigDecimal salario) {
        if (salario.compareTo(TETO_INSS) > 0) {
            return TETO_INSS.multiply(BigDecimal.valueOf(14.0).divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP)); // Valor máximo aproximado
        }

        BigDecimal imposto = BigDecimal.ZERO;
        BigDecimal restante = salario;
        BigDecimal limiteAnterior = BigDecimal.ZERO;

        for (BigDecimal[] faixa : TABELA_INSS) {
            BigDecimal limiteFaixa = faixa[0];
            BigDecimal aliquota = faixa[1];

            if (restante.compareTo(BigDecimal.ZERO) <= 0) break;

            BigDecimal baseCalculoFaixa = limiteFaixa.subtract(limiteAnterior);
            if (salario.compareTo(limiteFaixa) < 0) {
                baseCalculoFaixa = salario.subtract(limiteAnterior);
            }

            imposto = imposto.add(baseCalculoFaixa.multiply(aliquota.divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP)));
            limiteAnterior = limiteFaixa;
        }
        return imposto.setScale(2, RoundingMode.HALF_UP);
    }

    private BigDecimal calcularIRRF(BigDecimal baseCalculo, int dependentes) {
        BigDecimal deducaoDependente = BigDecimal.valueOf(dependentes).multiply(BigDecimal.valueOf(189.59));
        BigDecimal baseFinal = baseCalculo.subtract(deducaoDependente);

        if (baseFinal.compareTo(BigDecimal.ZERO) < 0) baseFinal = BigDecimal.ZERO;

        for (BigDecimal[] faixa : TABELA_IRRF) {
            BigDecimal limite = faixa[0];
            if (baseFinal.compareTo(limite) < 0) {
                BigDecimal aliquota = faixa[1];
                BigDecimal parcelaDeduzir = faixa[2];
                return baseFinal.multiply(aliquota.divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP))
                        .subtract(parcelaDeduzir)
                        .max(BigDecimal.ZERO)
                        .setScale(2, RoundingMode.HALF_UP);
            }
        }
        return BigDecimal.ZERO;
    }
}
