package com.robertompfm.service;


import java.util.ArrayList;
import java.util.List;

import com.robertompfm.model.Client;

public class ClientManagement implements ClientManager {

	private List<Client> clients = new ArrayList<Client>();
	
	@Override
	public void save(Client client) {
		this.clients.add(client);
	}

	@Override
	public void remove(String cpf) {
		
	}

	@Override
	public List<Client> getClients() {
		return this.clients;
	}
}
