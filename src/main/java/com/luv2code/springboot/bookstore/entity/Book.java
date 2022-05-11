package com.luv2code.springboot.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	
	// define fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="book_name")
	private String bookName;
	
	
	
	// define constructors
		public Book() {  // No argument constructor required by Hibernate
			
		}
		
		// new constructor having id parameter
		public Book(int id, String bookName) {
			this.id = id;
			this.bookName = bookName;
			
		}
		
		// define getter/setter

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		
		// define toString 
		
		@Override
		public String toString() {
			return "Book [id=" + id + ", bookName=" + bookName + "]";
		}

}
