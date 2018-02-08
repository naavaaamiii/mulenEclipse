package entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class CampusMind {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String track;
	
	
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public CampusMind(int id, String name, String leadname) {
		super();
		this.id = id;
		this.name = name;
		this.track = track;
	}
	public CampusMind() {
		super();
	}
	
	

}
