package com.nissan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.Customer;
import com.nissan.repo.ICustomerRepository;

@Service
public class AdminServiceImpl implements IAdminService {
	
	@Autowired
	ICustomerRepository customerRepo;
	
	@Override
	public List<Customer> getAllCustomers() {
		
		return customerRepo.findAll();
	}

	@Override
	public Optional<Customer> getSpecificCustomer(int empId) {
		// TODO Auto-generated method stub
		return customerRepo.findById(empId);
	}

	@Override
	public Optional<Customer> addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		 customerRepo.save(customer);
		 
		 return null;
	}

	@Override
	public Optional<Customer> deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		 customerRepo.deleteById(customerId);
		 return null;
	}

	

}
