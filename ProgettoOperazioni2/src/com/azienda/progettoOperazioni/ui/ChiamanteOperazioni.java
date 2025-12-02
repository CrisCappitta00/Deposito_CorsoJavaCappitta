package com.azienda.progettoOperazioni.ui;

import java.util.Scanner;

import com.azienda.progettoOperazioni.model.Differenza;
import com.azienda.progettoOperazioni.model.Divisione;
import com.azienda.progettoOperazioni.model.OperazioniAritmetiche;
import com.azienda.progettoOperazioni.model.Prodotto;
import com.azienda.progettoOperazioni.model.Somma;

public class ChiamanteOperazioni {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menu(sc);
		sc.close();
	}
	public static void menu(Scanner sc) {
		int scelta;
		do {
			System.out.println("Effettuare una scelta tra i seguenti numeri di seguito elencati \n 1=somma \n 2= differenza \n 3 = prodotto \n 4 = divisione \n 5 = esci");
			scelta = sc.nextInt();
			operazioneScelta(scelta, sc);
		}while(scelta != 5);
	}
	public static void operazioneScelta(int scelta, Scanner sc) {

		switch (scelta) {
		case 1:
			System.out.println("E' stata scelta la somma");
			eseguiOperazione(new Somma(), sc);
			break;
		case 2:
			System.out.println("E' stata scelta la differenza");
			eseguiOperazione(new Differenza(),sc);
			break;
		case 3:
			System.out.println("E' stato scelto il prodotto ");
			eseguiOperazione(new Prodotto(),sc);
			break;
		case 4 : 
			System.out.println("E' stata scelta la divisione");
			eseguiOperazione(new Divisione(),sc);
			break;
		case 5:
			System.out.println("E' stato scelto di uscire dal programma \nChiusura in corso... \nProgramma Terminato");
		default:
			if(scelta < 1 || scelta > 5 ) {
				System.out.println("Per favore inserire un numero valido");
			}
			break;
		}
	}
	public static void eseguiOperazione(OperazioniAritmetiche op, Scanner sc) {
		int num1;
		int num2;
		System.out.println("Inserire il primo valore numerico");
		num1 = sc.nextInt();
		System.out.println("Inserire il secondo valore numerico");
		num2 = sc.nextInt();
		// Verifica la divisione per zero
		if (op instanceof Divisione && num2 == 0) {
			System.out.println("Errore: divisione per zero.");
			return;
		}
		op.printResult(op.operate(num1, num2));
	}

}
