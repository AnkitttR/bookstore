package com.luv2code.springboot.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springboot.bookstore.entity.Customer;
import com.luv2code.springboot.bookstore.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	private CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService theCustomerService) {
		customerService = theCustomerService;    // Constructor injection
	}
	
	@GetMapping("/showFormForCustomerSignup")
	public String showFormForCustomerSignup(Model theModel) {
		
		// create model attribute to bind form data
		Customer thecustomer = new Customer();
		
		theModel.addAttribute("customer", thecustomer);
		
		return "customers/customer-signup";		
	}
	
	@GetMapping("/showFormForCustomerLogin")
	public String showFormForCustomerLogin(Model theModel) {
		
		// create model attribute to bind form data
		Customer thecustomer = new Customer();
		
		theModel.addAttribute("customer", thecustomer);
		
		return "customers/customer-login";	
	}
	
	@PostMapping("/save")
	public String saveCustomer(@ModelAttribute("customer") Customer thecustomer) {
		
		// save the employee
		customerService.save(thecustomer);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/books/list";			
	}
	
	
	
}
