package com.robertompfm.service;

public class ClientNotFoundException extends Exception {
	private static final long serialVersionUID = 1l;
	
	public ClientNotFoundException(String msg) {
		super(msg);
	}
}
