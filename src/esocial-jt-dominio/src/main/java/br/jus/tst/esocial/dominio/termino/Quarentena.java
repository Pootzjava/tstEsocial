package br.jus.tst.esocial.dominio.termino;

import java.util.Calendar;

import jakarta.validation.constraints.NotNull;

public class Quarentena {
	
	@NotNull
	private Calendar dtFimQuar;

	public Calendar getDtFimQuar() {
		return dtFimQuar;
	}

	public void setDtFimQuar(Calendar dtFimQuar) {
		this.dtFimQuar = dtFimQuar;
	}
	
}
