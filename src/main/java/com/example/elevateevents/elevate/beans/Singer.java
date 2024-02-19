package com.example.elevateevents.elevate.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Singer {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long singerId;
	
	@ManyToOne
	@JoinColumn(name="eventId")
	private Event event;
	
	private String name;
	private String age;
	private String style;
	public Long getSingerId() {
		return singerId;
	}
	public Event getEvent() {
		return event;
	}
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String getStyle() {
		return style;
	}
	public void setSingerId(Long singerId) {
		this.singerId = singerId;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public Singer(Long singerId, Event event, String name, String age, String style) {
		super();
		this.singerId = singerId;
		this.event = event;
		this.name = name;
		this.age = age;
		this.style = style;
	}
	
	
	

}
