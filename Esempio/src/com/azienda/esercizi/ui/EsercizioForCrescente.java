package com.azienda.esercizi.ui;

import java.util.Scanner;

public class EsercizioForCrescente {

	public static void main(String[] args) {
        /*
         * Creare una classe **`EsercizioForCrescente`** con un metodo **`main`** che:
         * 1. Chieda all’utente un numero intero **maggiore di 0**.
         * 2. Se il numero è **minore o uguale a zero**, stampi:
         *     
         *     **"Valore non valido"**
         *     
         *     e termini.
         *     
         * 3. Altrimenti utilizzi un **ciclo for** per stampare tutti i numeri da **1** al numero inserito.
         *     - Esempio: se l’utente inserisce **4**, stampa
         *         
         *         **1, 2, 3, 4**
         *          * 
         * 
         * */
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire un numero intero maggiore di 0");
		int num1 = sc.nextInt();
		if(num1 <= 0) {
			System.out.println("Valore non valido");
		}else {
			for (int i = 1; i <= num1; i++) {
				System.out.println(i);
			}
		}
		System.out.println("Programma Terminato");
		sc.close();
	}

}
