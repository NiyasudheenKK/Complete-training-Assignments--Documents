package com.nissan.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Employee;
import com.nissan.service.IEmployeeService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeService;
	
	//Get all employee details
	@GetMapping("employees")
	public List<Employee> getEmpDetails() {
		return employeeService.getAllEmployee();
	}
	
	//Search an Employee
	@GetMapping("/employee/{empId}")
	public Optional<Employee> getEmployee(@PathVariable int empId){
		return employeeService.getAllEmployee(empId);
	}
	
	//Add employee
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee emp){
		return employeeService.addEmployee(emp);
	}
	
	//Delete employee
	@PutMapping("/employee/{empId}")
	public Optional<Employee> deleteEmployee(@PathVariable int empId){
		return employeeService.deleteEmployee(empId);
	}
}
