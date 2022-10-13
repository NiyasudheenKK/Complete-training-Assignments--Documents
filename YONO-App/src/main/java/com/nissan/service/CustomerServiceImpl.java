package com.nissan.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.Customer;
import com.nissan.repo.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	ICustomerRepository customerRepo;
	
	@Override
	public Optional<Customer> getCustomerBalance(int customerId) {
		// TODO Auto-generated method stub
		return customerRepo.findById(customerId);
	}

}
