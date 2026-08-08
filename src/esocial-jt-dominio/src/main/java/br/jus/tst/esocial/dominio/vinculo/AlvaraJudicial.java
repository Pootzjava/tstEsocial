package br.jus.tst.esocial.dominio.vinculo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AlvaraJudicial {
	@NotNull
	@Size(min=1, max=20)
	private String nrProcJud;

	public void setNrProcJud(String numeroProcesso) {
		this.nrProcJud = numeroProcesso;
	}

	public String getNrProcJud() {
		return nrProcJud;
	}

}
