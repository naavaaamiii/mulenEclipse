package com.gdg.rocky.innerClass.multiThreading;

class Outer
{
	private Thread t;
	private String threadName;
	PrintDemo d;
	
	void outerMethod()
	{
		class Inner extends Thread
		{
			public Inner(String my, PrintDemo demo)
			{
				threadName = my;;
				d = demo;
				System.out.println("Starting thread " + threadName);
				start();
			}
			
			public void run()
			{
				synchronized (d) 
				{
					d.printCount();
				}
			}
		}
		PrintDemo pd = new PrintDemo();
		Inner i1 = new Inner("Thread- 1 ", pd);
		Inner i2 = new Inner("Thread- 2 ", pd);
		
		try{
			i1.join();
			i2.join();
		}
		catch(Exception e)
		{
			
		}	
	}	
}

class PrintDemo
{
	public void printCount()
	{
		try
		{
			for(int i =5; i > 0; i--)
			{
				System.out.println("value of i   -  " + i);
			}
		}
		catch(Exception e)
		{
			System.out.println("Thread interrupted");
		}
		
	}
}

public class ThreadingInnerClasses 
{
	public static void main(String[] args)
	{
		Outer o = new Outer();
		o.outerMethod();
	}
}