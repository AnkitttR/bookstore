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
@RequestMapping("/books")
public class BookController {
	
	private BookService bookService;
	
	@Autowired
	public BookController(BookService theBookService) {
		bookService = theBookService;    // Constructor injection
	}						// thebookService ki help se Interface bookService ke saare methods bookService ko assign honge.
	                 
	// add mapping for "/list"
		@GetMapping("/list")
		public String listbooks(Model theModel) {
			
			// get employees from database
			List<Book> thebooks = bookService.findAll();
			
			// add to the spring model
			theModel.addAttribute("books", thebooks);
			
			return "books/list-books";
			
		}
		
		@GetMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel) {
			
			// create model attribute to bind form data
			Book thebook = new Book();
			
			theModel.addAttribute("book", thebook);
			
			return "books/book-form";		
		}
		
		
		
		@GetMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("bookId") int theId, Model theModel) {
			
			// get the book from the service(Interface that has method findById())
			Book thebook = bookService.findById(theId);
			
			// set book as a model attribute to pre-populate the form
			theModel.addAttribute("book", thebook);
			
			// send over to our form
			return "books/book-form";
		}
		
		@PostMapping("/save")
		public String saveEmployee(@ModelAttribute("book") Book thebook) {
			
			// save the employee
			bookService.save(thebook);
			
			// use a redirect to prevent duplicate submissions
			return "redirect:/books/list";			
		}
		
		@GetMapping("/delete")
		public String delete(@RequestParam("bookId") int theId) {
			
			// delete the employee 
			bookService.deleteById(theId);
			
			// redirect to /employee/list
			return "redirect:/books/list";
		}
		
	}
	
	
	
	
	
	

