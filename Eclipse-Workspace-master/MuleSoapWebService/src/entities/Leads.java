package entities;


public class Leads {
	
	private int leadid;
	private String leadname;
	private String track;
	
	public int getLeadid() {
		return leadid;
	}
	public void setLeadid(int leadid) {
		this.leadid = leadid;
	}
	public String getLeadname() {
		return leadname;
	}
	public void setLeadname(String leadname) {
		this.leadname = leadname;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	
	public Leads(int leadid, String leadname, String track) {
		super();
		this.leadid = leadid;
		this.leadname = leadname;
		this.track = track;
	}
	
	public Leads() {
		super();
	}
	
}
