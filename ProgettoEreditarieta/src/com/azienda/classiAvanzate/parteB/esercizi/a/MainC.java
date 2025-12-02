package com.azienda.classiAvanzate.parteB.esercizi.a;

public class MainC {

	public static void main(String[] args) {
		// creo gli oggetti di A
		A object = new A("Test", 5);
		System.out.println(object);
		A object2 = new A("Test", 5);
		System.out.println(object2);
		// uguaglianza oggetti
		if(object.equals(object2)) {
			System.out.println("I due oggetti sono uguali");
		}else {
			System.out.println("I due oggetti non sono uguali");
		}
		//Creo l'oggetto di B
		B objects = new B("TestB",10, 3.14f );
		System.out.println(objects);
		//Verifico che l'attributo s di B sia null inizialmente
		System.out.println("s (in B): " + objects.getS());
		// Imposto un valore per l'attributo s di B
		objects.setS("Nuova Stringa");
		System.out.println("s (dopo set in B): " + objects.getS());
		//Verifico il valore di s in A (classe padre) tramite getParentS()
		System.out.println("Parent s (in A): " + objects.getParentS());  // Il valore di s in A, che dovrebbe essere null
	}

}
