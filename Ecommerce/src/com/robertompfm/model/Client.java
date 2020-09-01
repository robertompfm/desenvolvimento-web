package com.robertompfm.model;

public class Client {
	
	private String name;
	private String email;
	private String phone;
	private String cpf;
	private boolean active = false;
	
	public Client() {
		super();
	}

	public Client(String name, String email, String phone, String cpf) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isActive() {
		return active;
	}

	public void activate() {
		this.active = true;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
}
