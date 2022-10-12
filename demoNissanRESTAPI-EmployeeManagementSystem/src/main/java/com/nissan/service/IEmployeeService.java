package com.nissan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nissan.model.Employee;

public interface IEmployeeService {
	
	//List all employees
	public List<Employee> getAllEmployee();
	
	//search for a particular employee
	public Optional<Employee> getAllEmployee(int empId);
	
	//add an employee
	public Employee addEmployee(Employee emp);
	
	//Delete an Employee
	public Optional<Employee> deleteEmployee(int empId);
}