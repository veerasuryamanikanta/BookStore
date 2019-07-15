package com.bookstore.MyBookStore.service;

import java.util.List;

import com.bookstore.MyBookStore.domain.Book;

public interface BookService {
	List<Book> findAll ();
	
	Book findOne(Long id);
	
	List<Book> findByCategory(String category);
	
	List<Book> blurrySearch(String title);
}
