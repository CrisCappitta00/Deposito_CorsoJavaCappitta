package com.azienda.progetto0212.logicaApplicativa;

import com.azienda.progetto0212.model.Treno;
import com.azienda.progetto0212.model.Veicolo;

public class CalcoloTempiTreno implements CalcolaTempi {

	@Override
	public Float calcolaTempiPercorrenza(Veicolo veicolo, Float distanza) {
		if(veicolo == null || distanza == null || veicolo.getVelocita() == 0) {
			return null;
		}
		return distanza/veicolo.getVelocita();
	}
	@Override
	public void informazioniMovimento(Veicolo veicolo) {
		if(veicolo instanceof Treno) {
			Treno treno = (Treno)veicolo;
			// invoco il metodo percorreBinari
			treno.percorreBinari();
		}else {
			System.out.println("Errore il veicolo passato non è un treno");
		}
	}
}
