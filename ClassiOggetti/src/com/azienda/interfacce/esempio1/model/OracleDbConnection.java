package com.azienda.interfacce.esempio1.model;

public class OracleDbConnection implements DbConnection {

	public void oracleInsert() {
		System.out.println("Oracle Insert");
	}
	@Override
	public void open(String url, String user, String password) {
		System.out.println("Oracle open connection");		
	}

	@Override
	public void close() {
		System.out.println("Oracle close connection");		
	}

}
