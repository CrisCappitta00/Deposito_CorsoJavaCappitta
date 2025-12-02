package com.azienda.progettoException.esercizio1.ui;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Eccezioni1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			try{
				System.out.println("Inserire il primo numero intero");
				int x = sc.nextInt();
				if(x < 0) {
					//sollevo la runtime expeption
					throw new RuntimeException("Il numero inserito è minore di 0");
				}
				System.out.println("Inserire il secondo numero intero");
				int y = sc.nextInt();
				if(y == 0) {
					//sollevo la runtime expeption
					throw new RuntimeException("Il numero inserito è uguale a 0");
				}
				// se non sono lanciate eccezioni effettuo la divisione
				float z = x / y;
				System.out.println(x + " / " + y + " = " + z);

				//se tutto è andato bene esco dal ciclo
				break;
			}catch (InputMismatchException e) {
				// Gestione dell'errore se l'utente inserisce un valore non numerico
                System.out.println("Errore: Devi inserire un numero intero. Riprova.");
                sc.nextLine(); 
				e.printStackTrace();
			}catch (RuntimeException e) {
				//gestisco l'eccezione in un unico catch sia per il primo che per il secondo
				System.out.println("Errore: " + e.getMessage());
				e.printStackTrace();
				System.out.println("Riprova ad inserire i numeri");
			}
		}while(true);
		sc.close();
	}
}
