package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Ticket;
import com.crud.service.TicketService;

@RestController
public class TicketController {

	// autowired the TicketService class
	@Autowired
	private TicketService ticketService;

	// creating post mapping that post the Ticket detail in the database
	@PostMapping("/addTicket")
	public Ticket addTicket(@RequestBody Ticket ticket) {
		return ticketService.saveTicket(ticket);
	}

	// creating post mapping that post multiple the Ticket detail in the database
	@PostMapping("/addTickets")
	public List<Ticket> addTickets(@RequestBody List<Ticket> tickets) {
		return ticketService.saveTickets(tickets);
	}

	// creating a get mapping that retrieves the detail of a Ticket
	@GetMapping("/Ticket")
	public List<Ticket> findAllTickets() {
		return ticketService.getTicket();
	}

	// creating a get mapping that retrieves the detail of a TicketById
	@GetMapping("/TicketById/{id}")
	public Ticket findTicketById(@PathVariable int id) {
		return ticketService.getTicketById(id);
	}

	// creating put mapping that updates the TicketDetails detail
	@PutMapping("/update")
	public Ticket updateTicket(@RequestBody Ticket ticket) {
		return ticketService.updateTicket(ticket);
	}

	// creating a delete mapping that deletes a specified Ticket
	@DeleteMapping("/delete/{id}")
	public String deleteTicket(@PathVariable int id) {
		return ticketService.deleteTicket(id);
	}
}
