package com.gdg.rocky.serviceImplementation;

import java.util.List;

import com.gdg.rocky.OrchardDAO.OrchardMindDAOInterface;
import com.gdg.rocky.pojo.OrchardMindPojo;
import com.gdg.rocky.services.OrchardMindService;

public class OrchardMindServiceImplementation implements OrchardMindService{
	
	private OrchardMindDAOInterface minds;

	@Override
	public void insert(OrchardMindPojo om) {
		// TODO Auto-generated method stub
		minds.insert(om);
		
	}

	@Override
	public void update(OrchardMindPojo om) {
		// TODO Auto-generated method stub
		minds.update(om);
		
	}

	@Override
	public void delete(int mid) {
		// TODO Auto-generated method stub
		minds.delete(mid);
		
	}

	@Override
	public OrchardMindPojo getStudent(int mid) {
		// TODO Auto-generated method stub
		return minds.getStudent(mid);
	}

	@Override
	public List<OrchardMindPojo> getAllStudent() {
		// TODO Auto-generated method stub
		return minds.getAllStudent();
	}
	
	

}
