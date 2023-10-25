package com.bookManageSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookManageSystem.entity.Book_entity;
import com.bookManageSystem.repository.Book_repository;
import com.bookManageSystem.service.Book_service;

@Service
public class Book_serviceImpl implements Book_service {

	@Autowired
	private Book_repository bookRepo;

	@Override
	public Book_entity createBook(Book_entity book_entity) {
		return bookRepo.save(book_entity);
	}

	@Override
	public List<Book_entity> getAllBook() {
		return bookRepo.findAll();
	}

	@Override
	public Book_entity getBookById(int id) {
		Book_entity bookEnt = bookRepo.findById(id).get();
		return bookEnt;
	}

	@Override
	public String deletebyid(int id) {
		bookRepo.deleteById(id);
		return "deleted successfully id no.:- " + id;
	}

	@Override
	public Book_entity updatebyid(int id, Book_entity book_entity) {

		Book_entity bookEnt2 = bookRepo.findById(id).get();
		bookEnt2.setB_name(book_entity.getB_name());
		bookEnt2.setB_author(book_entity.getB_author());
		bookEnt2.setB_price(book_entity.getB_price());
		bookEnt2.setB_published_date(book_entity.getB_published_date());

		Book_entity bookEnt3 = bookRepo.save(bookEnt2);

		return bookEnt3;
	}

}
