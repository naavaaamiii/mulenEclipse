package com.gdg.rocky.orchard;

public class Minds {
	
	private int mindid;
	private String mindname;
	private String track;
	
	public int getMindid() {
		return mindid;
	}
	public void setMindid(int mindid) {
		this.mindid = mindid;
	}
	public String getMindname() {
		return mindname;
	}
	public void setMindname(String mindname) {
		this.mindname = mindname;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public Minds(int mindid, String mindname, String track) {
		super();
		this.mindid = mindid;
		this.mindname = mindname;
		this.track = track;
	}
	public Minds() {
		super();
	}
	
	

}
