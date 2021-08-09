package com.mk.ticketbookingservice.model;

public class FlightDetails{

	private Long flightId;
	private String source;
	private String destination;
	private String departureTimeFromSource;
	private String arrivalTimeToDestination;
	
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureTimeFromSource() {
		return departureTimeFromSource;
	}
	public void setDepartureTimeFromSource(String departureTimeFromSource) {
		this.departureTimeFromSource = departureTimeFromSource;
	}
	public String getArrivalTimeToDestination() {
		return arrivalTimeToDestination;
	}
	public void setArrivalTimeToDestination(String arrivalTimeToDestination) {
		this.arrivalTimeToDestination = arrivalTimeToDestination;
	}

}
