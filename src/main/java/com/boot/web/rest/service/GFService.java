package com.boot.web.rest.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gf.web.rest.model.Booking;
import com.gf.web.rest.repository.BookRepository;

@RestController
@RequestMapping("/gadgetfree")
public class GFService {
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("book")
	@RequestMapping(method =  RequestMethod.POST)
	public Booking book(@RequestBody @Valid Booking book) {
		return bookRepository.save(book);
	}
	
	/*@RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    TodoDTO create(@RequestBody @Valid TodoDTO todoEntry) {
        return service.create(todoEntry);
    }
 
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    TodoDTO delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
 
    @RequestMapping(method = RequestMethod.GET)
    List<TodoDTO> findAll() {
        return service.findAll();
    }
 
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    TodoDTO findById(@PathVariable("id") String id) {
        return service.findById(id);
    }
 
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    TodoDTO update(@RequestBody @Valid TodoDTO todoEntry) {
        return service.update(todoEntry);
    }*/

}
