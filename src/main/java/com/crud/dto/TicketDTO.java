package com.crud.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.crud.entity.Category;
import com.crud.entity.Status;

public class TicketDTO {

	int id;

	String mobileNo;

	Category category;

	String issue;

	String resolution;

	Status status;

	LocalDateTime createDate;

	LocalDateTime resolvedDate;

	public TicketDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketDTO(int id,String mobileNo, Category category, String issue, String resolution, Status status,
			LocalDateTime createDate, LocalDateTime resolvedDate) {
		super();
		this.id= id;
		this.mobileNo = mobileNo;
		this.category = category;
		this.issue = issue;
		this.resolution = resolution;
		this.status = status;
		this.createDate = createDate;
		this.resolvedDate = resolvedDate;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public LocalDateTime getResolvedDate() {
		return resolvedDate;
	}

	public void setResolvedDate(LocalDateTime resolvedDate) {
		this.resolvedDate = resolvedDate;
	}

}
