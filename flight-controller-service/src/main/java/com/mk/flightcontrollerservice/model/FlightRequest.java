package com.mk.flightcontrollerservice.model;

import com.mk.flightcontrollerservice.entity.FlightDetails;

public class FlightRequest extends AbstractFlightRequest {

	private FlightDetails flightDetails;

	public FlightDetails getFlightDetails() {
		return flightDetails;
	}

	public void setFlightDetails(FlightDetails flightDetails) {
		this.flightDetails = flightDetails;
	}

}
