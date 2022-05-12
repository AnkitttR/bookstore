package com.luv2code.springboot.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springboot.bookstore.dao.CustomerRepository;
import com.luv2code.springboot.bookstore.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository theCustomerRepository) {  // constructor injection
		customerRepository = theCustomerRepository;
	}
	
	
	
	
	@Override
	public void save(Customer theCustomer) {
		customerRepository.save(theCustomer);

	}

	
		
}
