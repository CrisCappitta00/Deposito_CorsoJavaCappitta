package com.azienda.progettoVeicolo2.model;

public abstract class VeicoloBase implements Veicolo {
	private float velocitaMax; // attributo comune a tutti i veicoli
	
	public VeicoloBase(float velocitaMax) {
		super();
		this.velocitaMax = velocitaMax;
	}
	@Override
	public float getVelocitaMax() {
		return velocitaMax;
	}
	@Override
	public void setVelocitaMax(float velocitaMax) {
		this.velocitaMax = velocitaMax;
	}
	@Override
	public String toString() {
		return "Velocità max: " + velocitaMax;
	}
	
	
}
