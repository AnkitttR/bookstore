package com.luv2code.springboot.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.luv2code.springboot.bookstore.dao.BookRepository;
import com.luv2code.springboot.bookstore.entity.Book;

public class SellerServiceImpl implements SellerService {

private BookRepository sellerRepository;
	
	@Autowired
	public SellerServiceImpl(SellerRepository theSellerRepository) {  // constructor injection
		sellerRepository = theSellerRepository;
	}
	
	@Override
	public List<Seller> findAll() {
		
		return sellerRepository.findAll();
	}
	
	@Override
	public Seller findById(int theId) {
		
		Optional<Seller> result = sellerRepository.findById(theId);
		
		Book theSeller = null;
		
		if(result.isPresent()) {
			theSeller = result.get();
		}
		else {
			// we didn't find the seller
			throw new RuntimeException("Did not find seller id " + theId);
		}
		
		return theSeller;
	}
	
	@Override
	public void save(Seller theSeller) {
		sellerRepository.save(theSeller);

	}

	@Override
	public void deleteById(int theId) {
		sellerRepository.deleteById(theId);

	}
	
}
