package com.azienda.progettoVeicoli.model;

public class Veicolo {
	private float velocitaMax;

	public Veicolo(float velocitaMax) {
		super();
		this.velocitaMax = velocitaMax;
	}

	public float getVelocitaMax() {
		return velocitaMax;
	}

	public void setVelocitaMax(float velocitaMax) {
		this.velocitaMax = velocitaMax;
	}
	public String getInfo() {
		return "Velocità massima: " + velocitaMax;
	}
	@Override
	public String toString() {
		return getInfo();
	}
}
