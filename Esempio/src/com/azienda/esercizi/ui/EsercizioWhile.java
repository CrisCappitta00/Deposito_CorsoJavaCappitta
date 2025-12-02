package com.azienda.esercizi.ui;

import java.util.Scanner;

public class EsercizioWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Inserimento Numeri interi da parte dell'utente
		System.out.println("Assegnare un valore intero alla prima variabile");
		int a = sc.nextInt();
		if(a <= 0) {
			System.out.println("Si deve imputare un numero maggiore di 0");
		}else {
			System.out.println("Assegnare un valore intero alla seconda variabile");
			int b = sc.nextInt();
			if(b <= 0) {
				System.out.println("Si deve imputare un numero maggiore di 0");
			} else if(b >= a) {
				System.out.println("Si deve imputare un numero minore di " + a);
			}else {
				int contatore = 0;
				while(contatore < a) {
					System.out.print(contatore + "\t");
					contatore = contatore + b;

				}
			}

		}
		System.out.println("Programma Terminato");
		sc.close();
	}

}
