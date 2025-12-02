package com.azienda.progettoVeicolo2.model;

public class Automobile extends VeicoloBase {
    private float cilindrata;
	
	public Automobile(float velocitaMax, float cilindrata) {
		super(velocitaMax);
		this.cilindrata = cilindrata;
	}

	public float getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(float cilindrata) {
		this.cilindrata = cilindrata;
	}

	@Override
	public String toString() {
		return "Questa è un'Automobile con cilindrata: " + cilindrata + " e " + super.toString();
	}
	

}
