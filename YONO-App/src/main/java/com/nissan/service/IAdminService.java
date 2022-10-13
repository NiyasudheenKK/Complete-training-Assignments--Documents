package com.nissan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nissan.model.Customer;

@Service
public interface IAdminService {


	public List<Customer> getAllCustomers();

	public Optional<Customer> getSpecificCustomer(int empId);

	public Optional<Customer> addCustomer(Customer customer);

	public Optional<Customer> deleteCustomer(int customerId);

}
