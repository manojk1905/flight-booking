package com.mk.ticketbookingservice.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TicketBookingDetails implements Serializable {

	private static final long serialVersionUID = 6940140905469483331L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ticketBookingId;
	private BigDecimal ticketFare;
	private Long flightId;

	public Long getTicketBookingId() {
		return ticketBookingId;
	}

	public BigDecimal getTicketFare() {
		return ticketFare;
	}

	public void setTicketBookingId(Long ticketBookingId) {
		this.ticketBookingId = ticketBookingId;
	}

	public void setTicketFare(BigDecimal ticketFare) {
		this.ticketFare = ticketFare;
	}

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
}
