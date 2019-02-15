package com.gf.web.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.gf.web.rest.model.Booking;
import com.gf.web.rest.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository repository;
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void createBooking(Booking book) {
		repository.save(book);
		
	}

	@Override
	public List<Booking> findAllBooking() {
		return repository.findAll();
	}
	

}
