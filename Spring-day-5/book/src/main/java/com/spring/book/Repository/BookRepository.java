package com.spring.book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.book.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
