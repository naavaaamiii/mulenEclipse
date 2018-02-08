package com.gdg.rocky.services;

import java.util.List;

import com.gdg.rocky.pojo.OrchardMindPojo;

public interface OrchardMindService {

	public void insert(OrchardMindPojo om);
	public void update(OrchardMindPojo om);
	public void delete(int mid);
	public OrchardMindPojo getStudent(int mid);
	public List<OrchardMindPojo> getAllStudent();
}
