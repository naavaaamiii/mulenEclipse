package com.gdg.rocky;

public class ThreadDemo extends Thread{
	
	private Thread t;
	private String threadName;
	PrintDemo pd;
	public ThreadDemo(String threadName, PrintDemo pd) {
		this.threadName = threadName;
		this.pd = pd;
	}
	
	public void run()
	{
		synchronized (pd) 
		{
			pd.printCount();
		}
		
		System.out.println("Thread " + threadName + " exiting.");
	}
	
	public void start()
	{
		System.out.println("Starting " + threadName);
		if(t == null)
		{
			t = new Thread(this, threadName);
			t.start();
		}
	}

}
