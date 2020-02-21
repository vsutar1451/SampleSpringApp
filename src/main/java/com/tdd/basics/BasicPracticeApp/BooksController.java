package com.tdd.basics.BasicPracticeApp;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		//Returns all the books
	
		return Arrays.asList(new Book(1L, "Jugaad V6","Dheeraj Agarwal"));
	}
	
}
