package gdg.rocky.service;

import java.util.List;

import gdg.rocky.pojo.CampusPojo;

public interface CampusService {
	
	public void add(CampusPojo campus);
	public void edit(CampusPojo campus);
	public void delete(int campusMid);
	public CampusPojo getCampus(int campusMid);
	public List getAllCampus();

}
