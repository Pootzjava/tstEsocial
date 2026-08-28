package br.jus.tst.esocialjt.copilot;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

@Service
public class NlpParserService {

    // Padrões de Regex para extração de entidades
    private static final Pattern CPF_PATTERN = Pattern.compile("\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2}");
    private static final Pattern CNPJ_PATTERN = Pattern.compile("\\d{2}\\.?\\d{3}\\.?\\d{3}/?\\d{4}-?\\d{2}");
    private static final Pattern SALARIO_PATTERN = Pattern.compile("(?:salário|valor|pagar)\\s*[R$]?\\s*([\\d.,]+)", Pattern.CASE_INSENSITIVE);
    private static final Pattern DATA_PATTERN = Pattern.compile("(\\d{1,2})/(\\d{1,2})/(\\d{4})");
    private static final Pattern NOME_PATTERN = Pattern.compile("(?:nome|trabalhador|funcionário)\\s+([A-Za-zÀ-ÿ\\s]+?)(?=,|\\.|\\$|admitir|cargo)", Pattern.CASE_INSENSITIVE);
    private static final Pattern CARGO_PATTERN = Pattern.compile("(?:cargo|função)\\s+([A-Za-zÀ-ÿ\\s]+?)(?=,|\\.|\\$|salário)", Pattern.CASE_INSENSITIVE);

    /**
     * Analisa uma frase em linguagem natural e extrai dados estruturados para eventos do eSocial.
     */
    public Map<String, Object> parseAdmissao(String texto) {
        Map<String, Object> dados = new HashMap<>();
        
        // Extrair CPF
        Matcher cpfMatcher = CPF_PATTERN.matcher(texto);
        if (cpfMatcher.find()) {
            dados.put("cpf", formatarCPF(cpfMatcher.group()));
        }

        // Extrair Nome (simplificado)
        Matcher nomeMatcher = NOME_PATTERN.matcher(texto);
        if (nomeMatcher.find()) {
            dados.put("nome", nomeMatcher.group(1).trim());
        }

        // Extrair Cargo
        Matcher cargoMatcher = CARGO_PATTERN.matcher(texto);
        if (cargoMatcher.find()) {
            dados.put("cargo", cargoMatcher.group(1).trim());
        }

        // Extrair Salário
        Matcher salarioMatcher = SALARIO_PATTERN.matcher(texto);
        if (salarioMatcher.find()) {
            String valorLimpo = salarioMatcher.group(1).replace(".", "").replace(",", ".");
            dados.put("salario", Double.parseDouble(valorLimpo));
        }

        // Extrair Data de Admissão
        Matcher dataMatcher = DATA_PATTERN.matcher(texto);
        if (dataMatcher.find()) {
            String dia = dataMatcher.group(1);
            String mes = dataMatcher.group(2);
            String ano = dataMatcher.group(3);
            dados.put("dataAdmissao", String.format("%s-%s-%s", ano, mes, dia));
        }

        return dados;
    }

    /**
     * Classifica a intenção do usuário baseada em palavras-chave.
     */
    public String classificarIntencao(String texto) {
        String t = texto.toLowerCase();
        if (t.contains("admitir") || t.contains("contratar")) return "CRIAR_S2200";
        if (t.contains("demitir") || t.contains("desligar")) return "CRIAR_S2299";
        if (t.contains("alterar") || t.contains("atualizar")) return "CRIAR_S2205";
        if (t.contains("erro") || t.contains("problema")) return "CONSULTAR_ERROS";
        if (t.contains("status") || t.contains("situação")) return "CONSULTAR_STATUS";
        if (t.contains("simular") || t.contains("calcular")) return "SIMULAR_RESCISAO";
        if (t.contains("ajuda") || t.contains("como")) return "CONSULTOR_LEGISLATIVO";
        
        return "DESCONHECIDO";
    }

    private String formatarCPF(String cpf) {
        return cpf.replaceAll("\\D", "");
    }
}
