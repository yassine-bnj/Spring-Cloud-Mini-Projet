package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication

public class UsersMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersMicroservicesApplication.class, args);
	}
	
	 @Bean
	  public BCryptPasswordEncoder passwordEncoder () {
	  return new BCryptPasswordEncoder();
	  }

}
