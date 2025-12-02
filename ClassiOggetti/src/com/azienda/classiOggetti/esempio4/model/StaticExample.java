package com.azienda.classiOggetti.esempio4.model;

public class StaticExample {
    public static int numeroStatico;
    public int numero;
    
//	public StaticExample(int numero) {
//		super();
//		this.numero = numero;
//	}
	public static int getNumeroStatico() {
		return numeroStatico;
	}
	public static void setNumeroStatico(int numeroStatico) {
		StaticExample.numeroStatico = numeroStatico;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
    public static void metodoStatico() {
    	numeroStatico = 16; //gli static vanno solo con gli static 
    }
    public void metodo() {
    	numero = 22;
    	numeroStatico = 23;
    }
    
    
}
