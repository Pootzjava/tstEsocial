package br.jus.tst.esocial.dominio.vinculo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class IdeEstabVinc {
	
	private byte tpInsc;
	
	@NotNull
	@Pattern(regexp="\\d{8,15}")
	private String nrInsc;
	
	public byte getTpInsc() {
		return tpInsc;
	}
	public void setTpInsc(byte tipoInscricao) {
		this.tpInsc = tipoInscricao;
	}
	public String getNrInsc() {
		return nrInsc;
	}
	public void setNrInsc(String numeroInscricao) {
		this.nrInsc = numeroInscricao;
	}
}
