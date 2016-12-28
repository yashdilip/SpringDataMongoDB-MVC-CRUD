package com.mongodb.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.mongodb.crud.repositories")
public class SprigDataMongoDbcrudApplication{

	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SprigDataMongoDbcrudApplication.class);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(SprigDataMongoDbcrudApplication.class, args);
	}
}
