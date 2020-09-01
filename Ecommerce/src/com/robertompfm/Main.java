package com.robertompfm;

import com.robertompfm.model.Client;
import com.robertompfm.notification.EmailNotification;
import com.robertompfm.notification.Notification;
import com.robertompfm.service.ClientManagement;
import com.robertompfm.service.ClientManager;
import com.robertompfm.service.ClientServiceActivation;

public class Main {
	
	public static void main(String[] args) {
		ClientManager manager = new ClientManagement();
		Client client = new Client("Spongebob", "spongebob@krustykrab.com", "1 55 3892 3333", "111-222-333-44");
		
		manager.save(client);
		
		Notification notification = new EmailNotification();
		
		ClientServiceActivation service = new ClientServiceActivation(notification);
		service.notifyClient(client, "Seu cadastro foi realizado com sucesso");
	
		manager.getClients().forEach(c -> {
			System.out.println("Nome: " + c.getName());
			System.out.println("Email: " + c.getEmail());
			System.out.println("Phone: " + c.getPhone());
			System.out.println("Cpf: " + c.getCpf());
		});
	}

}
