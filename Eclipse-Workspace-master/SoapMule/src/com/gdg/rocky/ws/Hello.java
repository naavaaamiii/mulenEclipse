package com.gdg.rocky.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Hello {
	
	@WebMethod
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public int subtract(int a, int b)
	{
		return a-b;
	}

	public int multiply(int a, int b)
	{
		return a*b;
	}
	
	public int divide(int a, int b)
	{
		return a+b;
	}
}
