package com.azienda.progettoVeicolo2.model;

public class Treno extends VeicoloBase{
	private String localitaPartenza;
	private String localitaArrivo;

	public Treno(float velocitaMax, String localitaPartenza, String localitaArrivo) {
		super(velocitaMax);
		this.localitaPartenza = localitaPartenza;
		this.localitaArrivo = localitaArrivo;
	}

	public String getLocalitaArrivo() {
		return localitaArrivo;
	}

	public void setLocalitaArrivo(String localitaArrivo) {
		this.localitaArrivo = localitaArrivo;
	}

	public String getLocalitaPartenza() {
		return localitaPartenza;
	}

	public void setLocalitaPartenza(String localitaPartenza) {
		this.localitaPartenza = localitaPartenza;
	}

	@Override
	public String toString() {
		return "E' stato creato un Treno, località di Partenza: " + localitaPartenza + ", località di Arrivo : " + localitaArrivo + " e " + super.toString();
	}
	

}
