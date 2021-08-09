package com.mk.flightcontrollerservice.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.mk.flightcontrollerservice.model.AbstractFlightRequest;
import com.mk.flightcontrollerservice.model.FlightRequest;
import com.mk.flightcontrollerservice.model.FlightResponse;
import com.mk.flightcontrollerservice.repository.FlightRepository;

@Service
public class FlightDetailsService implements FlightService{
	
	@Autowired
	private FlightRepository flightRepository;

	public Response save(AbstractFlightRequest abstractFlightRequest) {
		FlightResponse flightResponse = new FlightResponse();
		flightResponse.setFlightDetails(flightRepository.save(((FlightRequest)abstractFlightRequest).getFlightDetails()));
		return generateResponse(flightResponse);
	}

	public Response fetch(String flightIds) {
		if(StringUtils.hasLength(flightIds)) {
			String[] flightIdList = flightIds.split(",");
			List<Object> flightDetailslist = new ArrayList<>();
			for(String flightId : flightIdList) {
				flightDetailslist.add(flightRepository.findById(Long.valueOf(flightId)));
			}
			return generateResponse(flightDetailslist);
		}
		return generateResponse("Inavlid flghtIds :: "+flightIds);
	}
}
