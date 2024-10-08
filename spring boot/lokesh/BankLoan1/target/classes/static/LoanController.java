package com.example.BankLoan1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
	@Autowired
	LoanService ls;
	
	@PostMapping("/saveloandetails")
	public String saveIt(@RequestBody LoanEntity le) {
		return ls.saveIt(le);
	}

}
