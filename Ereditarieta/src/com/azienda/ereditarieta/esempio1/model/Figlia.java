package com.azienda.ereditarieta.esempio1.model;

public class Figlia extends Madre {
   private String nomeFiglia;
   public Figlia() {
	   super();
	   System.out.println("Costruttore Figlia");
   }
   public String getNomeFiglia() {
	return nomeFiglia;
   }
   public void setNomeFiglia(String nomeFiglia) {
	this.nomeFiglia = nomeFiglia;
   }
   
}
