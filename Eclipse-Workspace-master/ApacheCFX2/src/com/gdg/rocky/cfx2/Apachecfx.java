package com.gdg.rocky.cfx2;

import javax.jws.WebService;

@WebService(targetNamespace = "http://cfx2.rocky.gdg.com/", portName = "ApachecfxPort", serviceName = "ApachecfxService")
public class Apachecfx {
	
	
	public String myString(String name)
	{
		return "hello " + name + "world ";
	}

}
