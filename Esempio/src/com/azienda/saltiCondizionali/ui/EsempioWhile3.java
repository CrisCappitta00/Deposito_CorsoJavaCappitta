package com.azienda.saltiCondizionali.ui;

import java.util.Scanner;

public class EsempioWhile3 {

	public static void main(String[] args) {
		// Chiedo un numero se pari stampo pari, altrimenti stampo dispari 
		Scanner sc = new Scanner(System.in);
		int numero = -1;
		// il while non parte proprio perché la variabile finché non gli diamo un valore non esiste
		while(numero != 0) {
			System.out.println("Inserire un numero positivo, 0 per terminare");
			numero = sc.nextInt();
			if(numero < 0) {
				System.out.println("Inserire un numero maggiore di 0");
			}else if(numero != 0){
				String message = numero%2 == 0? "il numero è pari" : "il numero è dispari";
				System.out.println(message);
			}
		}
		System.out.println("Programma terminato");
		sc.close();

	}

}
