package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import com.demo.model.Book;
import com.demo.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository br;
	
	@Override
	public void add(Book b) {
		// TODO Auto-generated method stub
		br.save(b);	
	}

	@Override
	public List<Book> display() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		br.deleteById(id);
		
	}

	@Override
	public Book searchById(Integer id) {
		// TODO Auto-generated method stub
		return br.findById(id).get();
	}

	@Override
	public Book searchByName(String name) {
		// TODO Auto-generated method stub
		return br.findByName(name);
	}

	@Override
	public Book update(Integer id, Book b) {
		// TODO Auto-generated method stub
		b.setId(id);
		return br.save(b);
	}

	
	
	

}
