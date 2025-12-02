package com.azienda.ereditarieta.esempio6.ui;

import com.azienda.ereditarieta.esempio6.model.Squadra;
import com.azienda.ereditarieta.esempio6.model.Utente;

public class TestOverrideEquals {

	public static void main(String[] args) {
		Utente u = new Utente("Mario", "Rossi", 95);
		Utente u2 = new Utente("Mario", "Rossi", 95);
		Squadra s1 = new Squadra("Squadra X");
		Squadra s2 = new Squadra("Squadra X");
		u.setSquadra(s1);
		u2.setSquadra(s2);
		// mi dirà che sono diversi perché non hanno lo stesso indirizzo in memoria
		if(u == u2) {
			System.out.println("Sono uguali");
		}else {
			System.out.println("Sono diversi");
		}
		// mi dirà che sono Uguali le stringhe
		if(u.equals(u2)) {
			System.out.println("Sono uguali");
		}else {
			System.out.println("Sono diversi");
		}
		
		System.out.println("Programma Terminato");
	}

}
