package ch17.chat.client;

import ch17.chat.Message;

public interface MessageListener {

	public void onMessageReceived(Message message);
}
