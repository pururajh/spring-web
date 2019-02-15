package com.gf.web.rest.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document ( collection = "booking")
public class Booking {
	
	
	@Field("location")
	private String location;
	@Field("instructorName")
	private String instructorName;
	@Field("activityName")
	private String activityName;
	
	public Booking() {
		
	}
	
	public Booking(String loc, String instName, String actName) {
		this.location = loc;
		this.instructorName = instName;
		this.activityName = actName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	
	
	
	

}
