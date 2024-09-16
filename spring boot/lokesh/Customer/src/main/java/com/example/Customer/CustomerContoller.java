package com.example.Customer;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class CustomerContoller {
	@Autowired
	RestTemplate rt;
	CustomerService cs;
	
	@PostMapping("/ifscno")
	public String getIfsc(@RequestBody List<CustomerEntity> ce){
	
		
		ce.forEach(x->{
		String ifsc=x.getBranch();
		String url1="http://localhost:8081/findifsc/";
		ResponseEntity<String> entity=rt.exchange(url1+ifsc,HttpMethod.GET,null,String.class);
		String entity1=entity.getBody();
		x.setIfsc(entity1);
			
		});
		return cs.getIfsc(ce);

	}
}
