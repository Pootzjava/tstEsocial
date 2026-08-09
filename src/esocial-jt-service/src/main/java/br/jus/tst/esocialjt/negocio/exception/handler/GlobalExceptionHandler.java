package br.jus.tst.esocialjt.negocio.exception.handler;

import br.jus.tst.esocialjt.negocio.exception.EntidadeNaoExisteException;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Manipulador global de exceções com mensagens amigáveis para o usuário final.
 * Traduz erros técnicos em mensagens compreensíveis e acionáveis.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(EntidadeNaoExisteException.class)
    public ResponseEntity<ErroRespostaDTO> handleEntidadeNaoExiste(
            EntidadeNaoExisteException ex, WebRequest request) {
        
        String errorCode = ex.getMessage();
        String userMessage = ex.getDetail() != null ? ex.getDetail() : "Recurso não encontrado.";
        
        ErroRespostaDTO erro = new ErroRespostaDTO(
            errorCode,
            userMessage,
            LocalDateTime.now(),
            request.getDescription(false).replace("uri=", ""),
            MDC.get("correlationId")
        );
        
        return new ResponseEntity<>(erro, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<ErroRespostaDTO> handleIllegalState(
            IllegalStateException ex, WebRequest request) {
        
        LOGGER.error("Erro de estado: {}", ex.getMessage());
        
        ErroRespostaDTO erro = new ErroRespostaDTO(
            "ESTADO_INVALIDO",
            "Operação não pode ser executada no estado atual. " + ex.getMessage(),
            LocalDateTime.now(),
            request.getDescription(false).replace("uri=", ""),
            MDC.get("correlationId")
        );
        
        return new ResponseEntity<>(erro, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> handleValidationExceptions(
            MethodArgumentNotValidException ex, WebRequest request) {
        
        Map<String, Object> body = new HashMap<>();
        body.put("codigo", "VALIDACAO_FALHOU");
        body.put("mensagem", "Um ou mais campos enviados são inválidos.");
        body.put("timestamp", LocalDateTime.now());
        body.put("caminho", request.getDescription(false).replace("uri=", ""));
        body.put("correlationId", MDC.get("correlationId"));
        
        Map<String, String> errosCampo = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> 
            errosCampo.put(error.getField(), error.getDefaultMessage())
        );
        body.put("erros", errosCampo);
        
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErroRespostaDTO> handleGenericException(
            Exception ex, WebRequest request) {
        
        LOGGER.error("Erro não tratado: {}", ex.getMessage(), ex);
        
        ErroRespostaDTO erro = new ErroRespostaDTO(
            "ERRO_INTERNO",
            "Ocorreu um erro inesperado ao processar sua solicitação. " +
            "Por favor, tente novamente ou contate o suporte informando o código: " + 
            MDC.get("correlationId"),
            LocalDateTime.now(),
            request.getDescription(false).replace("uri=", ""),
            MDC.get("correlationId")
        );
        
        return new ResponseEntity<>(erro, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * DTO para resposta de erro padronizada.
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ErroRespostaDTO {
        private String codigo;
        private String mensagem;
        private LocalDateTime timestamp;
        private String caminho;
        private String correlationId;

        public ErroRespostaDTO(String codigo, String mensagem, LocalDateTime timestamp, 
                              String caminho, String correlationId) {
            this.codigo = codigo;
            this.mensagem = mensagem;
            this.timestamp = timestamp;
            this.caminho = caminho;
            this.correlationId = correlationId;
        }

        // Getters
        public String getCodigo() { return codigo; }
        public String getMensagem() { return mensagem; }
        public LocalDateTime getTimestamp() { return timestamp; }
        public String getCaminho() { return caminho; }
        public String getCorrelationId() { return correlationId; }
    }
}
