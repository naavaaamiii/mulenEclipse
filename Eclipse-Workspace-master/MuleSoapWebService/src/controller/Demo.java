package controller;

import javax.jws.WebService;

@WebService(targetNamespace = "http://controller/", portName = "DemoPort", serviceName = "DemoService")
public class Demo {
	
	public String hello()
	{
		return "Hello World";
	}
	
	public int sum(int a, int b)
	{
		return a+b;
	}

	
	
	public int returnMultiplication(int a, int b)
	{
		return a*b;
	}
	
	public int returnSubtraction(int a, int b)
	{
		return a-b;
	}
	
	public int returnDivide(int a, int b)
	{
		return a/b;
	}
}
