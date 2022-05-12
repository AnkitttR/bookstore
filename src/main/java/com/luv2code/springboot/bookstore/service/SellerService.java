package com.luv2code.springboot.bookstore.service;

import java.util.List;

import com.luv2code.springboot.bookstore.entity.Book;

public interface SellerService {

public List<Seller> findAll();
	
	public Seller findById(int theId);
	
	public void save(Seller theSeller);
	
	public void deleteById(int theId);

}