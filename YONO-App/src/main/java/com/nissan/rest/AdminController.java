package com.nissan.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Customer;
import com.nissan.service.IAdminService;

@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	IAdminService adminService;
	
	//Adding a New Customer
	@PostMapping("/addcustomer")
	public Optional<Customer> addCustomer(@RequestBody Customer customer) {
		return adminService.addCustomer(customer);
	}
	//Updating Customer Details
	
	//Deleting a Customer
	@GetMapping("/deletecustomer/{customerId}")
	public Optional<Customer> deleteCustomerDetails(@PathVariable int customerId) {
		return adminService.deleteCustomer(customerId);
	}
	
	//Display the list of all Customers in the Bank
	@GetMapping("/allcustomers")
	public List<Customer> getAllCustomerDetails() {
		return adminService.getAllCustomers();
	}
	
	
	//Display Customer Details of a specific Customer
	@GetMapping("/allcustomers/{customerId}")
	public Optional<Customer> getAllCustomerDetails(@PathVariable int customerId) {
		return adminService.getSpecificCustomer(customerId);
	}
	
}
