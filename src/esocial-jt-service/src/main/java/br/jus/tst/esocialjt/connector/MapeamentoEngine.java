package br.jus.tst.esocialjt.connector;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MapeamentoEngine {

    private final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Executa o mapeamento de campos de um JSON de origem para um JSON de destino
     * baseado na configuração salva no banco.
     */
    public Map<String, Object> executarMapeamento(String jsonOrigem, String configMapeamento, String configTransformacoes) throws Exception {
        JsonNode origemNode = objectMapper.readTree(jsonOrigem);
        JsonNode mapeamentoNode = objectMapper.readTree(configMapeamento);
        
        Map<String, Object> resultado = new HashMap<>();

        if (mapeamentoNode.isArray()) {
            for (JsonNode regra : mapeamentoNode) {
                String campoDestino = regra.get("destino").asText();
                String caminhoOrigem = regra.get("origem").asText();
                
                // Extrai valor da origem (suporte a caminhos aninhados ex: "funcionario.nome")
                JsonNode valorNode = extrairValor(origemNode, caminhoOrigem);
                Object valor = valorNode.isValueNode() ? valorNode.asText() : valorNode.toString();

                // Aplica transformações se existirem
                if (configTransformacoes != null && !configTransformacoes.isEmpty()) {
                    valor = aplicarTransformacoes(valor, configTransformacoes, campoDestino);
                }

                resultado.put(campoDestino, valor);
            }
        }

        return resultado;
    }

    private JsonNode extrairValor(JsonNode raiz, String caminho) {
        String[] partes = caminho.split("\\.");
        JsonNode atual = raiz;
        for (String parte : partes) {
            if (atual.has(parte)) {
                atual = atual.get(parte);
            } else {
                return null;
            }
        }
        return atual;
    }

    private Object aplicarTransformacoes(Object valor, String configTransformacoes, String campoDestino) throws Exception {
        JsonNode transformacoesNode = objectMapper.readTree(configTransformacoes);
        
        for (JsonNode t : transformacoesNode) {
            if (t.get("campo").asText().equals(campoDestino)) {
                String tipo = t.get("tipo").asText();
                
                switch (tipo) {
                    case "UPPER":
                        valor = valor.toString().toUpperCase();
                        break;
                    case "LOWER":
                        valor = valor.toString().toLowerCase();
                        break;
                    case "CONCAT":
                        String sufixo = t.get("valor").asText();
                        valor = valor.toString() + sufixo;
                        break;
                    case "DATE_FORMAT":
                        // Simples formatação de data (implementação simplificada)
                        break;
                    case "DEFAULT_IF_NULL":
                        if (valor == null || valor.toString().isEmpty()) {
                            valor = t.get("valor").asText();
                        }
                        break;
                }
            }
        }
        
        return valor;
    }
}
