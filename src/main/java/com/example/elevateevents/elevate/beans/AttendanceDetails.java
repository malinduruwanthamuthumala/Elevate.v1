package com.example.elevateevents.elevate.beans;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class AttendanceDetails {
	
	@Id
	@GeneratedValue
	private Long attendanceDetailsID;
	
	@OneToOne
	@JoinColumn(name="eventId")
	private Event event;
	
	@OneToMany(mappedBy="attendentContainer")
	private Set<Attendent> attendentList = new HashSet<>();

	public AttendanceDetails(Long attendanceDetailsID, Event event, Set<Attendent> attendentList) {
		super();
		this.attendanceDetailsID = attendanceDetailsID;
		this.event = event;
		this.attendentList = attendentList;
	}

	public Long getAttendanceDetailsID() {
		return attendanceDetailsID;
	}

	public Event getEvent() {
		return event;
	}

	public Set<Attendent> getAttendentList() {
		return attendentList;
	}

	public void setAttendanceDetailsID(Long attendanceDetailsID) {
		this.attendanceDetailsID = attendanceDetailsID;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public void setAttendentList(Set<Attendent> attendentList) {
		this.attendentList = attendentList;
	}
	
	
	
}
