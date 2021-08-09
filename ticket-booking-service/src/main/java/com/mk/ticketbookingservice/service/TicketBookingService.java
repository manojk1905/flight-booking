package com.mk.ticketbookingservice.service;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.ticketbookingservice.entity.TicketBookingDetails;
import com.mk.ticketbookingservice.repository.TicketBookingRepository;

@Service
public class TicketBookingService implements TicketService {

	@Autowired
	private TicketBookingRepository ticketBookingRepository;

	@Override
	public Response bookFlightTicket(TicketBookingDetails ticketBookingDetails) {
		ticketBookingRepository.save(ticketBookingDetails);
		return generateResponse(ticketBookingDetails);
	}

	@Override
	public Response fetchFlightTicketDetails(String ticketBookingId) {
		return generateResponse(ticketBookingRepository.findById(Long.valueOf(ticketBookingId)));
	}

}
