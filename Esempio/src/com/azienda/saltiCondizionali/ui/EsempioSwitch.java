package com.azienda.saltiCondizionali.ui;

import java.util.Scanner;

public class EsempioSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
        int num2;
        System.out.println("Inserire il primo numero");
        num1 = sc.nextInt();
        System.out.println("Inserire il secondo numero");
        num2 = sc.nextInt();
		switch (num1 - num2) {
		case 0: {
	        System.out.println("Risultato 0");
			break;
		}
		case 1: {
	        System.out.println("Risultato 1");
	        break;
		}
		default:
	        System.out.println("Risultato diverso da 0 e 1");
		}
        System.out.println("Programma terminato");

		sc.close();
	}

}
