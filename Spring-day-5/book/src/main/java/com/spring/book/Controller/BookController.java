package com.spring.book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.book.Entity.Book;
import com.spring.book.Service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookServ;
	
	@GetMapping("/show")
	public List<Book> getBooks() {
		return bookServ.showBooks();
	}
	
	@GetMapping("/get/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return bookServ.getBookById(id);
	}
	
	@PutMapping("/update/{id}")
	public Book updateBook(@PathVariable("id") int id, @RequestBody Book obj) {
		return bookServ.updateBook(id, obj);
	}	
	
	@PostMapping("/add")
	public boolean addBook(@RequestBody Book obj) {
		bookServ.addBook(obj);
		return true;
	}
	
	@DeleteMapping("/del/{id}")
	public boolean delBook(@PathVariable("id") int id) {
		bookServ.delBook(id);
		return true;
	}
}
