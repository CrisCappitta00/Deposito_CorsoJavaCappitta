package com.azienda.progetto0212.factory;

import java.util.Scanner;

import com.azienda.progetto0212.customException.VeicoloNonValidoException;
import com.azienda.progetto0212.model.Aereo;
import com.azienda.progetto0212.model.Treno;
import com.azienda.progetto0212.model.Veicolo;
import com.azienda.progetto0212.utility.Controller;
import com.azienda.progetto0212.utility.Validatore;

public class VeicoloFactory {

	public static Veicolo creaVeicolo(String tipoVeicolo, Scanner sc)throws VeicoloNonValidoException {
		// verifico se il tipo è valido
		Validatore.validaVeicolo(tipoVeicolo);
		// leggo gli altri dati
		System.out.println("Indicare il tipo di modello");
		String modello = sc.nextLine();
		float velocita = Controller.leggiFloat(sc, "Indicare la velocità media:");
		//Creo l’oggetto specifico in base al tipo
		if (tipoVeicolo.equalsIgnoreCase("AEREO")) {

			boolean diLinea = Controller.leggiBoolean(sc, "L'aereo è di linea?");
			return new Aereo(modello, velocita, diLinea);
		} else { // tipo TRENO
			boolean regionale = Controller.leggiBoolean(sc, "Il treno è regionale?");
			return new Treno(modello, velocita, regionale);
		}
	}
}
