package com.azienda.saltiCondizionali.ui;

import java.util.Scanner;

public class EsempioIf {

	public static void main(String[] args) {
		//Due variabili in ingresso inserite dall'utente
		Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Inserire il primo numero");
        num1 = sc.nextInt();
        System.out.println("Inserire il secondo numero");
        num2 = sc.nextInt();
        
        if(num1 > num2) {
        	System.out.println(num1 + " e\' maggiore di " + num2);
        }else if(num2 > num1) {
        	System.out.println(num1 + " e\' minore di " + num2);
        }else {
        	System.out.println(num1 + " e\' uguale a " + num2);
        }
    	System.out.println("Programma terminato");

        sc.close();
        
	}

}
