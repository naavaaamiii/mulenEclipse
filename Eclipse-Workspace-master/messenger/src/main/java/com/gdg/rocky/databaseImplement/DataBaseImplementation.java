package com.gdg.rocky.databaseImplement;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gdg.rocky.pojo.OrchardProgramPojo;
import com.gdg.rocky.pojo.OrchardProgramPojo;

public class DataBaseImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DataBaseImplementation().getInformationOrchard();
	//	new DataBaseImplementation().insertInformationOrhard();
	}
	
public static void insertInformationOrhard() {
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();	
		Transaction tr  = session.beginTransaction();

		 OrchardProgramPojo c1 = new OrchardProgramPojo();
		
		
		
		System.out.println("Data Inserted");
		tr.commit();
		session.close();
		sf.close();
		// TODO Auto-generated method stub
		
	}

public static void getInformationOrchard() {
	// TODO Auto-generated method stub
	
	Configuration con = new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory sf = con.buildSessionFactory();
	Session session = sf.openSession();
	session.beginTransaction();
	
	
/*	OrchardProgramPojo o1 = (OrchardProgramPojo) session.get(OrchardProgramPojo.class, 2);
	System.out.println("Track ID is  " + o1.getTid());
	System.out.println("Track name is " + o1.getTrack());		
	System.out.println("Data inserted");*/
	
	
	Query query = session.createQuery("from CampusMindsPojo");
	List<OrchardProgramPojo> results =  query.getResultList();
	
	System.out.println("Information in CampusMindPojo is ");
	System.out.println(" ");
	for(OrchardProgramPojo camp : results)
	{
		System.out.println("mid is " + camp.getTid() + " campusmind name is " + 
				camp.getTrack());
	}
	


}
}
