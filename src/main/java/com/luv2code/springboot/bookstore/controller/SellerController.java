package com.luv2code.springboot.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springboot.bookstore.service.SellerService;

@Controller
@RequestMapping("/sellers")
public class SellerController {
	
	private SellerService sellerService;
	
	@Autowired
	public SellerController(SellerService theEmployeeService) {
		sellerService = theEmployeeService;    // Constructor injection
	}
	

}
