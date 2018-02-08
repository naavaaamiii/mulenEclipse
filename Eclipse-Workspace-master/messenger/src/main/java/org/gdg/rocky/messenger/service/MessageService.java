package org.gdg.rocky.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Size;

import org.gdg.rocky.messenger.database.DataBaseClass;
import org.gdg.rocky.messenger.model.Message;

import com.gdg.rocky.pojo.OrchardProgramPojo;

public class MessageService {
	
	private Map<Long, Message> messages = DataBaseClass.getMessage();
	
	private static Map<Long, OrchardProgramPojo> campusMessage = DataBaseClass.getInformation();

	/*public List<Message> getAllMessage()
	{
		Message m1 = new Message(1L, "Hello", "Jack");
		Message m2 = new Message(2L,  "Nami", "Sparrow");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		
		return list;
	}*/
	
	public MessageService() 
	{
		messages.put(1L, new Message(1,"Hello World", "Rocky"));
		messages.put(2L, new Message(2,"Hello Jersey", "Rocky"));
	//	campusMessage.put(3L, new CampPojo())
	}
	
	
	
	/*public static List<CampPojo> getAllInformation()
	{
		return new ArrayList<CampPojo>(campusMessage.values());
	}*/
	
	public List<Message> getAllMessage()
	{
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id)
	{
		return messages.get(id);
	}
	
	public Message addMessage(Message message)
	{
		message.setId(messages.size() +1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message)
	{
		if(message.getId() <= 0 )
		{
			return null;
		}
			
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id )
	{
		return messages.remove(id);
	}
}
