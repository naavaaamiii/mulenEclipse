package com.gdg.rocky.communicatingClasses;

import org.apache.tomcat.dbcp.dbcp2.ConnectionFactory;

public class Sender {

	private ConnectionFactory factory = null;
	private Connection connection = null;
	private Session session = null;
	private Destination destination = null;
	private MessageProducer producer = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
