package com.crud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.exception.ResourceNotFoundException;
import com.crud.model.Ticket;
import com.crud.repository.TicketRepository;

@RestController
@RequestMapping("/Ticketapi")
public class TicketController {

	@Autowired
	private TicketRepository ticketRepository;

	// creating post mapping that post the Ticket detail in the database
	@PostMapping("/addTicket")
	public Ticket addTicket(@Valid @RequestBody Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	// creating a get mapping that retrieves the detail of a Ticket
	@GetMapping("/Ticket")
	public List<Ticket> findAllTickets() {
		return ticketRepository.findAll();
	}

	// creating a get mapping that retrieves the detail of a TicketById
	@GetMapping("/TicketById/{id}")
	public ResponseEntity<Ticket> findTicketById(@PathVariable int id) throws ResourceNotFoundException {
		Ticket ticket = ticketRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Ticket not found for this id :: " + id));
		return ResponseEntity.ok().body(ticket);
	}

	// creating put mapping that updates the TicketDetails
	@PutMapping("/update/{id}")
	public ResponseEntity<Ticket> updateTicket(@PathVariable(value = "id") int id,
			@Valid @RequestBody Ticket ticketdetails) throws ResourceNotFoundException {
		Ticket ticket = ticketRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Ticket not found for this id :: " + id));

		ticket.setId(ticketdetails.getId());
		ticket.setAmount(ticketdetails.getAmount());
		ticket.setCatagory(ticketdetails.getCatagory());
		final Ticket updateTicket = ticketRepository.save(ticket);
		return ResponseEntity.ok(updateTicket);
	}

	// creating a delete mapping that delete a specified Ticket
	@DeleteMapping("/delete/{id}")
	public Map<String, Boolean> deleteTicket(@PathVariable(value = "id") int id) throws ResourceNotFoundException {
		Ticket ticket = ticketRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Ticket not found for this id :: " + id));

		ticketRepository.delete(ticket);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
