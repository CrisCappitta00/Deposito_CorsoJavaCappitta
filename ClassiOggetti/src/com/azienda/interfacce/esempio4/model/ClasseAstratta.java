package com.azienda.interfacce.esempio4.model;
//def classe astratta
public abstract class ClasseAstratta {
	public abstract void metodoAstratto(); // se astratto posso non mettere graffe
	public void metodoConcreto() {
		System.out.println("Astratta - metodo concreto");
	}
}
