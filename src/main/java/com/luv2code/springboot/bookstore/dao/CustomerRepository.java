package com.luv2code.springboot.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.bookstore.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	
	
}
