package com.mk.flightcontrollerservice.endpoint;

import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mk.flightcontrollerservice.model.FlightRequest;
import com.mk.flightcontrollerservice.service.FlightDetailsService;

@RestController
@RequestMapping("/flight-service")
public class FlightController {
	
	@Autowired
	private FlightDetailsService flightDetailsService;
	
	@PostMapping("/saveFlightDetails")
	public Response saveFilghtDetails(@RequestBody FlightRequest flightRequest) {
		return flightDetailsService.save(flightRequest);
	}
	
	@GetMapping("/getFlightDetails")
	public Response saveFilghtDetails(@QueryParam("flightIds") String flightIds) {
		return flightDetailsService.fetch(flightIds);
	}
}
