package com.gdg.rocky.classes;
import java.util.Scanner;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Sender {
	
	static String userInput;

	private ConnectionFactory factory = null;   //It is an administered object with which a connection between 
													//JMS client and Service provider is establishing.
	private Connection connection = null;
	
	private Session session = null;
	
	private Destination destination = null;    //: Destination is the object into which a JMS clients targets its messages. 
												//Also JMS clients receives messages from the destination
	private MessageProducer producer = null;  //It is created from a session and is using to send messages to destinations.
	
	public Sender() 
	{

	}
	
	public boolean sendMessage() 
	{
		boolean a = false;
		try
		{
			factory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_BROKER_URL);  //   tcp://localhost:61616
			connection = factory.createConnection();
			connection.start();
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			destination = session.createQueue("SAMPLEQUEUE");
			producer = session.createProducer(destination);     // this is responsible to deliver the message to the queue
																// this 'destination' class inside createProducer() is the super interface of 'Queue'
			
			TextMessage message = session.createTextMessage();
			message.setText("Hello ...This is a sample message..sending from FirstClient");
			//message.setText(msg);
			
			producer.send(message);
			System.out.println("Sent: " + message.getText());
			if(message.getText() != null)
			{
				a = true;
			}
			
		} 
		catch (JMSException e) 
		{
			e.printStackTrace();
		}
		
		return a;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//System.out.println("Enter the message you want to send from Client to server");
		
		/*Scanner sc = new Scanner(System.in);
		userInput =  sc.nextLine();*/
		
		Sender sender = new Sender();
		sender.sendMessage();
		
	}

}
