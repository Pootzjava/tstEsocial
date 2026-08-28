package br.jus.tst.esocialjt.copilot;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Serviço de Inteligência do eSocial Copilot.
 * Traduz erros técnicos do eSocial em linguagem humana e sugere soluções.
 */
@Service
@Slf4j
public class CopilotService {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private Map<String, ErroConhecimento> baseConhecimento = new HashMap<>();

    @PostConstruct
    public void init() {
        carregarBaseConhecimento();
        log.info("eSocial Copilot inicializado com {} erros conhecidos", baseConhecimento.size());
    }

    /**
     * Carrega a base de conhecimento do arquivo JSON
     */
    private void carregarBaseConhecimento() {
        try {
            ClassPathResource resource = new ClassPathResource("copilot/erros_conhecimento.json");
            InputStream inputStream = resource.getInputStream();
            
            BaseConhecimento base = objectMapper.readValue(inputStream, BaseConhecimento.class);
            
            for (ErroConhecimento erro : base.getErros()) {
                // Indexa por código e por palavras-chave da mensagem original
                baseConhecimento.put(erro.getCodigo(), erro);
                
                // Indexa também por termos da mensagem para busca fuzzy
                String[] termos = erro.getMensagemOriginal().toLowerCase().split("\\s+");
                for (String termo : termos) {
                    if (termo.length() > 3) {
                        baseConhecimento.put(termo, erro);
                    }
                }
            }
        } catch (Exception e) {
            log.error("Erro ao carregar base de conhecimento do Copilot", e);
        }
    }

    /**
     * Traduz um erro técnico em linguagem humana
     * @param mensagemErroOriginal Mensagem retornada pelo eSocial
     * @return Resposta humanizada com explicação e solução
     */
    public RespostaCopilot traduzirErro(String mensagemErroOriginal) {
        log.debug("Traduzindo erro: {}", mensagemErroOriginal);
        
        // Busca exata por código
        Optional<ErroConhecimento> erroEncontrado = buscarPorCodigoOuTermo(mensagemErroOriginal);
        
        if (erroEncontrado.isPresent()) {
            ErroConhecimento erro = erroEncontrado.get();
            return new RespostaCopilot(
                true,
                erro.getExplicacao(),
                erro.getCausaProvavel(),
                erro.getSolucao(),
                erro.getNivelSeveridade(),
                erro.getTags()
            );
        }
        
        // Se não encontrou, retorna resposta genérica
        return new RespostaCopilot(
            false,
            "Não identificamos este erro específico em nossa base de conhecimento.",
            "Pode ser um erro novo ou específico do seu contexto.",
            "1. Verifique os logs detalhados.\n2. Contate o suporte técnico informando o código do erro.\n3. Consulte a documentação oficial do eSocial.",
            "DESCONHECIDO",
            Arrays.asList("generico", "suporte")
        );
    }

    /**
     * Busca erro por código exato ou por termo relevante
     */
    private Optional<ErroConhecimento> buscarPorCodigoOuTermo(String mensagem) {
        // Tenta extrair código numérico (ex: "Erro 501", "Rejeição 402")
        String codigoExtraido = extrairCodigo(mensagem);
        if (codigoExtraido != null && baseConhecimento.containsKey(codigoExtraido)) {
            return Optional.of(baseConhecimento.get(codigoExtraido));
        }
        
        // Busca por palavras-chave
        String mensagemLower = mensagem.toLowerCase();
        for (Map.Entry<String, ErroConhecimento> entry : baseConhecimento.entrySet()) {
            if (mensagemLower.contains(entry.getKey())) {
                return Optional.of(entry.getValue());
            }
        }
        
        return Optional.empty();
    }

    /**
     * Extrai código numérico de uma string
     */
    private String extrairCodigo(String texto) {
        if (texto == null) return null;
        
        // Padrão: procura por números de 3 dígitos que parecem códigos de erro
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\\b(\\d{3})\\b");
        java.util.regex.Matcher matcher = pattern.matcher(texto);
        
        if (matcher.find()) {
            return matcher.group(1);
        }
        
        // Procura por códigos alfanuméricos como "REJEICAO_LOTE"
        if (texto.contains("_")) {
            return texto.split("\\s+")[0].toUpperCase();
        }
        
        return null;
    }

    /**
     * Sugere ações preventivas baseadas no histórico de erros do tenant
     */
    public List<String> sugerirAcoesPreventivas(List<String> ultimosErros) {
        Set<String> sugestoes = new HashSet<>();
        
        boolean temErroCertificado = ultimosErros.stream()
            .anyMatch(e -> e.toLowerCase().contains("certificado"));
        
        if (temErroCertificado) {
            sugestoes.add("📅 Configure alertas de vencimento de certificado com 30 dias de antecedência");
        }
        
        boolean temErroTabela = ultimosErros.stream()
            .anyMatch(e -> e.toLowerCase().contains("tabela"));
        
        if (temErroTabela) {
            sugestoes.add("🔄 Revise a ordem de envio: eventos tabulares devem ser processados antes dos periódicos");
        }
        
        boolean temErroSalario = ultimosErros.stream()
            .anyMatch(e -> e.toLowerCase().contains("salário") || e.toLowerCase().contains("remuneração"));
        
        if (temErroSalario) {
            sugestoes.add("💰 Atualize a tabela de salário mínimo no seu sistema de folha de pagamento");
        }
        
        return new ArrayList<>(sugestoes);
    }

    // Classes internas para mapeamento JSON
    private static class BaseConhecimento {
        private String versao;
        private String ultimaAtualizacao;
        private List<ErroConhecimento> erros;
        
        // Getters e Setters
        public String getVersao() { return versao; }
        public void setVersao(String versao) { this.versao = versao; }
        public String getUltimaAtualizacao() { return ultimaAtualizacao; }
        public void setUltimaAtualizacao(String ultimaAtualizacao) { this.ultimaAtualizacao = ultimaAtualizacao; }
        public List<ErroConhecimento> getErros() { return erros; }
        public void setErros(List<ErroConhecimento> erros) { this.erros = erros; }
    }

    private static class ErroConhecimento {
        private String codigo;
        private String tipo;
        private String mensagemOriginal;
        private String explicacao;
        private String causaProvavel;
        private String solucao;
        private String nivelSeveridade;
        private List<String> tags;
        
        // Getters e Setters
        public String getCodigo() { return codigo; }
        public void setCodigo(String codigo) { this.codigo = codigo; }
        public String getTipo() { return tipo; }
        public void setTipo(String tipo) { this.tipo = tipo; }
        public String getMensagemOriginal() { return mensagemOriginal; }
        public void setMensagemOriginal(String mensagemOriginal) { this.mensagemOriginal = mensagemOriginal; }
        public String getExplicacao() { return explicacao; }
        public void setExplicacao(String explicacao) { this.explicacao = explicacao; }
        public String getCausaProvavel() { return causaProvavel; }
        public void setCausaProvavel(String causaProvavel) { this.causaProvavel = causaProvavel; }
        public String getSolucao() { return solucao; }
        public void setSolucao(String solucao) { this.solucao = solucao; }
        public String getNivelSeveridade() { return nivelSeveridade; }
        public void setNivelSeveridade(String nivelSeveridade) { this.nivelSeveridade = nivelSeveridade; }
        public List<String> getTags() { return tags; }
        public void setTags(List<String> tags) { this.tags = tags; }
    }

    /**
     * DTO de resposta para o frontend
     */
    public static class RespostaCopilot {
        private final boolean encontrado;
        private final String explicacao;
        private final String causaProvavel;
        private final String solucao;
        private final String nivelSeveridade;
        private final List<String> tags;

        public RespostaCopilot(boolean encontrado, String explicacao, String causaProvavel, 
                              String solucao, String nivelSeveridade, List<String> tags) {
            this.encontrado = encontrado;
            this.explicacao = explicacao;
            this.causaProvavel = causaProvavel;
            this.solucao = solucao;
            this.nivelSeveridade = nivelSeveridade;
            this.tags = tags;
        }

        // Getters
        public boolean isEncontrado() { return encontrado; }
        public String getExplicacao() { return explicacao; }
        public String getCausaProvavel() { return causaProvavel; }
        public String getSolucao() { return solucao; }
        public String getNivelSeveridade() { return nivelSeveridade; }
        public List<String> getTags() { return tags; }
    }
}
