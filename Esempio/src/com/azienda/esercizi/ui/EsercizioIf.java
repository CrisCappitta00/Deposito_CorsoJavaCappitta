package com.azienda.esercizi.ui;

import java.util.Scanner;

public class EsercizioIf {

	public static void main(String[] args) {
       /*
        * Creare una classe **`EsercizioIf`** con un metodo **`main`** che:
        * 1. Riceva in input da console **due numeri interi**, chiedendo all’utente di inserirli uno alla volta.
        * 2. Se **il secondo numero è zero**, stampi a video il messaggio:
        *     **"Non si può dividere per zero"**.
        * 3. Solo se **entrambi i numeri sono positivi** **e** **il secondo è minore o uguale al primo**,
        *     esegua **la divisione** tra i due numeri e stampi il risultato.
        * 4. Alla fine stampi il messaggio:
        *     **"Programma terminato"**.
        *     */
		Scanner sc = new Scanner(System.in);
		System.out.println("Assegnare un valore alla prima variabile intera");
		int num1 = sc.nextInt();
		System.out.println("Assegnare un valore alla seconda variabile intera");
		int num2 = sc.nextInt();
		if(num2 == 0) {
			System.out.println("Non si può dividere per zero");
		}else if( (num1 > 0 && num2 > 0) && (num2 <= num1)) {
			int num3 = num1 / num2;
			System.out.println("Rapporto pari a: " + num3);
		}
		System.out.println("Programma Terminato");
		sc.close();
	}

}
