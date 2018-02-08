package com.gdg.rocky.orchard;

public class Leads {
	
	private int leadid;
	private String leadname;
	private String leadtrack;
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
	public String getLeadtrack() {
		return leadtrack;
	}
	public void setLeadtrack(String leadtrack) {
		this.leadtrack = leadtrack;
	}
	public Leads(int leadid, String leadname, String leadtrack) {
		super();
		this.leadid = leadid;
		this.leadname = leadname;
		this.leadtrack = leadtrack;
	}
	public Leads() {
		super();
	}

}
