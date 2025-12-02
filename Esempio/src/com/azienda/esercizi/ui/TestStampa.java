package com.azienda.esercizi.ui;

import java.util.Scanner;

public class TestStampa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soglia, i;
		do {
			// Richiesta del valore soglia
			System.out.println("Assegnare un valore intero alla variabile soglia");
			soglia = sc.nextInt();
			if(soglia == 0) {
				System.out.println("Programma Terminato");
				sc.close();
				return;
			}
			//Richiesta del valore incremento 
			System.out.println("Assegnare un valore intero alla variabile incremento");
			i = sc.nextInt();
			// invocazione del metodo stampa
			stampa(soglia,i);
		}while(soglia != 0);

		System.out.println("Programma Terminato");
		sc.close();

	}
	public static void stampa(int soglia, int incremento) {
		if (incremento > 0 && soglia > 0 && (incremento < soglia)) {
			int i = 0;
			//stampo i numeri da zero a soglia con incremento
			while(i < soglia) {
				System.out.print(i + " ");
				i += incremento;
			}
			System.out.println();

		} else {
			if(incremento < 0 || soglia < 0) {
				System.out.println("Errore: Entrambi i valori devono essere positivi."); 
			} else if(incremento >= soglia) {
				System.out.println("Errore: l'incremento deve essere minore della soglia."); 
			}
		}
	}
}
