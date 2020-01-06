package com.shyam.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.shyam.messenger.database.DatabaseClass;
import com.shyam.messenger.model.Message;

public class MessageService {

	private static Map<Long, Message> messages = DatabaseClass.getAllMessages();
	
	
	public MessageService() {
		messages.put(1L, new Message(1, "Hello world", new Date(), "Shyam"));
		messages.put(2L, new Message(2, "Fuck the world", new Date(), "Karthik"));
	}

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}

	public Message getMessage(long id) {
		return messages.get(id);
	}

	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}

	public Message updateMessage(Message message) {
		if (message.getId() <= 0)
			return null;
		messages.put(message.getId(), message);
		return message;

	}

	public Message removeMessage(Long id) {
		return messages.remove(id);

	}

}
