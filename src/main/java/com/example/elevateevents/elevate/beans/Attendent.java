package com.example.elevateevents.elevate.beans;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Attendent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long attendentId;
	
	private String name;
	private String NIC;
	private String age;
	
	@ManyToOne
	@JoinColumn(name="attendanceDetailsID")
	private AttendanceDetails attendentContainer;

	public Attendent(Long attendentId, String name, String nIC, String age, AttendanceDetails attendentContainer) {
		super();
		this.attendentId = attendentId;
		this.name = name;
		NIC = nIC;
		this.age = age;
		this.attendentContainer = attendentContainer;
	}

	public Long getAttendentId() {
		return attendentId;
	}

	public String getName() {
		return name;
	}

	public String getNIC() {
		return NIC;
	}

	public String getAge() {
		return age;
	}

	public AttendanceDetails getAttendentContainer() {
		return attendentContainer;
	}

	public void setAttendentId(Long attendentId) {
		this.attendentId = attendentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNIC(String nIC) {
		NIC = nIC;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setAttendentContainer(AttendanceDetails attendentContainer) {
		this.attendentContainer = attendentContainer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(NIC, age, attendentId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;}
		if (obj == null) {
			return false;}
		if (getClass() != obj.getClass()) {
			return false;
		}
		if(obj instanceof Attendent) {
			Attendent attendee = (Attendent)obj;
			if(attendee.NIC.equals(this.NIC)) {
				return true;
			}
		}
		return false;
	}

	
	
	

}
