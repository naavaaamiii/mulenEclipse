package com.gdg.rocky.synchronization;

public class Sync {

int x;
	
	synchronized void show(String s, int x)
	{
		this.x = x;
		System.out.println("start in thread "  + s + " at value " + x);
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException  e)
		{
			
		}
		System.out.println("value of x is " + x);
	}
}
