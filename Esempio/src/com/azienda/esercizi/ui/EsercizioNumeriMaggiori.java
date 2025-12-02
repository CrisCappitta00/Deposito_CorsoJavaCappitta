package com.azienda.esercizi.ui;

import java.util.Scanner;

public class EsercizioNumeriMaggiori {

	public static void main(String[] args) {
        /*
         * Creare una classe **`EsercizioNumeriMaggiori`** con un metodo **`main`** che:
           * 1. Chieda all’utente di inserire **un numero intero positivo**.
           * 2. Se il numero è **minore o uguale a 0**, stampi:
           *     
           *     **"Numero non valido"**
           *     
           *     e termini.
           *     
           * 3. Altrimenti utilizzi un **ciclo for** per stampare **tutti i numeri da 0 al numero inserito**
           *     
           *     ma **solo quelli maggiori di 5**.
           *     
           *     - Esempio: se l’utente inserisce **8**, stampa:
           *         
           *         **6, 7, 8**
         * 
         * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire un numero intero positivo");
		int num1 = sc.nextInt();
		if(num1 <= 0) {
			System.out.println("Numero non valido");
		}else {
			for(int i = 0; i <= num1; i++) {
				if(i > 5) {
					System.out.println(i);
				}
			}
		}
		System.out.println("Programma Terminato");
		sc.close();
	}

}
