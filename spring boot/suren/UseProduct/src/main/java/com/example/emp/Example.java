package com.example.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Example {
	@Autowired
	RestTemplate restTemplate;
	@GetMapping(value="/showtax")
	public List<Api3Entity> getinfo() {
		String url1="http://localhost:8080/shows";
		String url2="http://loclahost:8080/display";
		ResponseEntity<List<Api3Entity>> response1=restTemplate.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<Api3Entity>>(){}); {
		List<Api3Entity>products=response1.getBody();
		products.forEach((x)->{
			int hsn=x.getHsn();
			ResponseEntity<Integer> response2=restTemplate.exchange(url2+hsn,HttpMethod.GET, null,Integer.class);
			Integer percentage=response2.getBody();
			x.setPrice(x.getPrice()+(x.getPrice()*percentage/100));
		});
		
		
		return products;
	}}}
	

