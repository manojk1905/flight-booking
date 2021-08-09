package com.mk.flightcontrollerservice.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Schedule {

	private String arrivalTime;
	private String dipartureTime;

	public String getDipartureTime() {
		return dipartureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

}
