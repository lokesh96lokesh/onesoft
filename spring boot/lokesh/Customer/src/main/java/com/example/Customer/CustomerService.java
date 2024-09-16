package com.example.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
	CustomerDao cd;
	
	public String getIfsc(List<CustomerEntity> ce) {
		return cd.getIfsc(ce);
	}
}
