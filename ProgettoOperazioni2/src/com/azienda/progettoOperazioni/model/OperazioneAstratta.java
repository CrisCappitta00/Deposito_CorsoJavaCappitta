package com.azienda.progettoOperazioni.model;

public abstract class OperazioneAstratta implements OperazioniAritmetiche{
	
	public void printResult(int result) {
		System.out.println("Il risultato è: " + result);
	}
	
}
