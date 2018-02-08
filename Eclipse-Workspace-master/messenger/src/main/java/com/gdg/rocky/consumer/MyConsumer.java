package com.gdg.rocky.consumer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.message.internal.MediaTypes;
import org.springframework.web.client.RestTemplate;

public class MyConsumer {

	public static void main(String[] args) {
	/*	//Make a client
		Client client = ClientBuilder.newClient();
		//set a target of client
		WebTarget target = client.target("http://localhost:8016/messenger/webapi/messages");
		System.out.println(target.request(MediaType.TEXT_XML).get(String.class));*/
		
		String url="http://localhost:8016/messenger/webapi/messages";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class);
		System.out.println("Response is  " + result + "  ");
	
		
	}

}
