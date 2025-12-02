package com.azienda.esercizi.ui;

public class Esercizio1 {

	public static void main(String[] args) {
		/*
		 * Creare una classe Operatori1 con un metodo main, che:
         * dichiari una variabile byte e le assegni il valore di -2
         * dichiari una variabile short e le assegni il valore di 25
         * dichiari una variabile int e le assegni il valore di 32
         * dichiari una variabile long e le assegni il valore di 255
         * dichiari una variabile float e le assegni il valore di 15,32
         * dichiari una variabile double e le assegni il valore di 254,78
         * dichiari una variabile char e le assegni il valore «A»
         * dichiari una variabile boolean e le assegni il valore «true»
         * stampi a console  una scritta del tipo «valore della variabile x:» 
         * concatenata col valore della variabile, per ciascuna delle 8 variabili precedentemente definite
		 * 
		 * */
		
        byte b = -2;
        short c = 25;
        int x = 32;
        long var = 255L;  // Aggiungiamo 'L' per specificare che è un long
        float num = 15.32f; // Aggiungiamo 'f' per specificare che è un float
        double num2 = 254.78;
        char lettera = 'A'; // Utilizziamo le virgolette singole per il carattere
        boolean t = true;
		
		System.out.println("Valore della variabile b: " + b);
		System.out.println("Valore della variabile c: " + c);
		System.out.println("Valore della variabile x: " + x);
		System.out.println("Valore della variabile var: " + var);
		System.out.println("Valore della variabile num: " + num);
		System.out.println("Valore della variabile num2: " + num2);
		System.out.println("Valore della variabile lettera: " + lettera);
		System.out.println("Valore della variabile t: " + t);
	}

}
