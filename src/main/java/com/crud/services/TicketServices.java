package com.crud.services;

import java.util.List;

import com.crud.dto.TicketDTO;
import com.crud.entity.Status;

public interface TicketServices {

	public boolean createTicket(TicketDTO dto);
	public boolean updateTicket(int id, TicketDTO dto);
	public List<TicketDTO> getAll();
	public TicketDTO getById(int id);
	public boolean deleteTicket(int id);
	public List<TicketDTO> getOpenTickets();
	

	
	
	
}
