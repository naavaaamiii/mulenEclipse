package gdg.rocky.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CampusPojo {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)			// for autonumber
	private int mid;
	@Column
	private String name;
	@Column
	private String track;
	
	public CampusPojo(int mid, String name, String track) {
		super();
		this.mid = mid;
		this.name = name;
		this.track = track;
	}
	
	public CampusPojo()
	{
		
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}
	
	
	
}
