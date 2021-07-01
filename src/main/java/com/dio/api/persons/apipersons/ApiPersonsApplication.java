package com.dio.api.persons.apipersons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.dio.api.persons.apipersons"})
public class ApiPersonsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPersonsApplication.class, args);
	}

}
