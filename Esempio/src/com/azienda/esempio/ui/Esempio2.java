package com.azienda.esempio.ui;

import java.util.Scanner;

public class Esempio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire un numero");
		int numero = sc.nextInt();
		System.out.println("Il numero inserito è: " + numero);
        sc.close();
	}

}
