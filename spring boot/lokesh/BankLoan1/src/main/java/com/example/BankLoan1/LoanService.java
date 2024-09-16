package com.example.BankLoan1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LoanService {
	@Autowired
	LoanDao ld;
	public String saveIt(LoanEntity le) {
		return ld.saveIt(le);
	}
	public List<LoanEntity> findAllDetails(){
		return ld.findAllDetails();
	}
	public LoanEntity getSingleValue(int a) {
		return ld.getSingleValue(a);
	}
	public String getSingleName(int a) {
		return ld.getSingleName(a).getCustomerName();
	}
	public String saveDetails(List<LoanEntity>l) {
		return ld.saveDetails(l);
	}
	public String updateData(LoanEntity le) {
		return ld.updateData(le);
	}
	public String deleteData() {
		return deleteData();
	}

}
