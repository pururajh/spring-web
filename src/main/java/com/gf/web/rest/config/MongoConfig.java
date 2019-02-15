package com.gf.web.rest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.gf.web.rest.repository.BookRepository;

@EnableMongoRepositories(basePackageClasses = BookRepository.class)
@Configuration
public class MongoConfig {
	
	//@Bean
	//CommandLineRunner commandLineRunner(BookRepository bookReposito) {
		//return string -> {bookRepository.save(bookDocument);};
		/*return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				bookRepository.save(bookDocument);
				
			}
		};*/
		
	//}
	
}
