package com.azienda.interfacce.esempio3.ui;

import com.azienda.interfacce.esempio3.model.ImplDefault2;
import com.azienda.interfacce.esempio3.model.ImplDefaultUno;
import com.azienda.interfacce.esempio3.model.InterfacciaDefault;

public class TestDefault {

	public static void main(String[] args) {
		InterfacciaDefault ref = new ImplDefaultUno();
		ref.atratto();
		ref.metodoDefault();
		InterfacciaDefault.metodoStatico();
		
		ref = new ImplDefault2();
		ref.atratto(); // sovrascritto dalla due
		ref.metodoDefault(); // sovrascritto da impl 2
	}

}
