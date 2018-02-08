package com.gdg.rocky;

class InnerThread1 
{
	  private int countDown = 5;

	  private Inner inner;

	  private class Inner extends Thread 
	  {
	    Inner(String name) 
	    {
	      super(name);
	      start();
	    }

	    public void run() 
	    {
	      while (true) 
	      {
	       // System.out.println(this);
	        if (--countDown == 0)
	          return;
	        try 
	        {
	          sleep(10);
	        } catch (InterruptedException e) 
	        {
	          throw new RuntimeException(e);
	        }
	      }
	    }

	    public String toString() 
	    {
	      return getName() + ": " + countDown;
	    }
	  }

	  public InnerThread1(String name) 
	  {
	    inner = new Inner(name);
	  }
}

class InnerThread2 
{
	  private int countDown = 5;

	  private Thread t;

	  public InnerThread2(String name) 
	  {
	    t = new Thread(name)
	    {
	      public void run() 
	      {
	        while (true) 
	        {
	          //System.out.println(this);
	          if (--countDown == 0)
	            return;
	          try 
	          {
	            sleep(10);
	          } catch (InterruptedException e) 
	          {
	            throw new RuntimeException(e);
	          }
	        }
	      }

	      public String toString() 
	      {
	        return getName() + ": " + countDown;
	      }
	    };
	    t.start();
	  }
}


public class MyThreadVariation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new InnerThread1("Inner Thread 1");
		new InnerThread2("Inner Thread 2");

	}

}
