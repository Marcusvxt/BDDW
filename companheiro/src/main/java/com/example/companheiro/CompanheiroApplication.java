package com.example.companheiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class CompanheiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanheiroApplication.class, args);
	}

}
