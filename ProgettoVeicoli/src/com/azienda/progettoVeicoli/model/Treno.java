package com.azienda.progettoVeicoli.model;

public class Treno extends Veicolo{
	private String localitaPartenza;
	private String localitaArrivo;
    
	public Treno(float velocitaMax, String localitaPartenza, String localitaArrivo) {
		super(velocitaMax);
		this.localitaPartenza = localitaPartenza;
		this.localitaArrivo = localitaArrivo;
	}

	public String getLocalitaPartenza() {
		return localitaPartenza;
	}

	public void setLocalitaPartenza(String localitaPartenza) {
		this.localitaPartenza = localitaPartenza;
	}

	public String getLocalitaArrivo() {
		return localitaArrivo;
	}

	public void setLocalitaArrivo(String localitaArrivo) {
		this.localitaArrivo = localitaArrivo;
	}
	@Override
	public String getInfo() {
		return "Località di partenza: " + localitaPartenza + " - Località di arrivo: " + localitaArrivo + " - " + super.getInfo();
	}
}
