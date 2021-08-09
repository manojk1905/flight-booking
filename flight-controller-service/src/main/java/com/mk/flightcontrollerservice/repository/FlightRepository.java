package com.mk.flightcontrollerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mk.flightcontrollerservice.entity.FlightDetails;

@org.springframework.stereotype.Repository
public interface FlightRepository extends JpaRepository<FlightDetails, Long>{

}
