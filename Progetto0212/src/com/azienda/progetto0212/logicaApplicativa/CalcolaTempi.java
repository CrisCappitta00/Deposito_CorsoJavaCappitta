package com.azienda.progetto0212.logicaApplicativa;

import com.azienda.progetto0212.model.Veicolo;

public interface CalcolaTempi {
	public Float calcolaTempiPercorrenza(Veicolo veicolo, Float distanza);
	public void informazioniMovimento(Veicolo veicolo);
}
