package com.azienda.esercizi.ui;

import java.util.Scanner;

public class EsercizioSommaFor {

	public static void main(String[] args) {
       /*
        * Creare una classe **`EsercizioSommaFor`** con un metodo **`main`** che:

        * 1. Chieda all’utente di inserire un numero intero **positivo**.
        * 2. Se il numero è **negativo o zero**, stampi:
        *     
        *     **"Errore: il numero deve essere positivo"**
        *     
        *     e termini.
        *     
        * 3. Altrimenti utilizzi un **ciclo for** per calcolare la **somma di tutti i numeri da 1 a N**,
        *     
        *     e stampi il risultato.
        *     
        *     - Esempio: se l’utente inserisce **5**, la somma è:
        *         
        *         **1 + 2 + 3 + 4 + 5 = 15**
        * 
        * */
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire un numero intero positivo");
		int num1 = sc.nextInt();
		if(num1 <= 0) {
			System.out.println("Errore il numero deve essere positivo");
		}else {
			int somma = 0;
			for (int i = 1; i <= num1; i++) {
				somma += i;
			}
			System.out.println("La somma calcolata è: " + somma);

		}
		
		System.out.println("Programma Terminato");
		sc.close();
	}

}
