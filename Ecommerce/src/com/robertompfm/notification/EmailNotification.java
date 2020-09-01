package com.robertompfm.notification;

import com.robertompfm.model.Client;

public class EmailNotification implements Notification {

	@Override
	public void notify(Client client, String message) {
		System.out.printf("Notificando o cliente %s atraves do email %s com a mensagem \"%s\"\n", client.getName(), client.getEmail(), message);
	}

	
}
