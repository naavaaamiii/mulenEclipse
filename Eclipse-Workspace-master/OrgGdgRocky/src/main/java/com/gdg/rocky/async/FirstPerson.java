package com.gdg.rocky.async;

import java.util.Properties;
import javax.jms.JMSException;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class FirstPerson {

	private Context context = null;
	private TopicConnectionFactory factory = null;       //   A client uses a TopicConnectionFactory object to create TopicConnection objects
														//   with a publish/subscribe JMS provider.
	
	private TopicConnection connection = null;			//  A TopicConnection object is an active connection to a publish/subscribe JMS provider. 	
														//   A TopicConnection can be used to create a TopicSession
	private TopicSession session = null;	//   TopicSession object provides methods for creating TopicPublisher, TopicSubscriber, and TemporaryTopic objects.
	private Topic topic = null;
	private TopicPublisher publisher = null;

	public FirstPerson() 
	{
		// TODO Auto-generated constructor stub
	} 

	public void sendMessage() 
	{
		Properties initialProperties = new Properties();
		initialProperties.put(InitialContext.INITIAL_CONTEXT_FACTORY,
		"org.exolab.jms.jndi.InitialContextFactory");
		initialProperties.put(InitialContext.PROVIDER_URL,
		"tcp://localhost:3035");
		
		try
		{
			context = new InitialContext(initialProperties);
			factory = (TopicConnectionFactory) context
			.lookup("ConnectionFactory");
			topic = (Topic) context.lookup("topic1");
			connection = factory.createTopicConnection();
			session = connection.createTopicSession(false,
			TopicSession.AUTO_ACKNOWLEDGE);
			publisher = session.createPublisher(topic);
			TextMessage message = session.createTextMessage();
			message.setText("Hello ...This is a sample message");
			connection.start();
			publisher.publish(message);
			System.out.println("Message has successfully sent...");

		} 
		catch (NamingException e) 
		{
			e.printStackTrace();
		} 
		catch (JMSException e) 
		{
			e.printStackTrace();
		}
		if (connection != null) 
		{
			try {
					connection.close();
				} 
			catch (JMSException ex)
			{
				ex.printStackTrace();
			}
		}
		if (context != null)
		{
			try 
			{
				context.close();
			} 
			catch (NamingException ex)
			{
				ex.printStackTrace();
			}
		}

	}

	public void closeContext() 
	{

		if (connection != null) 
		{
			try 
			{
				connection.close();
			}
			catch (JMSException ex) 
			{
				ex.printStackTrace();
			}
		}
		if (context != null) 
		{
			try 
			{
				context.close();
			} 
			catch (NamingException ex)
			{
				ex.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FirstPerson f = new FirstPerson();
		f.sendMessage();
	}

}
