package com.luv2code.springboot.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springboot.bookstore.dao.BookRepository;
import com.luv2code.springboot.bookstore.entity.Book;

@Service
public class BookServiceImpl implements BookService {
	
	private BookRepository bookRepository;
	
	@Autowired
	public BookServiceImpl(BookRepository theBookRepository) {  // constructor injection
		bookRepository = theBookRepository;
	}

	@Override
	public List<Book> findAll() {
		
		return bookRepository.findAll();
	}

	@Override
	public Book findById(int theId) {
		
		Optional<Book> result = bookRepository.findById(theId);
		
		Book theBook = null;
		
		if(result.isPresent()) {
			theBook = result.get();
		}
		else {
			// we didn't find the book
			throw new RuntimeException("Did not find employee id " + theId);
		}
		
		return theBook;
	}

	@Override
	public void save(Book theEmployee) {
		bookRepository.save(theEmployee);

	}

	@Override
	public void deleteById(int theId) {
		bookRepository.deleteById(theId);

	}

}
