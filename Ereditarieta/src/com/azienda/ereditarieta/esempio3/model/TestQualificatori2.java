package com.azienda.ereditarieta.esempio3.model;

public class TestQualificatori2 {

	public static void main(String[] args) {
		//Qualificatori.stringaPrivata = "X";
		Qualificatori.stringaPubblica = "X";  // accessibile ovunque
		Qualificatori.stringaDefault = "X"; // qui il default funziona siamo nello stesso package
		Qualificatori.stringaProtetta = "X"; // qui funziona, siamo nello stesso package
	}

}
