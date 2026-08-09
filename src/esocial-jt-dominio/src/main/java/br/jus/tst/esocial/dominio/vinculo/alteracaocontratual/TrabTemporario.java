package br.jus.tst.esocial.dominio.vinculo.alteracaocontratual;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TrabTemporario {

	@NotNull
	@Size(min=3, max=999)
	private String justProrr;

	public String getJustProrr() {
		return justProrr;
	}

	public void setJustProrr(String justProrr) {
		this.justProrr = justProrr;
	}
}
