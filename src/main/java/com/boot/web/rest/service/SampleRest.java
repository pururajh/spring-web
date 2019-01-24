package com.boot.web.rest.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/sample")
public class SampleRest {
	
	@GetMapping("hello")
	public String sayHello() {
		return "Say Hello";
	}

}
