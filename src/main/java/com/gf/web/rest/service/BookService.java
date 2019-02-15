package com.gf.web.rest.service;

import java.util.List;

import com.gf.web.rest.model.Booking;

public interface BookService {
	public void createBooking(Booking book);
	
	public List<Booking> findAllBooking();
}


