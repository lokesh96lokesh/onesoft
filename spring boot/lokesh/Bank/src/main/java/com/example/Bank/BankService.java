package com.example.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
	@Autowired
	BankDao bd;
	public String getIfsc(String a) {
		return bd.getIfsc(a);
	}

}
