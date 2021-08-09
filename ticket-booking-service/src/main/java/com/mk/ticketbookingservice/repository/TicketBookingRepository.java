package com.mk.ticketbookingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mk.ticketbookingservice.entity.TicketBookingDetails;

@Repository
public interface TicketBookingRepository extends JpaRepository<TicketBookingDetails, Long> {

}
