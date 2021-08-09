package com.mk.flightcontrollerservice.model;

import com.mk.flightcontrollerservice.entity.FlightDetails;

public class FlightResponse extends AbstractFlightResponse{

	private FlightDetails flightDetails;

	public FlightDetails getFlightDetails() {
		return flightDetails;
	}
	
	public void setFlightDetails(FlightDetails flightDetails) {
		this.flightDetails = flightDetails;
	}
}
