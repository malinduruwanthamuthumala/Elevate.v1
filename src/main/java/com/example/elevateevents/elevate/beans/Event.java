package com.example.elevateevents.elevate.beans;





import com.example.elevateevents.elevate.valueObjects.Venue;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Event  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long eventId;
	
	
	private  String eventName;
	private String eventType;
	private String description;

	
	@OneToOne
	private AttendanceDetails attendance;
	
	@OneToOne
	private FinanceDetails finance;
	
	@Embedded
	private Venue venue;

	public Long getEventId() {
		return eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public String getEventType() {
		return eventType;
	}

	public String getDescription() {
		return description;
	}




	public AttendanceDetails getAttendance() {
		return attendance;
	}

	public FinanceDetails getFinance() {
		return finance;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	public void setAttendance(AttendanceDetails attendance) {
		this.attendance = attendance;
	}

	public void setFinance(FinanceDetails finance) {
		this.finance = finance;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public Event(Long eventId, String eventName, String eventType, String description, AttendanceDetails attendance,
			FinanceDetails finance, Venue venue) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventType = eventType;
		this.description = description;
		this.attendance = attendance;
		this.finance = finance;
		this.venue = venue;
	}
	
	
	
}