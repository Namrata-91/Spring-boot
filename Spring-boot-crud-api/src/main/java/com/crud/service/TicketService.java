package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Ticket;
import com.crud.repository.TicketRepository;
@Service
public class TicketService {

	@Autowired
	private TicketRepository ticketRepository;
	
	//saving a specific record by using the method save() of JpaRepository
	public Ticket saveTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	//saving a specific record by using the method saveAll() of JpaRepository
	public List<Ticket> saveTickets(List<Ticket> tickets) {
		return ticketRepository.saveAll(tickets);
	}
	
	//getting a specific record by using the method findById() of JpaRepository  
	public Ticket getTicketById(int id) {
		return ticketRepository.findById(id).orElse(null);
	}

	//getting all Ticket record by using the method findaAll() of JpaRepository 
	public List<Ticket> getTicket() {
		return ticketRepository.findAll();
	}

	//updating a record  
	public Ticket updateTicket(Ticket ticket) {
		Ticket ExistingTicket=ticketRepository.findById(ticket.getId()).orElse(null);
		ExistingTicket.setAmount(ticket.getAmount());
		ExistingTicket.setCatagory(ticket.getCatagory());
		return ticketRepository.save(ExistingTicket);
	}

	//deleting a specific record by using the method deleteById() of JpaRepository
	public String deleteTicket(int id) {
		ticketRepository.deleteById(id);
        return "Ticket removed !! " + id;
	}

	
	
}
