package com.spring.book.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.book.Entity.Book;
import com.spring.book.Repository.BookRepository;


@Service
public class BookService {
	
	@Autowired
	BookRepository repo;
	
	public List<Book> showBooks() {
		List<Book> arr = new ArrayList<>();
		arr = repo.findAll();
		return arr;
	}
	
	public Book addBook(Book obj) {
		return repo.save(obj);
	}
	
	public Book getBookById(int id) {
		return repo.findById(id).get();
	}

	public void delBook(int id) {
		repo.deleteById(id);
	}

	public Book updateBook(int id, Book obj) {
		Book book = repo.findById(id).get();
		
		if(Objects.nonNull(book) && (!(Objects.isNull(obj.getBookName())))) {
			book.setBookName(obj.getBookName());
		}
		if(Objects.nonNull(book) && (!(Objects.isNull(obj.getAuthorName())))) {
			book.setAuthorName(obj.getAuthorName());
		}
		if(Objects.nonNull(book) && (obj.getQuantity() != 0)) {
			book.setQuantity(obj.getQuantity());
		}
		if(Objects.nonNull(book) && (obj.getPrice() != 0.0)) {
			book.setPrice(obj.getPrice());
		}
		return repo.save(book);
	}
}
