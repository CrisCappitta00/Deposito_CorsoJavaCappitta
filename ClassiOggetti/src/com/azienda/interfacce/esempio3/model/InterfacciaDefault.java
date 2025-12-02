package com.azienda.interfacce.esempio3.model;

public interface InterfacciaDefault {
	public void atratto(); // non ha corpo, solo parametri se necessario
	
	// quando la implemento in una classe non ho l'obbligo di sovrascriverlo
	public default void metodoDefault() {
		System.out.println("Metodo default");
	}
	public static void metodoStatico() {
		System.out.println("Metodo statico");
	}
}
