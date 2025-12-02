package com.azienda.progetto0212.utility;

import com.azienda.progetto0212.customException.VeicoloNonValidoException;

public class Validatore {
	public static final String TIPO_AEREO = "AEREO";
	public static final String TIPO_TRENO = "TRENO";
	public static void validaVeicolo(String tipo)throws VeicoloNonValidoException{
		if(tipo == null || 
				(!tipo.equalsIgnoreCase(TIPO_AEREO) && !tipo.equalsIgnoreCase(TIPO_TRENO) )) 
		{
			throw new VeicoloNonValidoException("Il tipo di veicolo" + tipo + " non è valido.", new Throwable("Sono ammessi solo AEREO o TRENO."));
		}
	}
}
