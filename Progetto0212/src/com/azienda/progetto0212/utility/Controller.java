package com.azienda.progetto0212.utility;

import java.util.Scanner;

public class Controller {

	// leggo un valore booleano dall'utente
	//accetto solo true o false
	public static boolean leggiBoolean(Scanner sc, String message) {
		System.out.println(message);
		while(true) {
			String input = sc.nextLine().trim(); // così tolgo anche gli spazi
			if(input.equalsIgnoreCase("true")) {
				return true;
			}else if(input.equalsIgnoreCase("false")) {
				return false;
			}else {
				System.out.println("Valore non valido, inserire true o false");
			}
		}
	}

	public static float leggiFloat(Scanner sc, String message) {
		//Prova a convertire la stringa in Float
		// se l'input non è numerico -> mostro un messaggio e ripeto
		System.out.println(message);
		while(true) {
			String input = sc.nextLine().trim();
			try {
				return Float.parseFloat(input);
			} catch (NumberFormatException e) {
				System.out.println("Valore non valido! Inserisci un numero (float):");
			}
		}
	}
}
