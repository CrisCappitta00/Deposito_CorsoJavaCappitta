package com.azienda.saltiCondizionali.ui;

import java.util.Scanner;

public class EsempioWhile2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci un numero positivo");
		int soglia = sc.nextInt();
		if(soglia <= 0) {
			System.out.println("Impossibile procedere");
		} else {
			boolean exit = false;
			int contatore = 0;
			while(!exit) { //while exit false
				if(contatore == soglia) {
					exit = true;
				} else {
					System.out.print(++contatore + "\t");
				}
			}
			System.out.println();
		}
		System.out.println("Programma Terminato");
		sc.close();

	}

}
