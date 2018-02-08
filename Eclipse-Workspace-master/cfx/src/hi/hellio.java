package hi;

import javax.jws.WebService;

@WebService(targetNamespace = "http://hi/", portName = "hellioPort", serviceName = "hellioService")
public class hellio {
	
	public String hi()
	{
		return "hi";
	}

}
