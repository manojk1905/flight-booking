package com.mk.ticketbookingservice.controller;

import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mk.ticketbookingservice.entity.TicketBookingDetails;
import com.mk.ticketbookingservice.service.TicketBookingService;

@RestController
@RequestMapping("/ticket-service")
public class TicketBookingController {

	@Autowired
	private TicketBookingService ticketBookingService;
	
	@PostMapping("/bookTicket")
	public Response bookTicket(@RequestBody TicketBookingDetails ticketBookingDetails) {
		return ticketBookingService.bookFlightTicket(ticketBookingDetails);
	}
	
	@GetMapping("/ticketBookingDetails")
	public Response fetchTicketBookingDetails(@QueryParam("ticketBookingId") String ticketBookingId) {
		return ticketBookingService.fetchFlightTicketDetails(ticketBookingId);
	}
}
