package com.example.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
@RestController
@Repository
public class FridgeController {
	@Autowired
	FridgeRepository fr;
	
	
	@GetMapping(value="/GetDetails")
	//public List<FridgeEntity> getcar(){
	//url1="http://localhost:8080/GetDetails";
	//ResponseEntity<List<FridgeEntity>> re=rt.exchange(url1, HttpMethod.GET,null,String.class);
	ResponseEntity<List<FridgeEntity>> re(){
		return new ResponseEntity<>(fr.findAll(),HttpStatus.OK);
	//List<FridgeEntity> entity=fr.findAll();
	//return  ResponseEntity.ok().body(entity);
	}
	
	
}
