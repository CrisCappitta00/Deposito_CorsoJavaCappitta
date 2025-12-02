package com.azienda.interfacce.esempio4.model;

public class Concreta1 extends ClasseAstratta {
    public void specifico1(){
    	System.out.println("Concreta1 - metodo specifico uno");
    }
	@Override
	public void metodoAstratto() {
		System.out.println("Concreta1 - metodo astratto");		
	}

}
