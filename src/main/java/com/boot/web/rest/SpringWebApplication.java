package com.boot.web.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.gf.web.rest"})
@EntityScan("com.gf.web.rest.controller, com.gf.web.rest.service, com.gf.web.rest.repository")
//@EnableJpaRepositories("com.gf.web.rest.repository")
public class SpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}

}

