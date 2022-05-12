package com.luv2code.springboot.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.bookstore.entity.Seller;


public interface SellerRepository extends JpaRepository<Seller, Integer> {

	
	
}
