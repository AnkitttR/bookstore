package com.luv2code.springboot.bookstore.service;

import java.util.List;

import com.luv2code.springboot.bookstore.entity.Book;

public interface CustomerService {

public List<Customer> findAll();
	
	public Customer findById(int theId);
	
	public void save(Book theCustomer);
	
	public void deleteById(int theId);

}
