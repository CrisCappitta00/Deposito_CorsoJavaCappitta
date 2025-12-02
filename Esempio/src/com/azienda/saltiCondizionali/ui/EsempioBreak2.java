package com.azienda.saltiCondizionali.ui;

import java.util.Scanner;

public class EsempioBreak2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Inserire un numero");
			numero = sc.nextInt();

		}while(numero <= 0);
		System.out.println("Il numero dopo il primo ciclo: " + numero);
		do {
			System.out.println("Inserire un numero");
			numero = sc.nextInt();
			if (numero > 0) {
				break;
			}
		}while(true);
		System.out.println("Il numero dopo il secondo ciclo: " + numero);

		sc.close();

	}

}
