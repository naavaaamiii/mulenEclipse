package com.gdg.rocky.orchard;

public class Track {
	
	private String track;
	private int trackid;
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public int getTrackid() {
		return trackid;
	}
	public void setTrackid(int trackid) {
		this.trackid = trackid;
	}
	public Track(String track, int trackid) {
		super();
		this.track = track;
		this.trackid = trackid;
	}
	public Track() {
		super();
	}
	
	

}
