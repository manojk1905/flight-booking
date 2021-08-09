package com.mk.apigatewayservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceFallbackController {
	
	@RequestMapping("/flightServiceFallback")
	public String flightServiceFallback() {
		return "Currently flight service is unavailable";
	}
	
	@RequestMapping("/ticketServiceFallback")
	public String ticketServiceFallback() {
		return "Currently ticket service is unavailable";
	}

}
