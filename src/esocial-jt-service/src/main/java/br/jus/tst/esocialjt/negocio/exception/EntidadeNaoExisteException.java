package br.jus.tst.esocialjt.negocio.exception;

/**
 * Classe que representa uma exceção de negócio lançada quando tenta-se executar 
 * uma operação com uma entidade que não existe.
 * Suporta código de erro e mensagem detalhada para tradução ao usuário final.
 */
public class EntidadeNaoExisteException extends Exception {

    private final String errorCode;
    private final String detail;

    public EntidadeNaoExisteException(String message) {
        super(message);
        this.errorCode = "ENTIDADE_NAO_ENCONTRADA";
        this.detail = null;
    }

    public EntidadeNaoExisteException(String errorCode, String detail) {
        super(errorCode);
        this.errorCode = errorCode;
        this.detail = detail;
    }

    public EntidadeNaoExisteException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = "ENTIDADE_NAO_ENCONTRADA";
        this.detail = null;
    }

    public EntidadeNaoExisteException() {
        this.errorCode = "ENTIDADE_NAO_ENCONTRADA";
        this.detail = null;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getDetail() {
        return detail;
    }

    private static final long serialVersionUID = 1L;

}