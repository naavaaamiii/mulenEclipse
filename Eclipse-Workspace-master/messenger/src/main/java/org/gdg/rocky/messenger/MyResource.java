package org.gdg.rocky.messenger;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.gdg.rocky.messenger.model.Message;
import org.gdg.rocky.messenger.service.MessageService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    MessageService messageService = new MessageService();
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public List<Message> getIt() {
       // return "Got it!";
    	return messageService.getAllMessage();
    }
    
   /* @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getIt() {
       // return "Got it!";
    	return messageService.getAllMessage();
    }*/
}
