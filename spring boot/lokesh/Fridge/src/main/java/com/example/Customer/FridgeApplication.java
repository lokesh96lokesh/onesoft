package com.example.Customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FridgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FridgeApplication.class, args);
	}
	//@Bean
	//RestTemplate resttemplate() {
		//return new RestTemplate();
//	}

}
