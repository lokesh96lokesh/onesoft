package com.example.BankLoan1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loanDettails")
public class LoanEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
    private int loanNumber;
	private String customerName;
	private int loanAmount;
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	public int getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	

}
