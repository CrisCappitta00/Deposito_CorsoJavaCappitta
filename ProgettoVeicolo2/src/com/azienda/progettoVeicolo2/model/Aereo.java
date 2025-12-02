package com.azienda.progettoVeicolo2.model;

public class Aereo extends VeicoloBase {
    private boolean diLinea;
    
    
    public Aereo(float velocitaMax, boolean diLinea) {
		super(velocitaMax);
		this.diLinea = diLinea;
	}

	public boolean getDiLinea() {
		return diLinea;
	}

	public void setDiLinea(boolean diLinea) {
		this.diLinea = diLinea;
	}

	@Override
	public String toString() {
		return "E' stato creato un Aereo. " + " E' di linea?: "+ diLinea + " e " + super.toString();
	}
	

}
