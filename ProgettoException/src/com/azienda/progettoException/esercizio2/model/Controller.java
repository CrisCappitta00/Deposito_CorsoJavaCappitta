package com.azienda.progettoException.esercizio2.model;

public class Controller {
	public static void checkPositive(int numero) throws NumeroNegativoException {
		//se il numero passato è negativo sollevo l'eccezione
		if(numero < 0) {
			throw new NumeroNegativoException("Il numero è minore di zero", new Throwable("Cause: numero negativo inserito"));
		}
	}
	public static void checkNotZero(int numero) throws NumeroZeroException {
		// se il numero passato è uguale a 0 sollevo l'eccezione
		if(numero == 0) {
			throw new NumeroZeroException("Il numero è uguale a zero", new Throwable("Cause: divisione per 0"));
		}
	}
}
