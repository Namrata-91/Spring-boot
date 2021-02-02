package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
