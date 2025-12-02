package com.azienda.progetto0212.factory;

import java.util.Scanner;

import com.azienda.progetto0212.customException.VeicoloNonValidoException;
import com.azienda.progetto0212.model.Aereo;
import com.azienda.progetto0212.model.Treno;
import com.azienda.progetto0212.model.Veicolo;
import com.azienda.progetto0212.utility.Validatore;

public class VeicoloFactory {

	public static Veicolo creaVeicolo(String tipoVeicolo, Scanner sc)throws VeicoloNonValidoException {
		// verifico se il tipo è valido
		Validatore.validaVeicolo(tipoVeicolo);
		// leggo gli altri dati
		System.out.println("Indicare il tipo di modello");
		String modello = sc.nextLine();
		System.out.println("Indicare la velocità media");
		Float velocita = Float.parseFloat(sc.nextLine());
		//Creo l’oggetto specifico in base al tipo
		if (tipoVeicolo.equalsIgnoreCase("AEREO")) {
			System.out.println("L'aereo è di linea? (true/false):");
			boolean diLinea = Boolean.parseBoolean(sc.nextLine()); // meglio usare InputUtility.leggiBoolean()
			return new Aereo(modello, velocita, diLinea);
		} else { // tipo TRENO
			System.out.println("Il treno è regionale? (true/false):");
			boolean regionale = Boolean.parseBoolean(sc.nextLine());
			return new Treno(modello, velocita, regionale);
		}
	}
}
