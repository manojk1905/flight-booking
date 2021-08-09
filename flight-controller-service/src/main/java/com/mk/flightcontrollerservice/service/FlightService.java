package com.mk.flightcontrollerservice.service;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.mk.flightcontrollerservice.model.AbstractFlightRequest;

public interface FlightService {

	public Response save(AbstractFlightRequest abstractFlightRequest);
	public Response fetch(String flightIds);

	default Response generateResponse(Object flightResponse) {
		return Response.status(Status.OK).entity(flightResponse).build();
	}

}
