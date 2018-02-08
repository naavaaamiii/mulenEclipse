package com.gdg.rocky.DaoImplement;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gdg.rocky.OrchardDAO.OrchardMindDAOInterface;
import com.gdg.rocky.pojo.OrchardMindPojo;

@Repository
public class OrchardMindDaoImplement implements OrchardMindDAOInterface {
	
	@Autowired
	private SessionFactory session;

	@Override
	public void insert(OrchardMindPojo om) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(om);
		
	}

	@Override
	public void update(OrchardMindPojo om) {
		// TODO Auto-generated method stub
		session.getCurrentSession().update(om);
		
	}

	@Override
	public void delete(int mid) {
		// TODO Auto-generated method stub
		session.getCurrentSession().delete(getStudent(mid));
		
	}

	@Override
	public OrchardMindPojo getStudent(int mid) {
		// TODO Auto-generated method stub
		return (OrchardMindPojo)session.getCurrentSession().get(OrchardMindPojo.class, mid);
	}

	@Override
	public List<OrchardMindPojo> getAllStudent() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from CampusMinds").list();
	}
	
	
}
