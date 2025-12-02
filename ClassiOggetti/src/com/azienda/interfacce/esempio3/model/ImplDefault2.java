package com.azienda.interfacce.esempio3.model;

public class ImplDefault2 implements InterfacciaDefault {
	// obbligo a fare override
	@Override
	public void atratto() {
		System.out.println("Impl2 - Astratto");
	}
	// non obbligata per l'override
    @Override
    public void metodoDefault() {
    	System.out.println("Impl2 - Default");
    }
    
}
