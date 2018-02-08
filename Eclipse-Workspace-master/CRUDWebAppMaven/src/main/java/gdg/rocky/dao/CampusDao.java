package gdg.rocky.dao;

import java.util.List;

import gdg.rocky.pojo.CampusPojo;

public interface CampusDao {
	
	public void add(CampusPojo campus);
	public void edit(CampusPojo campus);
	public void delete(int campusMid);
	public CampusPojo getCampus(int campusMid);
	public List getAllCampus();
	

}
