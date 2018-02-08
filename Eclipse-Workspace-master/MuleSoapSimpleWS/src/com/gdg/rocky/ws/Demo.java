package com.gdg.rocky.ws;

import javax.jws.WebService;

@WebService
public class Demo {
	
	public int returnSum(int a, int b)
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
