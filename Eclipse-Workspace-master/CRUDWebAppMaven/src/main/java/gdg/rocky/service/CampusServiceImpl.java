package gdg.rocky.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gdg.rocky.dao.CampusDao;
import gdg.rocky.pojo.CampusPojo;

@Service
public class CampusServiceImpl implements CampusService {

	@Autowired
	private CampusDao campusDao;
	
	@Transactional
	public void add(CampusPojo campus) {
		// TODO Auto-generated method stub
		campusDao.add(campus);
		
	}

	@Transactional
	public void edit(CampusPojo campus) {
		// TODO Auto-generated method stub
		campusDao.edit(campus);
		
	}

	@Transactional
	public void delete(int campusMid) {
		// TODO Auto-generated method stub
		campusDao.delete(campusMid);
		
	}

	@Transactional
	public CampusPojo getCampus(int campusMid) {
		return campusDao.getCampus(campusMid);
	}

	@Transactional
	public List getAllCampus() {
		return campusDao.getAllCampus();
	}
	
	

}
