package com.azienda.classiOggetti.esempio4.ui;

import com.azienda.classiOggetti.esempio4.model.StaticExample;

public class TestStaticExample {
    private static String nome = "Anna";
	public static void main(String[] args) {
		StaticExample.numeroStatico = 12;
		System.out.println(StaticExample.numeroStatico);
		StaticExample esempio = new StaticExample();
		esempio.numero = 15;
		System.out.println(esempio.numero);
		StaticExample esempio2 = new StaticExample();
		esempio2.numero = 25;
		System.out.println(esempio2.numero);
		StaticExample.metodoStatico();
		esempio2.metodo();
		nome = "Eva";
	}

}
