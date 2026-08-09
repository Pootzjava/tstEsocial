package br.jus.tst.esocialjt.negocio.exception;

/**
 * Classe que representa uma exceção de negócio lançada quando ocorre um erro operacional.
 * Suporta código de erro e mensagem traduzida para o usuário final.
 * 
 * @author eSocial-JT
 */
public class BusinessException extends RuntimeException {

    private final String errorCode;
    private final String userMessage;

    public BusinessException(String errorCode, String userMessage) {
        super(errorCode);
        this.errorCode = errorCode;
        this.userMessage = userMessage;
    }

    public BusinessException(String errorCode, String userMessage, Throwable cause) {
        super(errorCode, cause);
        this.errorCode = errorCode;
        this.userMessage = userMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getUserMessage() {
        return userMessage;
    }

    private static final long serialVersionUID = 1L;
}
