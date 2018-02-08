package com.gdg.rocky.orchard;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Service {
	
	@WebMethod
	public List<Leads> getAllLeads();
	@WebMethod
	public List<Minds> getAllMinds();
	@WebMethod
	public List<Track> getAllTrack();
	@WebMethod
	public Minds getMindById(int id);
	@WebMethod
	public Leads getLeadsById(int id);
	@WebMethod
	public String quotes();
	

}
