package com.crud.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import com.crud.dto.TicketDTO;
import com.crud.entity.Status;
import com.crud.entity.Ticket;
import com.crud.repo.TicketRepo;

@Service
public class TicketServiceImpl implements TicketServices {

	@Autowired
	TicketRepo repo;
	
	@Override
	public boolean createTicket(TicketDTO dto) {
		
		Ticket ticket = new Ticket();
		BeanUtils.copyProperties(dto, ticket);
		
		LocalDateTime dat=LocalDateTime.now();
		ticket.setCreateDate(dat);
//		ticket.setResolvedDate(dat);
		repo.save(ticket);
		
		return true;
	}

	

	@Override
	public List<TicketDTO> getAll() {
		List<Ticket> allList = repo.findAll();
		
		ArrayList<TicketDTO> list = new ArrayList<TicketDTO>();
		
		for(Ticket t:allList) {
			TicketDTO dto= new TicketDTO();
			BeanUtils.copyProperties(t, dto);
			list.add(dto);
		}
		return list;
	}

	@Override
	public TicketDTO getById(int id) {
		Ticket t = repo.findById(id).get();
		
		TicketDTO dto =new TicketDTO();
		BeanUtils.copyProperties(t, dto);
		
	
		return dto;
	}

	@Override
	public boolean updateTicket(int id, TicketDTO dto) {
		LocalDateTime rDateTime = LocalDateTime.now();
//		 String status = dto.getStatus().toString(); // Ensure it matches the database ENUM
//		 System.out.println(status);
		repo.update(dto.getStatus(), dto.getResolution(), rDateTime, id);
		return true;
	}



	@Override
	public boolean deleteTicket(int id) {
		repo.deleteById(id);
		return true;
	}



	@Override
	public List<TicketDTO> getOpenTickets() {
		
		List<Ticket> allList = repo.findByStatus(Status.OPEN);
		
		ArrayList<TicketDTO> list = new ArrayList<TicketDTO>();
		
		for(Ticket t:allList) {
			TicketDTO dto= new TicketDTO();
			BeanUtils.copyProperties(t, dto);
			list.add(dto);
		}
		return list;
	}


}
