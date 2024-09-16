package com.example.BankLoan1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class LoanDao {
	@Autowired
	LoanRepository lr;
	public String saveIt(LoanEntity le) {
		lr.save(le);
		return "saved";
	}
	public List<LoanEntity> findAllDetails(){
		return lr.findAll();
	}
	public LoanEntity getSingleValue(int a) {
		return lr.findById(a).get();
	}
	public LoanEntity getSingleName(int a) {
		return lr.findById(a).get();
	}
	public String saveDetails(List<LoanEntity>l) {
		 lr.saveAll(l);
		 return "saved";
	}
	public String updateData(LoanEntity le) {
		lr.save(le).getId();
		return "updated";
	}
	public String deleteData() {
		lr.deleteAll();
		return "deleted";
	}
	
}
