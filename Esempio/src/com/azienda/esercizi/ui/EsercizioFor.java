package com.azienda.esercizi.ui;

import java.util.Scanner;

public class EsercizioFor {

	public static void main(String[] args) {
		/*
		 * Creare una classe EsercizioFor con un metodo main che:
         * Riceva in input da console un numero intero, dopo averlo richiesto all’utente.
         * Se il numero inserito è minore o uguale a zero, stampi:
         * "Si deve inputare un numero maggiore di 0"
         * e termini il programma.
         * Altrimenti, utilizzi un ciclo for per stampare tutti i numeri da 0 a numero - 1.
         * Esempio: se l’utente inserisce 3, devono essere stampati: 0, 1, 2
		 * */
         Scanner sc = new Scanner(System.in);
         int num1;
         System.out.println("Assegnare un valore alla variabile");
         num1 = sc.nextInt();
         if(num1 <= 0) {
        	 System.out.println("Si deve inputare un numero maggiore di 0");
         } else {
        	 for (int i = 0; i < num1; i++) {
				System.out.println(i);
			}
         }
         System.out.println("Programma Terminato");
         sc.close();
	}
}
