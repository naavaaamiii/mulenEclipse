package com.gdg.rocky.newasync;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class AsyncTest {

	@Test
	public void test() {
		Sender sender = new Sender();
		Assert.assertEquals(new Sender(), "Hello");
	}

}
