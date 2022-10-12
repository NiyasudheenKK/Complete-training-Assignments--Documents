package com.nissan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.Employee;
import com.nissan.repo.IEmployeeRepository;

@Service 
public class EmployeeServicesImp implements IEmployeeService {
	
	@Autowired
	IEmployeeRepository empRepo;
	
	@Override
	public List<Employee> getAllEmployee() {
		return empRepo.findAll();
	}

	@Override
	public Optional<Employee> getAllEmployee(int empId) {
		// TODO Auto-generated method stub
		return empRepo.findById(empId);
	}

	@Override
	public Employee addEmployee(Employee emp) {
		
		return empRepo.save(emp);
	}

	@Override
	public Optional<Employee> deleteEmployee(int empId) {
		empRepo.deleteById(empId);
		System.out.println("Employee details deleted");
		return null;
		}

	

	

}
