package com.example.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UseProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(UseProductApplication.class, args);
	}
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
