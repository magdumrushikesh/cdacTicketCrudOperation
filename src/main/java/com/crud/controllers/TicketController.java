package com.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.dto.TicketDTO;
import com.crud.entity.Category;
import com.crud.entity.Status;
import com.crud.services.TicketServices;

@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	TicketServices service;
	
	@PostMapping("/addticket")
	public boolean addTicket(@RequestBody TicketDTO dto) {
		return  service.createTicket(dto);
	}
	
	@PutMapping("/update/{id}")
	public boolean updateTicket(@PathVariable("id") int id ,@RequestBody TicketDTO dto ) {
		return service.updateTicket(id,dto);
	}
	

	
	@GetMapping("/getall")
	public List<TicketDTO> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/getid/{id}")
	public TicketDTO getById(@PathVariable("id") int id){
		return service.getById(id);
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public boolean deleteById(@PathVariable("id")int id) {
		return service.deleteTicket(id);
	}
	
	@GetMapping("/getopen")
	public List<TicketDTO> getOpenTickets(){
		return service.getOpenTickets();
	}
}
