package com.fastcode.sampleapplication3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.fastcode.sampleapplication3"})
public class Sampleapplication3Application {

	public static void main(String[] args) {
		SpringApplication.run(Sampleapplication3Application.class, args);
	}

}

