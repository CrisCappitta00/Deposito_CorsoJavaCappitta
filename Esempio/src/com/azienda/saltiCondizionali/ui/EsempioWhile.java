package com.azienda.saltiCondizionali.ui;

import java.util.Scanner;

public class EsempioWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire un numero positivo");
		int a = sc.nextInt();
		
		if(a <= 0) {
			System.out.println("Impossibile procedere");
		}else {
			int contatore = 0;
			while(contatore < a) {
				System.out.println(++contatore + " ");
			}
			System.out.println();
		}
		System.out.println("Programma terminato");	
		sc.close();
	
	}

}
