package com.azienda.sintassiBase.conversioni.ui;

public class EsempioConversioni {

	public static void main(String[] args) {
		int intera = 10;
		byte by = 12;
		//
		intera = by;
		by = (byte)intera;
		System.out.println(by);
		//
		intera = 130;
		by = (byte)intera;
		System.out.println(by);
        //
		float numeroConVirgola = 14.99f;
		numeroConVirgola = intera;
		System.out.println(numeroConVirgola);
	    numeroConVirgola = 14.99f;
		intera = (int)numeroConVirgola;
		System.out.println(intera);
        
		byte b1 = 127;
		byte b2 = 6;
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);
		

	}

}
