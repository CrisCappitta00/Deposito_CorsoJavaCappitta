package com.azienda.esercizi.ui;

import java.util.Scanner;

public class EsercizioDoWhileBloccante {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("Inserire un numero intero maggiore di zero");
            number = sc.nextInt();
            if (number <= 0) {
                System.out.println("Si deve inputare un numero maggiore di 0");
            }
		}while(number <= 0);
		// qui number deve essere maggiore di zero non c'è bisogno di un altro if
			int contatore = 0; 
			do {
				System.out.println(contatore++);
			}while(contatore < number);
		System.out.println("Programma Terminato");
		sc.close();
	}

}
