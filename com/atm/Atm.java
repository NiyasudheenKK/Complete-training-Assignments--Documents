package com.atm;
import java.lang.Math;
import java.util.Random;

public class Atm {
	
	//instance variables

	private int accountNumber;
	private String customerName;
	private String accountType;
	private double balance;
	private double minimumBalance;
	private long mobNumber;
	private String emailId;
	private int atmPin;
	
	//default constructor
	public Atm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Atm(int accountNumber, String customerName, String accountType, double balance, double minimumBalance,
			int mobNumber, String emailId, int atmPin) {
		super();
		
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountType = accountType;
		this.balance = balance;
		this.minimumBalance = minimumBalance;
		this.mobNumber = mobNumber;
		this.emailId = emailId;
		this.atmPin = atmPin;
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
		return balance;//complete balance
		}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		minimumBalance = 1000;
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


	@Override
	public String toString() {
		return "Atm [accountNumber=" + accountNumber + ", customerName="
				+ customerName + ", accountType=" + accountType + ", balance=" + balance + ", minimumBalance="
				+ minimumBalance + ", mobNumber=" + mobNumber + ", emailId=" + emailId + ", atmPin=" + atmPin + "]";
	}

	public static int generateAccountNumber() {
		Random randomCustomerNumber = new Random(System.currentTimeMillis());
		return(100000000+randomCustomerNumber.nextInt(100000000));
	}
	
	public static int generateAtmPin() {
		Random randomAtmPin = new Random(System.currentTimeMillis());
		return(1000+randomAtmPin.nextInt(10000));
	}
	
	
	
}
