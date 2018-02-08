package com.gdg.rocky.classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class JunitJms {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Sender sender = new Sender();
		Receiver receiver = new Receiver();
		Assert.assertEquals(sender.sendMessage(), true);
	}
	
/*	@Before
	public void before()
	{
		Sender sender = new Sender();
		sender.sendMessage();
		Receiver receiver = new Receiver();
		
		Assert.assertEquals(receiver.receiveMessage(), true);
	}*/

}
