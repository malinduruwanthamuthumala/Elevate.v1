package com.example.elevateevents.elevate.valueObjects;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

	private String name;
	private String lane;
	private String city;
	private String country;
	private String mapLocation;
	public String getName() {
		return name;
	}
	public String getLane() {
		return lane;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public String getMapLocation() {
		return mapLocation;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLane(String lane) {
		this.lane = lane;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setMapLocation(String mapLocation) {
		this.mapLocation = mapLocation;
	}
	public Address(String name, String lane, String city, String country, String mapLocation) {
		super();
		this.name = name;
		this.lane = lane;
		this.city = city;
		this.country = country;
		this.mapLocation = mapLocation;
	}
	
	
}
