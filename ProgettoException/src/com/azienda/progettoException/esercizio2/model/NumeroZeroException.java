package com.azienda.progettoException.esercizio2.model;

public class NumeroZeroException extends RuntimeException{

	public NumeroZeroException(String message, Throwable cause) {
		super(message,cause); // passa il messaggio e la causa alla super classe
	}
}
