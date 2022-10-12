package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tblEmployee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	
	
	private String empName;
	private String empDesignation;
	private LocalDate dateOfJoining;
	private double salary;
	private int mobNumber;
	
	@JoinColumn(name ="deptId")
	@ManyToOne
	private Department dept;
	
	//default constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//parameterized constructor
	public Employee(int empId, String empName, String empDesignation, LocalDate dateOfJoining, double salary,int mobNumber,
			Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.dept = dept;
		this.mobNumber=mobNumber;
	}
	
	//getters and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	
	public int getMobNumber() {
		return mobNumber;
	}


	public void setMobNumber(int mobNumber) {
		this.mobNumber = mobNumber;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@JsonIgnore
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesignation=" + empDesignation
				+ ", dateOfJoining=" + dateOfJoining + ", salary=" + salary + ", mobNumber=" + mobNumber + ", dept="
				+ dept + "]";
	}

	
	

}
