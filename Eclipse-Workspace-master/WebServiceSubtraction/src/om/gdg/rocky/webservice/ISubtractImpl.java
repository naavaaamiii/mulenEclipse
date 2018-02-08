package om.gdg.rocky.webservice;

import javax.jws.WebService;

@WebService(endpointInterface="om.gdg.rocky.webservice.ISubtraction")
public class ISubtractImpl implements ISubtraction{

	@Override
	public int subtract(int x, int y) {
		// TODO Auto-generated method stub
		
		int z = x-y;
		return z;
	}
	
	

}
