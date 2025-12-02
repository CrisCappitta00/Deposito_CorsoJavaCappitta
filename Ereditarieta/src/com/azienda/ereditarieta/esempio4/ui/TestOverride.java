package com.azienda.ereditarieta.esempio4.ui;

import com.azienda.ereditarieta.esempio4.model.Child;

public class TestOverride {

	public static void main(String[] args) {
		Child c = new Child();
		c.setStringa1("Stringa 1");
		c.setStringa2("Stringa 2");
		c.setStringa3("Stringa 3");
		c.setStringa4("Stringa 4");
		c.setParentStringa3("Stringa 3 Parent");
		System.out.println("Programma Terminato");
	}

}
