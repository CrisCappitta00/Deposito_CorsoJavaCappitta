package com.azienda.classiOggetti.conto.ui;

import java.util.Scanner;

import com.azienda.classiOggetti.conto.model.Banca;
import com.azienda.classiOggetti.conto.model.ContoCorrente;
import com.azienda.classiOggetti.conto.model.Indirizzo;

public class UsoContoCorrente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Creazione dell'indirizzo
		Indirizzo indirizzo = new Indirizzo("Roma", "Via Bianchi", 14);
		System.out.println(indirizzo.descrizione());
		// Creazione della banca
		Banca bank = new Banca("Banca Centrale", indirizzo);
		System.out.println(bank.descrizione());
		// Creazione dei conti correnti
		ContoCorrente contoUno = new ContoCorrente("IT3894R8CM", 2500.00F, bank);
		// Stampa dei conti correnti
		System.out.println(contoUno.descrizione());
		System.out.println(contoUno.getNomeBanca() + ", Città banca: " + contoUno.getCittaBanca());
		ContoCorrente contoDue = new ContoCorrente("IT4873RJNDJ", 600.00F, bank);
		System.out.println(contoDue.descrizione());
		System.out.println(contoDue.getNomeBanca() + ", Città banca: " + contoDue.getCittaBanca());
		richiestaImporto(sc, contoUno, contoDue);
		System.out.println("Programma Terminato");
		sc.close();
	}
	public static void richiestaImporto(Scanner sc, ContoCorrente contoUno, ContoCorrente contoDue) {
		System.out.println("Inserisci l'importo da trasferire dal secondo conto al primo:");
		float importo = sc.nextFloat();

		if(importo <= 0) {
			System.out.println("Importo non valido!");
			return;
		}
		if (contoDue.getSaldo() - importo >= 0) {
			// Aggiorno i saldi
			contoUno.setSaldo(contoUno.getSaldo() + importo);
			contoDue.setSaldo(contoDue.getSaldo() - importo);

			System.out.println("Trasferimento effettuato con successo.");
			System.out.println("Nuovo stato conto uno:\n" + contoUno.descrizione());
			System.out.println("Nuovo stato conto due:\n" + contoDue.descrizione());
		} else {
			System.out.println("Saldo insufficiente sul secondo conto. Trasferimento non effettuato.");
		}

	}
}
