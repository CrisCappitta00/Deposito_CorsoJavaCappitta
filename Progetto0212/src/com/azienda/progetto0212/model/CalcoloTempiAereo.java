package com.azienda.progetto0212.model;

public class CalcoloTempiAereo implements CalcolaTempi {

	@Override
	public Float calcolaTempiPercorrenza(Veicolo veicolo, Float distanza) {
		if(veicolo == null || distanza == null || veicolo.getVelocita() == 0) {
			return null;
		}
		return distanza/veicolo.getVelocita();
	}
	@Override
	public void informazioniMovimento(Veicolo veicolo) {
		//controllo se veicolo può essere un'instanza di aereo
		if(veicolo instanceof Aereo) {
			Aereo aereo = (Aereo)veicolo;
			// invoco il metodo vola
			aereo.vola();
		}else {
			System.out.println("Errore il veicolo passato non è un aereo");
		}

	}

}
