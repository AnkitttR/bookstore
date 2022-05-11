package com.luv2code.springboot.bookstore.service;

import java.util.List;

import com.luv2code.springboot.bookstore.entity.Book;

public interface BookService {
	
public List<Book> findAll();
	
	public Book findById(int theId);
	
	public void save(Book theEmployee);
	
	public void deleteById(int theId);

}
