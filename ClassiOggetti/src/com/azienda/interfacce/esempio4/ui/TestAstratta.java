package com.azienda.interfacce.esempio4.ui;

import com.azienda.interfacce.esempio4.model.ClasseAstratta;
import com.azienda.interfacce.esempio4.model.Concreta1;
import com.azienda.interfacce.esempio4.model.Concreta2;

public class TestAstratta {

	public static void main(String[] args) {
		ClasseAstratta ref = new Concreta1(); //polimorfismo
		ref.metodoAstratto();
		ref.metodoConcreto();
		if(ref instanceof Concreta1) {
			((Concreta1)ref).specifico1();
		}
		ref = new Concreta2();
		ref.metodoAstratto();
		ref.metodoConcreto();
		if(ref instanceof Concreta2) {
			((Concreta2)ref).specifico2();
		}

	}
	//1 - caso
	// se lavoro sulla parte comune passo l'astratta
	public static void metodo(ClasseAstratta ref) {
		ref.metodoAstratto();
		ref.metodoConcreto();
	}
	//versione concettualmente sbagliata
	// il metodo 2 si va a cablare senza un motivo su concreta 1
//	public static void metodo(Concreta1 ref) {
//		ref.metodoAstratto();
//		ref.metodoConcreto();
//	}
	// 2 - caso
	// se lavoro sulla parte specifica
	public static void metodo3(ClasseAstratta ref) {
		ref.metodoAstratto();
		ref.metodoConcreto();
		if(ref instanceof Concreta1) {
			((Concreta1)ref).specifico1();
		}
	}
	//questa modalità funziona solo con Concreta 1, lineare e diretta ma vincolata
	public static void metodo4(Concreta1 ref) {
		ref.metodoAstratto();
		ref.metodoConcreto();
		ref.specifico1();
	}
}
