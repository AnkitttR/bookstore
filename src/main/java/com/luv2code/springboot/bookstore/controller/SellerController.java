package com.luv2code.springboot.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springboot.bookstore.entity.Seller;
import com.luv2code.springboot.bookstore.service.SellerService;
import com.luv2code.springboot.thymeleafdemo.entity.Employee;

@Controller
@RequestMapping("/sellers")
public class SellerController {
	
	private SellerService sellerService;
	
	@Autowired
	public SellerController(SellerService theSellerService) {
		sellerService = theSellerService;    // Constructor injection
	}						// theSellerService ki help se Interface SellerService ke saare methods sellerService ko assign honge.
	                 
	// add mapping for "/list"
		@GetMapping("/list")
		public String listSellers(Model theModel) {
			
			// get employees from database
			List<Seller> theSellers = sellerService.findAll();
			
			// add to the spring model
			theModel.addAttribute("sellers", theSellers);
			
			return "sellers/list-sellers";
			
		}
		
		@GetMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel) {
			
			// create model attribute to bind form data
			Seller theSeller = new Seller();
			
			theModel.addAttribute("seller", theSeller);
			
			return "sellers/employee-form";		
		}
		
		@GetMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("sellerId") int theId, Model theModel) {
			
			// get the seller from the service(Interface that has method findById())
			Seller theSeller = sellerService.findById(theId);
			
			// set seller as a model attribute to pre-populate the form
			theModel.addAttribute("seller", theSeller);
			
			// send over to our form
			return "employees/employee-form";
		}
		
		
	}
	
	
	
	
	
	

