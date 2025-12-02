package com.azienda.progettoStringa.esercizio1.ui;

import java.util.Scanner;

public class EsercizioStringa {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			String input;
			do {
				System.out.println("Inserire una Stringa");
				input = sc.nextLine();
				//controllo uscita
				if(input.equalsIgnoreCase("ESC")) {
					System.out.println("Uscita dal programma");
					sc.close();
					break;
				}
				//controllo lunghezza
				if(input.length() < 8 ) {
					System.out.println("Errore, la stringa è più piccola di 8 caratteri");
				}
				//sottostringa 5 - 8
				String sub1 = input.substring(4, 8);
				System.out.println("La sottostringa dal quinto all'ottavo carattere è: " + sub1);
				//sottostringa 2-3
				String sub2 = input.substring(1, 3).toUpperCase();
				System.out.println("La sottostringa dal secondo al terzo carattere, in maiuscolo è: " + sub2);
				int posR = sub1.indexOf('r');
				//controllo r 
				// Se il carattere r esiste nella stringa, allora stampo la sua posizione.
				// Se invece fosse -1, non stampiamo nulla.
				if(posR != -1) {
					System.out.println(sub1 + " contiene la r in posizione " + posR);
				}
			}while(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
