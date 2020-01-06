package com.shyam.messenger.resources;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shyam.messenger.model.Message;
import com.shyam.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessage() {
		return messageService.getAllMessages();
	}
	
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessageById(@PathParam("id") Long id) {
		return messageService.getMessage(id);
	}
	
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage( Message message) {
		return messageService.addMessage(message);
	}
	
	
	

	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("id") Long id, Message message) {
		message.setId(id);
		return messageService.updateMessage(message);
	}
}
