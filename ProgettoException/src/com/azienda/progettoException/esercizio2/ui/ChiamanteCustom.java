package com.azienda.progettoException.esercizio2.ui;

import java.util.Scanner;

import com.azienda.progettoException.esercizio2.model.Controller;
import com.azienda.progettoException.esercizio2.model.NumeroNegativoException;
import com.azienda.progettoException.esercizio2.model.NumeroZeroException;

public class ChiamanteCustom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Procedere con la divisione? 1 = Sì, 2 = No ");
			int scelta = leggiNumeroIntero(sc);
			if(scelta == 1 ) {
				System.out.println("Assegnare un valore intero alla prima variabile");
				int numero = leggiNumeroIntero(sc);
				try {
					Controller.checkPositive(numero);
				} catch (NumeroNegativoException e) {
					System.out.println("Errore: " + e.getMessage());
					e.printStackTrace();
					continue; // così riavvio il ciclo
				}
				System.out.println("Assegnare un valore intero alla seconda variabile");
				int numero2 = leggiNumeroIntero(sc);
				try {
					Controller.checkNotZero(numero2);
				} catch (NumeroZeroException ex) {
					System.out.println("Errore: " + ex.getMessage());
					ex.printStackTrace();
					continue;
				}
				eseguiOperazione(numero, numero2);
			}else if(scelta == 2) {
				break;
			}else {
				System.out.println("Scelta non valida. Inserire 1 per sì o 2 per no");
			}
		}while(true);
		System.out.println("Programma Terminato");
		sc.close();
	}
	public static int leggiNumeroIntero(Scanner sc) {
		while(true) {
			if(sc.hasNextInt()) {
				return sc.nextInt();
			}else {
				System.out.println("Errore devi inserire un numero intero. Riprova a reinserire il numero");
				sc.next();
			}
		}
	}
    public static void eseguiOperazione(int numero1, int numero2 ) {
    	int risultato = numero1 / numero2;
    	System.out.println(numero1  +  " / " + numero2 + " = " + risultato);
    }
}
