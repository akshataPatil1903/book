package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Book;
import com.demo.service.BookService;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class BookController {
	
	@Autowired
	private BookService bs;
	
	@PostMapping("add")
	public void add(@RequestBody Book b) {
		//TODO: process POST request
		 bs.add(b);
	}
	
	@GetMapping("display")
	public List<Book>display(){
		return bs.display();
	}
	
	@DeleteMapping("delete = {id}")
	public void delete(@PathVariable Integer id) {
		bs.delete(id);
	}
	
	@GetMapping("searchById = {id}")
		public Book searchById(@PathVariable Integer id) {
		return bs.searchById(id);	
	}
	
	@GetMapping("searchByName = {name}")
	public Book searchByName(@PathVariable String name) {
		return bs.searchByName(name);
	}
	
	@PutMapping("update = {id}")
	public Book update(@PathVariable Integer id, @RequestBody Book b) {
		//TODO: process PUT request
		
		return bs.update(id , b);
	}
}
