package com.azienda.progettoPersona.ui;

import com.azienda.progettoPersona.model.Impiegato;
import com.azienda.progettoPersona.model.Persona;

public class ChiamanteImpiegato {

	public static void main(String[] args) {
		Persona obj = new Persona("Pino", "Blu");
		System.out.println(obj); // potevo anche fare obj.toString ma println la invoca automaticamente
		Persona obj2 = new Persona("Pino", "Blu");
		System.out.println(obj2);
		// utilizzo il metodo equals per il confronto tra le Stringhe
		if(obj.equals(obj2)) {
			System.out.println("I due impiegati sono uguali");
		}else {
			System.out.println("I due impiegati non sono uguali");

		}
		// obj diventa di tipo Impiegato
		obj = new Impiegato("Luca", "Bianchi", "12345"); 
		System.out.println(obj); // stampo le sue info
		// posso fare il controllo di obj con instance of per vedere se  è di tipo Impiegato
		if(obj instanceof Impiegato) {
			Impiegato imp = (Impiegato) obj;
			imp.setMatricola("59968ks");
			System.out.println("Nuova matricola: " + imp.getMatricola());
		}else {
			System.out.println("L'oggetto non è di tipo Impiegato");
		}
		//		Potevo anche fare in questo modo 
		//		// Tramite il cast di obj a impiegato sfrutto il metodo setMatricola
		//		((Impiegato) obj).setMatricola("69785cd");
		//		// stampo a video la matricola + cast di obj a impiegato per usare il metodo getMatricola
		//		System.out.println("Nuova matricola: " + ((Impiegato) obj).getMatricola());
	}
}
