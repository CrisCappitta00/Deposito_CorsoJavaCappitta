package com.azienda.sintassiBaseMetodi.ui;

import java.util.Scanner;

public class EsempioMetodo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Inserire un nome");
//		String x = sc.nextLine();
//		benvenuto(x);
//
//		boolean pari = isEven(4);
//		System.out.println(pari);
		
//		checkNome(sc);
		int risultato = productN(5);
		System.out.println("Risultato " + risultato);
		System.out.println("Risultato " + productN(5));
		System.out.println("Programma Terminato");
		sc.close();

	}

	static void benvenuto(String nome) {
		System.out.println("Benvenuto " + nome);
	} 
	//metodo che controlla se un numero è pari o dispari
	static boolean isEven(int a) {
		// possiamo anche scriverlo così: 
		/*if(a %2 == 0) {
			return true;	
		}
		return false;*/
		return a %2 == 0; // ottimale
	}
	static void checkNome(Scanner x) {
		System.out.println("Inserire un nome");
		String nome = x.nextLine();
		int lenght = nome.length();
		boolean b = isEven(lenght);
		if(b) {
			System.out.println(nome + " ha la lunghezza pari");
		}else {
			System.out.println(nome + " ha la lunghezza dispari");
		}
	}
	//prodotto dei numeri fino a x
	static int productN(int soglia) {
		int parziale = 1;
		for (int i = 1; i <= soglia; i++) {
			parziale *= i;
		}
		return parziale;
	}
}
