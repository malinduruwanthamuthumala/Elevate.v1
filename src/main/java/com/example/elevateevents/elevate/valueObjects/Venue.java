package com.example.elevateevents.elevate.valueObjects;

import java.util.Date;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class Venue {
	
	private String hall;
	
	@Embedded
	private Address address;
	
	private Date date;
	
	private String startTime;
	
	private String endingTime;

	public String getHall() {
		return hall;
	}

	public Address getAddress() {
		return address;
	}

	public Date getDate() {
		return date;
	}

	public String getStartTime() {
		return startTime;
	}

	public String getEndingTime() {
		return endingTime;
	}

	public void setHall(String hall) {
		this.hall = hall;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public void setEndingTime(String endingTime) {
		this.endingTime = endingTime;
	}

	public Venue(String hall, Address address, Date date, String startTime, String endingTime) {
		super();
		this.hall = hall;
		this.address = address;
		this.date = date;
		this.startTime = startTime;
		this.endingTime = endingTime;
	}
	
	

}
