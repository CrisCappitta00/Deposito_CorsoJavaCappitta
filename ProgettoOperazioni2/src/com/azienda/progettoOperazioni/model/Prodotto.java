package com.azienda.progettoOperazioni.model;

public class Prodotto extends OperazioneAstratta {

	@Override
	public int operate(int a, int b) {
		return a * b;
	}


}
