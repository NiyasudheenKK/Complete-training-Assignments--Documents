package com.nissan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Admin")
public class Admin {
	
	@Id
	@Column(nullable = false, unique = true)
	private int admId;
	@Column(nullable = false)
	private String adminName;
	
	@JsonIgnore	
	@OneToMany(mappedBy="admin", cascade = CascadeType.ALL)
	private List<Customer> customers;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int admId, String adminName, List<Customer> customers) {
		super();
		this.admId = admId;
		this.adminName = adminName;
		this.customers = customers;
	}

	public int getAdmId() {
		return admId;
	}

	public void setAdmId(int admId) {
		this.admId = admId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	

}
