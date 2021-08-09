package com.mk.ticketbookingservice.service;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.mk.ticketbookingservice.entity.TicketBookingDetails;

public interface TicketService {
	
	public Response bookFlightTicket(TicketBookingDetails ticketBookingDetails);

	public Response fetchFlightTicketDetails(String ticketBookingId);

	default Response generateResponse(Object response) {
		return Response.status(Status.OK).entity(response).build();
	}
}
