package com.gdg.rocky.orchard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service{
	
	private String database = "jdbc:mysql://localhost:3306/soapwsdlimplinmuleandconsume";
	private String user = "root";
	private String password = "Welcome123";
	
	Connection connection;
	Statement statement;

	@Override
	public List<Leads> getAllLeads() {
		List<Leads> list = new ArrayList<Leads>();
		try{
			System.out.println("Connecting to the database......................");
			connection = DriverManager.getConnection(database, user, password);
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from L2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222333333333332wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwsdsdssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddeads");
			
			while(rs.next())
			{
				Leads lead = new Leads();
				lead.setLeadid(rs.getInt("leadid"));
				lead.setLeadname(rs.getString("leadname"));
				lead.setLeadtrack(rs.getString("leadtrack"));
				
				list.add(lead);
				
			}
			connection.close();
		}
		catch(Exception e)
		{
			
		}
		return list;
	}

	@Override
	public List<Minds> getAllMinds() {
		
		List<Minds> list = new ArrayList<Minds>();
		
		try{
			System.out.println("Connecting to the database......................");
			connection = DriverManager.getConnection(database, user, password);
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from Minds");
			
			while(rs.next())
			{
				Minds mind = new Minds();
				mind.setMindid(rs.getInt("mindid"));
				mind.setMindname(rs.getString("mindname"));
				mind.setTrack(rs.getString("track"));
				
				list.add(mind);
				
			}
			connection.close();
		}
		catch(Exception e)
		{
			
		}
		return list;
		
	}

	@Override
	public List<Track> getAllTrack() {
		
		List<Track> list = new ArrayList<Track>();
		
		try{
			System.out.println("Connecting to the database......................");
			connection = DriverManager.getConnection(database, user, password);
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from Track");
			
			while(rs.next())
			{
				Track track = new Track();
				track.setTrack(rs.getString("track"));
				track.setTrackid(rs.getInt("trackid"));
				
				list.add(track);
				
			}
			connection.close();
		}
		catch(Exception e)
		{
			
		}
		return list;
	}

	@Override
	public Minds getMindById(int id) {
		Minds mind = new Minds();
		
		try{
			System.out.println("Connecting to the database......................");
			connection = DriverManager.getConnection(database, user, password);
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from Minds where mindid=" + id +":");
			
			while(rs.next())
			{
				mind.setMindid(rs.getInt("mindid"));
				mind.setMindname(rs.getString("mindname"));
				mind.setTrack(rs.getString("track"));
				
				
			}
			connection.close();
		}
		catch(Exception e)
		{
			
		}
		return mind;
		
	}

	@Override
	public Leads getLeadsById(int id) {
		
		Leads lead = new Leads();
		
		try{
			System.out.println("Connecting to the database......................");
			connection = DriverManager.getConnection(database, user, password);
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from Leads where leadid=" + id);
			
			while(rs.next())
			{
				lead.setLeadid(rs.getInt("leadid"));
				lead.setLeadname(rs.getString("leadname"));
				lead.setLeadtrack(rs.getString("leadtrack"));
				
			}
			connection.close();
		}
		catch(Exception e)
		{
			
		}
		return lead;
	}

	@Override
	public String quotes() {
		return "Come lets explore the oceans of dreams";
	}
	
	

}
