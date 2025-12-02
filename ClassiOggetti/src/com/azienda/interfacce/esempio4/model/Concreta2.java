package com.azienda.interfacce.esempio4.model;

public class Concreta2 extends ClasseAstratta {
    public void specifico2(){
    	System.out.println("Concreta2 - metodo specifico due");
    }
	@Override
	public void metodoAstratto() {
		System.out.println("Concreta2 - metodo astratto");		
	}
	@Override
	public void metodoConcreto() {
		System.out.println("Concreta2 - metodo concreto");
	}
}
