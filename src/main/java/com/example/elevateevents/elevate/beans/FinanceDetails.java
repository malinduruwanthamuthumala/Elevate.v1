package com.example.elevateevents.elevate.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class FinanceDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long financeId;
	
	private double totalexpenses;
	private double revenue;
	
	@OneToOne
	@JoinColumn(name="eventId")
	private Event event;

	public Long getFinanceId() {
		return financeId;
	}

	public double getTotalexpenses() {
		return totalexpenses;
	}

	public double getRevenue() {
		return revenue;
	}

	public Event getEvent() {
		return event;
	}

	public void setFinanceId(Long financeId) {
		this.financeId = financeId;
	}

	public void setTotalexpenses(double totalexpenses) {
		this.totalexpenses = totalexpenses;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public FinanceDetails(Long financeId, double totalexpenses, double revenue, Event event) {
		super();
		this.financeId = financeId;
		this.totalexpenses = totalexpenses;
		this.revenue = revenue;
		this.event = event;
	}
	
	

}
