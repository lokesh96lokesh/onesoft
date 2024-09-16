package com.example.UseProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UseController {
	@Autowired
	RestTemplate rt;
	@GetMapping(value="/netprice")
	public List<UseEntity> getNetPrice(){
		String url1="http://localhost:8080/getdetails";
		String url2="http://localhost:8081/getpercentage/";
		ResponseEntity<List<UseEntity>> entity=rt.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<UseEntity>>() {});
		List<UseEntity> entity1=entity.getBody();
		entity1.forEach(x->{
			int hsn=x.getHsncode();
			ResponseEntity<Integer> entity3=rt.exchange(url2+hsn,HttpMethod.GET,null,Integer.class);
			int percentage=entity3.getBody();
			x.setPrice(x.getPrice()+(x.getPrice()*percentage/100));
			
		});
		return entity1;
	}

}
