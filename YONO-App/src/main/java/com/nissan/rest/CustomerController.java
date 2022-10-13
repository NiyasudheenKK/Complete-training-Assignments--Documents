package com.nissan.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Customer;
import com.nissan.service.ICustomerService;

@CrossOrigin
@RestController
@RequestMapping("/customer/api")
public class CustomerController {
	
	@Autowired
	ICustomerService customerService;
	
	//Deposit Money into account
	
	//Withdraw Money from Customer Account
	
	//Show Balance of a Customer
	@GetMapping("/balance/{customerId}")
	public Optional<Customer> getBalance(@PathVariable int customerId) {
		return customerService.getCustomerBalance(customerId);
	}
	
	
	//Transferring Money from One Account to Another account

}
