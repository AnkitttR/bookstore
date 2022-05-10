package com.luv2code.springboot.bookstore.service;

import java.util.List;

import com.luv2code.springboot.bookstore.entity.Customer;

public interface CustomerService {

public List<Customer> findAll();
	
	public Customer findById(int theId);
	
	public void save(Customer theEmployee);
	
	public void deleteById(int theId);
}
