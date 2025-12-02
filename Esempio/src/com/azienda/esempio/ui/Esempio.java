package com.azienda.esempio.ui;

import java.util.Scanner;

public class Esempio {

	public static void main(String[] args) {
		System.out.println("Inserire un nome");
		Scanner scanner = new Scanner(System.in); //definisco e apro lo scanner
		String nome = scanner.nextLine(); 
		System.out.println("Benvenuto " + nome); // stampa a video la stringa
		
		scanner.close(); // chiudo lo scanner

	}

}
