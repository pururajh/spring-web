package com.gf.web.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.gf.web.rest.model.Booking;
import com.gf.web.rest.repository.BookRepository;

@EnableMongoRepositories(basePackageClasses = BookRepository.class)
@Configuration
public class MongoConfig {
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Bean
	CommandLineRunner commandLineRunner(BookRepository bookRepository, Booking bookDocument) {
		return string -> {bookRepository.save(bookDocument);};
		/*return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				bookRepository.save(bookDocument);
				
			}
		};*/
		
	}
	
}
