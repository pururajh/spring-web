package com.gf.web.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gf.web.rest.model.Booking;
import com.gf.web.rest.service.BookService;

@RestController
@RequestMapping("/gadgetfree")
public class GFController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("book")
	public void book(@RequestBody @Valid Booking book) {
		/*Gson gson = new Gson();
		NameList nameList = gson.fromJson(data, NameList.class);*/
		bookService.createBooking(book);
	}
	
	@GetMapping("getBooking")
    public List<Booking> findAll() {
        return bookService.findAllBooking();
    }
	
	@GetMapping("hello")
	public String hello() {
		return "Hello ms";
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
