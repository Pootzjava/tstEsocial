package br.jus.tst.esocialjt.copilot;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Serviço de busca inteligente na base de conhecimento legislativa.
 * Implementa algoritmo de similaridade TF-IDF simplificado para encontrar
 * as respostas mais relevantes para dúvidas dos usuários.
 */
@Service
@Slf4j
public class LegislationSearchService {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private List<LegislacaoDTO> knowledgeBase = new ArrayList<>();
    private Map<String, Double> idfScores = new HashMap<>();

    @PostConstruct
    public void init() {
        loadKnowledgeBase();
        calculateIdfScores();
        log.info("Base de conhecimento legislativa carregada com {} itens", knowledgeBase.size());
    }

    /**
     * Carrega a base de conhecimento do arquivo JSON
     */
    private void loadKnowledgeBase() {
        try {
            ClassPathResource resource = new ClassPathResource("knowledge/legislacao_esocial.json");
            InputStream inputStream = resource.getInputStream();
            
            Map<String, Object> data = objectMapper.readValue(inputStream, new TypeReference<Map<String, Object>>() {});
            List<Map<String, Object>> items = (List<Map<String, Object>>) data.get("knowledgeBase");
            
            knowledgeBase = items.stream()
                .map(item -> objectMapper.convertValue(item, LegislacaoDTO.class))
                .collect(Collectors.toList());
                
        } catch (IOException e) {
            log.error("Erro ao carregar base de conhecimento legislativa", e);
            throw new RuntimeException("Falha ao inicializar base de conhecimento", e);
        }
    }

    /**
     * Calcula scores IDF para cada termo na base de conhecimento
     */
    private void calculateIdfScores() {
        Set<String> allTerms = new HashSet<>();
        Map<String, Integer> termDocCount = new HashMap<>();
        
        for (LegislacaoDTO item : knowledgeBase) {
            Set<String> docTerms = extractTerms(item.getQuestion() + " " + item.getAnswer() + " " + String.join(" ", item.getTags()));
            for (String term : docTerms) {
                allTerms.add(term);
                termDocCount.put(term, termDocCount.getOrDefault(term, 0) + 1);
            }
        }
        
        int totalDocs = knowledgeBase.size();
        for (String term : allTerms) {
            double idf = Math.log((double) totalDocs / (1 + termDocCount.get(term)));
            idfScores.put(term, idf);
        }
    }

    /**
     * Busca a legislação mais relevante para uma pergunta
     * @param query Pergunta do usuário
     * @return Lista de resultados ordenados por relevância
     */
    public List<LegislacaoDTO> search(String query) {
        if (query == null || query.trim().isEmpty()) {
            return Collections.emptyList();
        }

        Set<String> queryTerms = extractTerms(query);
        
        List<ScoredResult> results = new ArrayList<>();
        
        for (LegislacaoDTO item : knowledgeBase) {
            double score = calculateSimilarity(queryTerms, item);
            if (score > 0.1) { // Threshold mínimo de relevância
                results.add(new ScoredResult(item, score));
            }
        }
        
        // Ordenar por score decrescente
        results.sort(Comparator.comparingDouble(ScoredResult::getScore).reversed());
        
        return results.stream()
            .limit(3) // Retorna top 3 resultados
            .map(ScoredResult::getItem)
            .collect(Collectors.toList());
    }

    /**
     * Calcula similaridade entre query e item da base
     */
    private double calculateSimilarity(Set<String> queryTerms, LegislacaoDTO item) {
        String itemText = item.getQuestion() + " " + item.getAnswer() + " " + String.join(" ", item.getTags());
        Set<String> itemTerms = extractTerms(itemText);
        
        double numerator = 0.0;
        double queryMagnitude = 0.0;
        double itemMagnitude = 0.0;
        
        // Calcular TF-IDF e magnitudes
        for (String term : queryTerms) {
            double tfQuery = 1.0; // TF simplificado
            double idf = idfScores.getOrDefault(term, 0.0);
            double weight = tfQuery * idf;
            
            numerator += weight * (itemTerms.contains(term) ? 1.0 : 0.0);
            queryMagnitude += weight * weight;
        }
        
        for (String term : itemTerms) {
            double tfItem = 1.0;
            double idf = idfScores.getOrDefault(term, 0.0);
            double weight = tfItem * idf;
            itemMagnitude += weight * weight;
        }
        
        if (queryMagnitude == 0 || itemMagnitude == 0) {
            return 0.0;
        }
        
        return numerator / (Math.sqrt(queryMagnitude) * Math.sqrt(itemMagnitude));
    }

    /**
     * Extrai termos de um texto (normalização e tokenização)
     */
    private Set<String> extractTerms(String text) {
        if (text == null) return Collections.emptySet();
        
        return Arrays.stream(text.toLowerCase(Locale.BRAZIL)
                .replaceAll("[^a-z0-9\\s]", " ")
                .split("\\s+"))
            .filter(term -> term.length() > 2) // Ignorar termos muito curtos
            .collect(Collectors.toSet());
    }

    /**
     * Classe auxiliar para armazenar resultado com score
     */
    private static class ScoredResult {
        private final LegislacaoDTO item;
        private final double score;

        public ScoredResult(LegislacaoDTO item, double score) {
            this.item = item;
            this.score = score;
        }

        public LegislacaoDTO getItem() { return item; }
        public double getScore() { return score; }
    }
}
