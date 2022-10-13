package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "accountNumber", nullable = false, updatable = false)//needs to be edited
	private int accountNumber;
	
	
	private String customerName;
	private String  accountType;
	private double balance;
	private double minimumBalance=1000;
	@Column(length=10)//needs to be edited
	private long mobNumber;
	private String emailId;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int atmPin;
	
	@JoinColumn(name="admId")		//Customer.admId = Admin.admId
	@ManyToOne
	private Admin admin;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int accountNumber, String customerName, String accountType, double balance, double minimumBalance,
			long mobNumber, String emailId, int atmPin, Admin admin) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountType = accountType;
		this.balance = balance;
		this.minimumBalance = minimumBalance;
		this.mobNumber = mobNumber;
		this.emailId = emailId;
		this.atmPin = atmPin;
		this.admin = admin;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public long getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(long mobNumber) {
		this.mobNumber = mobNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAtmPin() {
		return atmPin;
	}

	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	
	

}
