package com.azienda.progettoOperazioni.model;

public interface OperazioniAritmetiche {
	public int operate(int a, int b);
	public default void printResult(int result) {
		System.out.println("Il risultato è: " + result);
	}
}
