package com.gdg.rocky.classes;

import javax.jws.WebService;

@WebService(targetNamespace = "http://classes.rocky.gdg.com/", portName = "ApacheCfxLatestPort", serviceName = "ApacheCfxLatestService")
public class ApacheCfxLatest {
	
	public int sum(int x, int y)
	{
		return x+y;
	}
	
	public String append(String a, String b)
	{
		return a+b;
	}

}
