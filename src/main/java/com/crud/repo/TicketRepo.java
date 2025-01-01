package com.crud.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.crud.entity.Status;
import com.crud.entity.Ticket;

import jakarta.transaction.Transactional;


@Repository
public interface TicketRepo extends JpaRepository<Ticket, Integer> {
	@Modifying
	@Transactional
	@Query("UPDATE Ticket t SET t.status = :status, t.resolution = :rdetails, t.resolvedDate = :resolvedDate WHERE t.id = :id")
//	public boolean update(@Param("status")String status,@Param("rdetails")String rdetails,@Param("id")int id);

	public int update(@Param("status") Status status, @Param("rdetails") String resolution, @Param("resolvedDate") LocalDateTime resolvedDate, @Param("id") int id);

	@Query("SELECT t FROM Ticket t WHERE t.status = :status")
	public List<Ticket> findByStatus(@Param("status") Status status);
}
