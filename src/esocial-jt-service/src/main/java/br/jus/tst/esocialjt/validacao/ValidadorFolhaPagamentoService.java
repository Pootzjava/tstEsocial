package br.jus.tst.esocialjt.validacao;

import br.jus.tst.esocialjt.dominio.Evento;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ValidadorFolhaPagamentoService {

    private static final BigDecimal SALARIO_MINIMO = new BigDecimal("1412.00"); // Atualizar conforme vigência
    private static final BigDecimal TETO_INSS = new BigDecimal("7786.02"); // Atualizar conforme vigência
    private static final BigDecimal ALIQUOTA_FGTS = new BigDecimal("0.08");
    
    private final ObjectMapper objectMapper;

    public ValidadorFolhaPagamentoService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    /**
     * Valida uma lista de eventos do eSocial antes do envio.
     */
    public List<ResultadoValidacaoDTO> validarEventos(List<Evento> eventos) {
        List<ResultadoValidacaoDTO> resultados = new ArrayList<>();

        for (Evento evento : eventos) {
            try {
                JsonNode raiz = parsearConteudo(evento.getDadosEvento());
                
                if (isS1200(evento)) {
                    resultados.addAll(validarS1200(raiz, evento));
                } else if (isS2299OuS2300(evento)) {
                    resultados.addAll(validarDesligamento(raiz, evento));
                }
                // Adicionar outros tipos conforme necessário (S-2200, S-2300, etc)
                
            } catch (Exception e) {
                log.error("Erro ao validar evento {}: {}", evento.getId(), e.getMessage());
                resultados.add(ResultadoValidacaoDTO.erro(
                        evento.getId(), 
                        evento.getTipoEvento().getCodigo(), 
                        "ERRO_PROCESSAMENTO", 
                        "Falha ao processar JSON/XML: " + e.getMessage()
                ));
            }
        }
        return resultados;
    }

    private JsonNode parsearConteudo(String conteudo) throws Exception {
        // Tenta parsear como JSON primeiro. Se o eSocial enviar XML, precisará de um parser XML->JSON
        // Assumindo JSON para este exemplo (comum em integrações internas)
        if (conteudo.trim().startsWith("{")) {
            return objectMapper.readTree(conteudo);
        } else {
            // Fallback simples ou lançamento de exceção se for XML puro não tratado
            throw new IllegalArgumentException("Formato XML não suportado neste parser simplificado. Converter para JSON antes.");
        }
    }

    private boolean isS1200(Evento evento) {
        return "S-1200".equals(evento.getTipoEvento().getCodigo());
    }

    private boolean isS2299OuS2300(Evento evento) {
        String codigo = evento.getTipoEvento().getCodigo();
        return "S-2299".equals(codigo) || "S-2300".equals(codigo);
    }

    private List<ResultadoValidacaoDTO> validarS1200(JsonNode raiz, Evento evento) {
        List<ResultadoValidacaoDTO> erros = new ArrayList<>();
        
        // Navegação segura no JSON do eSocial (estrutura típica)
        JsonNode infoResp = getPath(raiz, "evtRemun", "infoResp");
        if (infoResp.isMissingNode()) {
             // Tenta estrutura alternativa ou ignora se opcional
             infoResp = getPath(raiz, "evtRemun", "ideEmpregador", "infoResp"); 
        }

        // Exemplo de extração de campos (ajustar conforme schema real do eSocial)
        // Nota: A estrutura exata depende se é JSON ou XML convertido
        BigDecimal vrUnitario = getBigDecimalSafe(getPath(raiz, "evtRemun", "dmDev", "ideDmDev", "vrUnitario"));
        BigDecimal qtdRubr = getBigDecimalSafe(getPath(raiz, "evtRemun", "dmDev", "ideDmDev", "qtdRubr"));
        
        // Validação 1: Salário Mínimo
        if (vrUnitario != null && vrUnitario.compareTo(BigDecimal.ZERO) > 0 && vrUnitario.compareTo(SALARIO_MINIMO) < 0) {
             // Verifica se não é proporcional ou parcial (lógica simplificada)
             erros.add(ResultadoValidacaoDTO.erro(
                evento.getId(),
                "S-1200",
                "SALARIO_ABAIXO_MINIMO",
                String.format("Remuneração unitária (%s) abaixo do salário mínimo (%s). Verificar se é jornada parcial.", vrUnitario, SALARIO_MINIMO)
            ));
        }

        // Validação 2: Teto INSS (Base de cálculo)
        BigDecimal baseCalc = getBigDecimalSafe(getPath(raiz, "evtRemun", "dmDev", "ideDmDev", "baseCalc"));
        if (baseCalc != null && baseCalc.compareTo(TETO_INSS) > 0) {
            erros.add(ResultadoValidacaoDTO.aviso(
                evento.getId(),
                "S-1200",
                "BASE_ACIMA_TETO",
                String.format("Base de cálculo (%s) acima do teto do INSS (%s). Verificar retenção.", baseCalc, TETO_INSS)
            ));
        }

        // Validação 3: Consistência Rubrica * Quantidade
        if (vrUnitario != null && qtdRubr != null) {
            BigDecimal totalCalculado = vrUnitario.multiply(qtdRubr).setScale(2, RoundingMode.HALF_EVEN);
            BigDecimal vrRubr = getBigDecimalSafe(getPath(raiz, "evtRemun", "dmDev", "ideDmDev", "vrRubr"));
            
            if (vrRubr != null && totalCalculado.compareTo(vrRubr) != 0) {
                 // Margem de erro de 0.05 para arredondamentos
                 if (totalCalculado.subtract(vrRubr).abs().compareTo(new BigDecimal("0.05")) > 0) {
                     erros.add(ResultadoValidacaoDTO.erro(
                        evento.getId(),
                        "S-1200",
                        "INCONSISTENCIA_REMUNERACAO",
                        String.format("Inconsistência: Unitário (%s) * Qtd (%s) != Total (%s). Diferença: %s", 
                            vrUnitario, qtdRubr, vrRubr, totalCalculado.subtract(vrRubr))
                    ));
                 }
            }
        }

        return erros;
    }

    private List<ResultadoValidacaoDTO> validarDesligamento(JsonNode raiz, Evento evento) {
        List<ResultadoValidacaoDTO> erros = new ArrayList<>();
        
        // Validação específica para desligamento: Verificar se há remunerações pendentes
        // Lógica simplificada: Apenas exemplificando a extensão
        String nrRecExt = getStringSafe(getPath(raiz, "evtDeslig", "infoDeslig", "nrRecExt"));
        if (nrRecExt == null || nrRecExt.isEmpty()) {
             // Pode ser válido dependendo do tipo de desligimento, mas gera aviso
             erros.add(ResultadoValidacaoDTO.aviso(
                 evento.getId(),
                 evento.getTipoEvento().getCodigo(),
                 "SEM_RECIBO_EXTINCAO",
                 "Desligimento sem número de recibo de extinção informado. Verificar se há verbas rescisórias."
             ));
        }
        
        return erros;
    }

    // Utilitários de navegação segura no JSON
    private JsonNode getPath(JsonNode node, String... fields) {
        JsonNode current = node;
        for (String field : fields) {
            if (current == null || current.isMissingNode()) return JsonNode.factory.instance.nullNode();
            current = current.get(field);
        }
        return current;
    }

    private BigDecimal getBigDecimalSafe(JsonNode node) {
        if (node == null || node.isMissingNode() || node.isNull()) return null;
        try {
            return node.decimalValue();
        } catch (Exception e) {
            // Tenta parsear de string se for o caso
            try {
                return new BigDecimal(node.asText());
            } catch (NumberFormatException ex) {
                return null;
            }
        }
    }
    
    private String getStringSafe(JsonNode node) {
        if (node == null || node.isMissingNode() || node.isNull()) return null;
        return node.asText();
    }
}
