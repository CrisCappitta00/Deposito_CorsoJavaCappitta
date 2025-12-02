package com.azienda.progettoOperazioni.model;

public class Divisione implements OperazioniAritmetiche {

	@Override
	public int operate(int a, int b) {
		return a / b;
	}

}
