package br.jus.tst.esocial.dominio.demonstrativovalores;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class InfoTrabInterm {
	
	@NotNull
	@Size(min=1, max=30)
	private String codConv;

	public String getCodConv() {
		return codConv;
	}

	public void setCodConv(String codConv) {
		this.codConv = codConv;
	}
	
}
