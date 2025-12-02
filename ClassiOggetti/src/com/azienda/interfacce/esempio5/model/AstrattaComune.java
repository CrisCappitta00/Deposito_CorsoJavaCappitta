package com.azienda.interfacce.esempio5.model;

public abstract class AstrattaComune implements InterfacciaComune {
	@Override
	public void metodoA() {
		System.out.println("Metodo A");  //duplicazioni sono sempre un problema --> centralizzo
		
	}

	@Override
	public void metodoB() {
		System.out.println("Metodo B");
		
	}
}
