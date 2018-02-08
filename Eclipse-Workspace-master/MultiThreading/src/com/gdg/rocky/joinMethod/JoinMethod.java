package com.gdg.rocky.joinMethod;

public class JoinMethod extends Thread {
	
	public void run()
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.println("value of 'i' is " + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinMethod j1 = new JoinMethod();
		JoinMethod j2 = new JoinMethod();
		JoinMethod j3 = new JoinMethod();
		
		j1.start();
		try{
			j1.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		j2.start();
		j3.start();
	}

}
