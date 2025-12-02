package com.azienda.progettoVeicolo2.model;

public class Nave extends VeicoloBase {
    private int numeroCabine;
    
    public Nave(float velocitaMax, int numeroCabine) {
		super(velocitaMax);
		this.numeroCabine = numeroCabine;
	}

	public int getNumeroCabine() {
		return numeroCabine;
	}

	public void setNumeroCabine(int numeroCabine) {
		this.numeroCabine = numeroCabine;
	}

	@Override
	public String toString() {
		return "E' stata creata una Nave con: " + numeroCabine + " cabine e " + super.toString();
	}
	

}
