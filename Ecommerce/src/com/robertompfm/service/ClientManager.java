package com.robertompfm.service;

import java.util.List;

import com.robertompfm.model.Client;

public interface ClientManager {
	
	public void save(Client client);
	
	public void remove(String cpf);
	
	public List<Client> getClients();

	Client searchClient(String cpf) throws ClientNotFoundException;

}
