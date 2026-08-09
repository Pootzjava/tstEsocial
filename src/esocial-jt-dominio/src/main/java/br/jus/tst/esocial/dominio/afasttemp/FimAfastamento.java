package br.jus.tst.esocial.dominio.afasttemp;

import java.util.Calendar;

import jakarta.validation.constraints.NotNull;

public class FimAfastamento {
	
	@NotNull
	private Calendar dtTermAfast;

	public Calendar getDtTermAfast() {
		return dtTermAfast;
	}

	public void setDtTermAfast(Calendar dtTermAfast) {
		this.dtTermAfast = dtTermAfast;
	}
	
}