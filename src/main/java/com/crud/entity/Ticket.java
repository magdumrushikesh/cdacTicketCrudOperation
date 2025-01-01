package com.crud.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column(name = "mobileNo", unique = true)
	String mobileNo;

	@Enumerated(EnumType.STRING)
	@Column(name = "category")
	Category category;

	@Column(name = "issue")
	String issue;

	@Column(name = "resolution")
	String resolution;

	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	Status status;

	@Column(name = "createDate")
	LocalDateTime createDate;

	@Column(name = "resolvedDate")
	LocalDateTime resolvedDate;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ticket( int id,String mobileNo, Category category, String issue, String resolution, Status status,
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
