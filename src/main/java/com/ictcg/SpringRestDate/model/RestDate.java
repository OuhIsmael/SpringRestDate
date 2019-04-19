package com.ictcg.SpringRestDate.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RestDate implements Serializable {
//TODO investigate about Project Lombok(lombok) you can remove hashCode, equals and all setters and getters and contst in this class with 4 annotations
	//After reading about it implement them here
	private static final long serialVersionUID = -9011561419084189907L;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate date;
	@JsonFormat(pattern="HH:mm")
	private LocalTime time;
	
	public RestDate() {
		
	}
	
	public RestDate(LocalDate date, LocalTime time) {
		super();
		this.date = date;
		this.time = time;
	}
	
	public LocalDate getDate() {
		return this.date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public LocalTime getTime() {
		return this.time;
	}
	
	public void setTime(LocalTime time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RestDate other = (RestDate) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

}
