package com.azienda.progettoVeicoli.model;

public class Automobile extends Veicolo{
	private String modello;
	private float cilindrata;

	public Automobile(float velocitaMax, String modello, float cilindrata) {
		super(velocitaMax);
		this.modello = modello;
		this.cilindrata = cilindrata;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public float getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(float cilindrata) {
		this.cilindrata = cilindrata;
	}
	@Override
	public String getInfo() {
		return "Modello: " + modello + " - Cilindrata: " + cilindrata + " - " + super.getInfo();
	}
}
