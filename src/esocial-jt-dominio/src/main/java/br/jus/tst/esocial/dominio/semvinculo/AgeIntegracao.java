package br.jus.tst.esocial.dominio.semvinculo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class AgeIntegracao {
	
	@NotNull
	@Pattern(regexp="\\d{8,14}")
	private String cnpjAgntInteg;
	

	public String getCnpjAgntInteg() {
		return cnpjAgntInteg;
	}

	public AgeIntegracao setCnpjAgntInteg(String cnpj) {
		this.cnpjAgntInteg = cnpj;
		return this;
	}
}
