package br.jus.tst.esocial.dominio.desligamento;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Observacoes {

	@NotNull
	@Size(min=3, max=255)
	private String observacao;

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
