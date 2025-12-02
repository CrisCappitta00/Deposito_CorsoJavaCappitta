package com.azienda.ereditarieta.esempio5.ui;

import com.azienda.ereditarieta.esempio5.model.Automobile;

public class TestOverrideToString {

	public static void main(String[] args) {
		Automobile a = new Automobile("f33", 2500, 30000);
		System.out.println(a); // mi restituisce l'indirizzo esadecimale ma se faccio l'override del toString posso dirgli di restituirmi la stringa che mi interessa
		
		
	}

}
