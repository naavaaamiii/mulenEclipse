package com.gdg.rocky.synchronization;
import com.gdg.rocky.synchronization.Sync;


class Dhaga1 extends Thread
{
	Sync sy;
	Dhaga1(String s, Sync sy)
	{
		super(s);
		this.sy = sy;
		start();
	}
	
	public void run()
	{
		sy.show(getName(), 10);
	}
}

class Dhaga2 extends Thread
{
	Sync sy;
	Dhaga2(String s, Sync sy)
	{
		super(s);
		this.sy = sy;
		start();
	}
	
	public void run()
	{
		sy.show(getName(), 20);
	}
}

class Dhaga3 extends Thread
{
	Sync sy;
	Dhaga3(String s, Sync sy)
	{
		super(s);
		this.sy = sy;
		start();
	}
	
	public void run()
	{
		sy.show(getName(), 30);
	}
}

class MainDhaga
{
	public static void main(String[] args)
	{
		Sync sy = new Sync();
		new Dhaga1("A", sy);
		new Dhaga2("B", sy);
		new Dhaga3("C", sy);
	}
}
