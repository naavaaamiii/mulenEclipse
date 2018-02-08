package gdg.rocky.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gdg.rocky.pojo.CampusPojo;

@Repository
public class CampusDaoImpl implements CampusDao{

	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(CampusPojo campus) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(campus);
		
	}

	@Override
	public void edit(CampusPojo campus) {
		// TODO Auto-generated method stub
		session.getCurrentSession().update(campus);
		
	}

	@Override
	public void delete(int campusMid) {
		// TODO Auto-generated method stub
		session.getCurrentSession().delete(getCampus(campusMid));
		
	}

	@Override
	public CampusPojo getCampus(int campusMid) {
		// TODO Auto-generated method stub
		return (CampusPojo) session.getCurrentSession().get(CampusPojo.class, campusMid);
	}

	@Override
	public List getAllCampus() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from CampusPojo").list();
	}
	
	

}
