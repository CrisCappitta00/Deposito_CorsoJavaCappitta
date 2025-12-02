package com.azienda.ereditarieta.esempio7.ui;

import com.azienda.ereditarieta.esempio4.model.Child;
import com.azienda.ereditarieta.esempio4.model.Parent;

public class TestPolimorfismo {

	public static void main(String[] args) {
      Parent p = new Parent();
      p.setStringa1("P1");
      p.setStringa2("P2");
      p.setStringa3("P3");
      p = new Child(); // nuovo oggetto di tipo child
      p.setStringa1("C1");
      p.setStringa2("C2");
      p.setStringa3("C3");
      //Casting
      Child c = (Child) p;
      c.setStringa4("C4");
      c.setParentStringa3("cp3");
      System.out.println("Programma Terminato");
	}

}
