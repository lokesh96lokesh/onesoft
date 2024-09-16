package com.example.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	@Autowired
	BankService bs;
	
	@GetMapping("/findifsc/{a}")
	public String getIfsc(@PathVariable String a) {
		return bs.getIfsc(a);
	}
	
	

}
