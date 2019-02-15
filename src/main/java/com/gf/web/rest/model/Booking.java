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
	
	

}
