package com.robertompfm.service;

import com.robertompfm.model.Client;
import com.robertompfm.notification.Notification;

public class ClientServiceActivation {
	
	private Notification notification;

	public ClientServiceActivation(Notification notification) {
		super();
		this.notification = notification;
	}
	
	public void notifyClient(Client client, String message) {
		client.activate();
		this.notification.notify(client, message);
	}

}
