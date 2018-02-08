package controller;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import entities.*;

@WebService(targetNamespace = "http://controller/", portName = "CampusMindWSPort", serviceName = "CampusMindWSService")
public class CampusMindWS {

	public CampusMind getCampusMind()
	{
		return new CampusMind(1, "Rocky", "ashish");
	}
	
	public List<CampusMind> findAllCampusMind()
	{
		List<CampusMind> list = new ArrayList<CampusMind>();
		list.add(new CampusMind(1, "Rocky", "Ashish Sir"));
		list.add(new CampusMind(2, "Nikhil", "Prem Sir"));
		list.add(new CampusMind(3, "Akshatha", "Abhishek Sir"));
		
		return list;
	}
	
	
	
}
