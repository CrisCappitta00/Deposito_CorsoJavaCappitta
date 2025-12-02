package com.azienda.esercizi.ui;

import java.util.Scanner;

public class Calcolatrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int num1, num2;
		//mantengo il programma attivo finché si sceglie un numero tra 1 e 4 (compresi)
		do {
			choice = scegliOperazione(sc);

			if(choice != 0) {
				System.out.println("Inserire il primo valore");
				num1 = sc.nextInt();
				System.out.println("Inserire il secondo valore");
				num2 = sc.nextInt();
				if(choice == 1) {
					System.out.println("E' stata scelta la somma");
					int risultato = somma(num1, num2);
					System.out.println("Somma: "+ num1 + " + " + num2 + " = "+ risultato);

				}
				if(choice == 2) {
					System.out.println("E' stata scelta la differenza");
					int risultato = differenza(num1, num2);
					System.out.println("Differenza: "+ num1 + " - " + num2 + " = "+ risultato);

				}
				if(choice == 3) {
					System.out.println("E' stato scelto il prodotto");
					int risultato = prodotto(num1, num2);
					System.out.println("Prodotto: "+ num1 + " * " + num2 + " = "+ risultato);

				}
				if(choice == 4) {
					System.out.println("E' stato scelto il rapporto");
					if(num2 == 0) {
						System.out.println("Impossibile effettuare la divisione, il 2° valore è 0");
					}else {
						int risultato = rapporto(num1, num2);
						System.out.println("Rapporto: "+ num1 + " / " + num2 + " = "+ risultato);
					}
				}
			}

		}while(choice >=1 && choice <=4);

		System.out.println("Programma Terminato");
		sc.close();

	}
	public static int somma(int a, int b) {
		return a + b;
	}
	public static int differenza(int a, int b) {
		return a - b;
	}
	public static int prodotto( int a, int b) {
		return a * b;
	}
	public static int rapporto(int a ,int b) {
		return a / b;
	}
	public static int scegliOperazione(Scanner sc) {
		int scelta;
		do {
			System.out.println("Inserire un valore compreso tra 1 e 4 per effettuare rispettivamente: \n1=somma\n2=differenza\n3=prodotto\n4=rapporto\n0=per chiudere il programma");
			scelta =sc.nextInt();
			if(scelta < 0 || scelta > 4) {
				System.out.println("Attenzione inserire un valore valido");
			}
		}while(scelta < 0 || scelta > 4);
		if(scelta == 0) {
			System.out.println("L'utente ha scelto di chiudere il programma");
		}
		return scelta;
	}
}
