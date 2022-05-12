package com.luv2code.springboot.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springboot.bookstore.entity.Book;
import com.luv2code.springboot.bookstore.service.BookService;

@Controller
@RequestMapping("/sellers")
public class SellerController {

	private SellerService sellerService;
	
	@Autowired
	public SellerController(SellerService theSellerService) {
		sellerService = theSellerService;    // Constructor injection
	}
	
	@GetMapping("/showFormForSellerSignup")
	public String showFormForSellerSignup(Model theModel) {
		
		// create model attribute to bind form data
		Seller theseller = new Seller();
		
		theModel.addAttribute("seller", theseller);
		
		return "sellers/seller-signup";		
	}
	
	@GetMapping("/showFormForSellerLogin")
	public String showFormForSellerLogin(Model theModel) {
		
		// create model attribute to bind form data
		Seller theseller = new Seller();
		
		theModel.addAttribute("seller", theseller);
		
		return "sellers/seller-login";		
	}
}
