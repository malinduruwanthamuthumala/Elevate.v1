package com.example.elevateevents.elevate.beans;



import com.example.elevateevents.elevate.valueObjects.Venue;

import jakarta.persistence.Entity;

@Entity
public class Meeting  extends Event{

	public Meeting(Long eventId, String eventName, String eventType, String description, AttendanceDetails attendance,
			FinanceDetails finance, Venue venue) {
		super(eventId, eventName, eventType, description, attendance, finance, venue);
		// TODO Auto-generated constructor stub
	}

	

}
