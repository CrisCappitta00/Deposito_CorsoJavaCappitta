package com.azienda.progetto0212.customException;

public class VeicoloNonValidoException extends Exception{
	//estendo alla classe exception poiché l'eccezione è di tipo checked
	public VeicoloNonValidoException(String message, Throwable cause) {
		super(message,cause);
	}
}
