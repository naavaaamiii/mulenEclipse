package com.gdg.rocky.classes;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://classes.rocky.gdg.com/", portName = "ApacheCfxPort", serviceName = "ApacheCfxService")
public class ApacheCfx {
	
	/*public String sayHello(String str)
	{
		return "Hello" + str + "this is string";
	}*/
	
	public String myString()
	{
		return "This is the string I will work upon";
	}
	
	public int number(int a, int b)
	{
		return a+b;
	}

}
