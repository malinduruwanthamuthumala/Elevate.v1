package com.example.elevateevents.elevate.beans;



import java.util.HashSet;
import java.util.Set;

import com.example.elevateevents.elevate.valueObjects.Venue;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Musical extends Event{

	public Musical(Long eventId, String eventName, String eventType, String description, AttendanceDetails attendance,
			FinanceDetails finance, Venue venue) {
		super(eventId, eventName, eventType, description, attendance, finance, venue);
		// TODO Auto-generated constructor stub
	}

	@OneToMany(mappedBy="event")
	private Set<Singer> singerList = new HashSet<>();

	

	public Set<Singer> getSingerList() {
		return singerList;
	}

	public void setSingerList(Set<Singer> singerList) {
		this.singerList = singerList;
	}
	
	

}
