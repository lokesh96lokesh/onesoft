package com.example.Customer;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {
	@Value("${message}")
	private String msg;
	
	
  @GetMapping(value="/hello")
	  public String setHello() {
		  return msg;
	  }
  @GetMapping(value="/list")
  public String[] setList() {
	  return name;
  }
  @Value("${name.list}")
  private String[] name;
  
  @GetMapping(value="/request")
public String getValue(@RequestParam String id ) {
	return "ID:"+id;
}
}


