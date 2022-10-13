package com.nissan.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nissan.model.Customer;

@Service
public interface ICustomerService {

	Optional<Customer> getCustomerBalance(int customerId);

}
