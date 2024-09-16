package com.example.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankDao {
	@Autowired
	BankRepository br;
	public String getIfsc(String a) {
		return br.getIfsc(a);
	}

}
