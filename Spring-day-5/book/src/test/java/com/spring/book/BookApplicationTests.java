package com.spring.book;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.book.Entity.Book;
import com.spring.book.Repository.BookRepository;

@SpringBootTest
class BookApplicationTests {
	
	@Autowired
	BookRepository repo;

	@Test
	void contextLoads() {
		Book book = new Book();
		book.setAuthorName("Mohan");
		book.setBookName("neural Networks");
		book.setPrice(300.75f);
		book.setQuantity(9);
		
		repo.save(book);
	}

}
