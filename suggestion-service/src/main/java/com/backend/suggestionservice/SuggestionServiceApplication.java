package com.backend.suggestionservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SuggestionServiceApplication  implements CommandLineRunner{
	
	@Value("${spring.data.mongodb.uri}")
	private String mongoURI;
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());

	public static void main(String[] args) {
		SpringApplication.run(SuggestionServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("<-----------MONGO URI ------------>" + mongoURI);		
	}

}
