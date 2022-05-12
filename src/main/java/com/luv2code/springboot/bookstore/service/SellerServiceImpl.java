package com.luv2code.springboot.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springboot.bookstore.dao.SellerRepository;
import com.luv2code.springboot.bookstore.entity.Seller;

@Service
public class SellerServiceImpl implements SellerService {

private SellerRepository sellerRepository;
	
	@Autowired
	public SellerServiceImpl(SellerRepository theSellerRepository) {  // constructor injection
		sellerRepository = theSellerRepository;
	}
	
	
	
	
	@Override
	public void save(Seller theSeller) {
		sellerRepository.save(theSeller);

	}

	
	
}
