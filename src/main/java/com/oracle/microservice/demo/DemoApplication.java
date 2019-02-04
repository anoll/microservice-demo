package com.oracle.microservice.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Bean
	ApplicationRunner init(AddressRepository repo) {
		Address a = new Address();
		a.setFirstName("Albert");
		a.setLastName("Einstein");
		a.setStreet("Rämistrasse 100");
		a.setStreetNumber(101);

		repo.save(a);
		return null;
	}

}

