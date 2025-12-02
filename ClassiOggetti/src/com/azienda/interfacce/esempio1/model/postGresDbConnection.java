package com.azienda.interfacce.esempio1.model;

public class postGresDbConnection implements DbConnection {

	public void postGresInsert() {
		System.out.println("Post Gres Insert");
	}
	@Override
	public void open(String url, String user, String password) {
		System.out.println("Post Gres open connection");
	}

	@Override
	public void close() {
		System.out.println("Post Gres close connection");
	}

}
