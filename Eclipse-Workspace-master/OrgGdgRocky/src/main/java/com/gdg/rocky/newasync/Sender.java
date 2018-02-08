package com.gdg.rocky.newasync;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.QueueSender;
import javax.jms.DeliveryMode;
import javax.jms.QueueSession;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;

public class Sender {
	
	public static void main(String[] args) throws Exception {
		Properties env = new Properties();
		//The java.util.Properties class is a class which represents a persistent set of properties.
		//The Properties can be saved to a stream or loaded from a stream.
		env.put(Context.INITIAL_CONTEXT_FACTORY,
				"org.apache.activemq.jndi.ActiveMQInitialContextFactory");
		env.put(Context.PROVIDER_URL, "tcp://localhost:61616");
		env.put("queue.queueSampleQueue", "MyNewQueue");
		
		// get the initial context
		InitialContext ctx = new InitialContext(env);   //This class is the starting context for performing naming operations
														// InitialContext class implements the Context interface and serves as our entry point to a naming system.
		

		// lookup the queue object
		Queue queue = (Queue) ctx.lookup("queueSampleQueue");
		// lookup the queue connection factory
		QueueConnectionFactory connFactory = (QueueConnectionFactory) ctx.lookup("QueueConnectionFactory");
		//A client uses a QueueConnectionFactory object to create QueueConnection objects with a point-to-point JMS provider
		
		// create a queue connection
		QueueConnection queueConn = connFactory.createQueueConnection();
		//A QueueConnection object is an active connection to a point-to-point JMS provider. 
		 //A client uses a QueueConnection object to create one or more QueueSession objects for producing and consuming messages

		// create a queue session
		QueueSession queueSession = queueConn.createQueueSession(false,Session.DUPS_OK_ACKNOWLEDGE);
		//A QueueSession object provides methods for creating QueueReceiver, QueueSender, QueueBrowser, and TemporaryQueue objects

		// create a queue sender
		QueueSender queueSender = queueSession.createSender(queue);   // A client uses a QueueSender object to send messages to a queue.
		queueSender.setDeliveryMode(DeliveryMode.NON_PERSISTENT);    //This is the lowest-overhead delivery mode because it does not require that the message be logged to stable storage
		
		

		// create a simple message to say "Hello"
		TextMessage message = queueSession.createTextMessage("hello");

		// send the message
		queueSender.send(message);

		System.out.println("sent: " + message.getText());

		queueConn.close();
	}

}
