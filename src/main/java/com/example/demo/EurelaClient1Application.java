package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EurelaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurelaClient1Application.class, args);
	}
	
	@GetMapping("/greet")
	public String hello() {
		return "hello ji shaiksha";
	}

}

