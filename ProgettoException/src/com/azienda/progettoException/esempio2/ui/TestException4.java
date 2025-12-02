package com.azienda.progettoException.esempio2.ui;

import com.azienda.progettoException.esempio2.model.Divisione;

public class TestException4 {

	public static void main(String[] args) {
		int risultato;
		try {
			risultato = Divisione.divisioneChecked(4, 2);
			System.out.println(risultato);
			try {
				risultato = Divisione.divisioneUnchecked(4, 0);
				System.out.println(risultato);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				risultato = Divisione.divisioneChecked2(3, 0);
				System.out.println(risultato);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			try {
				risultato = Divisione.divisioneChecked3(2, 0);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
