package com.demo.service;

import java.util.List;

import com.demo.model.Book;

public interface BookService {

	void add(Book b);

	List<Book> display();

	void delete(Integer id);

	Book searchById(Integer id);

	Book searchByName(String name);

	Book update(Integer id, Book b);

	

	

	

	

}
