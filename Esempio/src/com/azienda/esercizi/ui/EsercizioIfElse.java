package com.azienda.esercizi.ui;

import java.util.Scanner;

public class EsercizioIfElse {

	public static void main(String[] args) {
		/*
		 * Creare una classe **`EsercizioIfElse`** con un metodo **`main`** che:

         * 1. Chieda all’utente di inserire **un numero intero**.
         * 2. Se il numero è **pari**, stampi:
         *     
         *     **"Numero pari"**
         *     
         * 3. Altrimenti stampi:
         *     
         *     **"Numero dispari"**
         *     
         * 4. Alla fine stampi:
         *     
         *     **"Controllo terminato"**
         * 		 * 
		 * */
		Scanner sc  = new Scanner(System.in);
		System.out.println("Inserire un numero intero");
		int num1 = sc.nextInt();
		if(num1 % 2 == 0) {
			System.out.println("Numero pari");
		}else {
			System.out.println("Numero dispari");
		}
		System.out.println("Controllo Terminato");
		sc.close();
		

	}

}
