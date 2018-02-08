package org.gdg.rocky.messenger.resources;

import java.util.List;
import org.gdg.rocky.messenger.service.*;

import com.gdg.rocky.pojo.OrchardProgramPojo;

import org.gdg.rocky.messenger.model.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.gdg.rocky.messenger.model.Message;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();

	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessages()
	{
		return "Hello World";
	}*/
	
	/* @GET
	    @Produces(MediaType.APPLICATION_XML)
	    public List<Message> getMessage() 
	 	{
	       // return "Got it!";
	    	return messageService.getAllMessage();
	    }*/
	 
	 @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<Message> getMessage() 
	 	{
	       // return "Got it!";
	    	return messageService.getAllMessage();
	    }
	 
	/* @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public List<CampusMindsPojo> get
	 {
		 
	 }*/
	 
	/* @PUT
	 @Path("/{messageId}")
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Produces(MediaType.APPLICATION_JSON)
	 public Message updateMessage(Message message)
	 {
		 return messageService.updateMessage(message);
	 }*/
	 
	/* @POST
	 @Produces(MediaType.APPLICATION_JSON)
	 public String addMessages()
	 {
		 return "POST works";
	 }*/
	 
	/* @POST
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Produces(MediaType.APPLICATION_JSON)
	 public Message addMessage(Message message)
	 {
		 return messageService.addMessage(message);
	 }*/
	 
	 //For POST method we need POSTMAN, as it is not a request resource
	 
	 
/*	 @GET
	 @Path("/test")              // this will work in url but it's hardcoded
	 @Produces(MediaType.TEXT_PLAIN)
	 public String test()
	 {
		 return "test";
	 }*/
	 
	/* @GET
	 @Path("/{messageId}")                // this will work with any url like... http://localhost:8016/messenger/webapi/messages/'you can put anything here now'
	 @Produces(MediaType.TEXT_PLAIN)
	 public String test()
	 {
		 return "test";
	 }*/
}
