package com.robertompfm.notification;

import com.robertompfm.model.Client;

public interface Notification {

	public void notify(Client client, String message);
	
}
