package com.example.BankLoan1;


	
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		@GetMapping("/getalldetails")
		public List<LoanEntity> findAllDetails(){
			return ls.findAllDetails();
		}
		@GetMapping("/getsinglevalue/{a}")
		public LoanEntity getSingleValue(@PathVariable int a) {
			return ls.getSingleValue(a);
		}
		@GetMapping("/getname/{a}")
		public String getSingleName(@PathVariable int a) {
			return ls.getSingleName(a);
		}
		@PostMapping("/saveall")
		public String saveDetails(@RequestBody List<LoanEntity>l) {
		return ls.saveDetails(l);
		}
		@PutMapping("/update")
		public String updateData(@RequestBody LoanEntity le) {
			
			return ls.updateData(le);
		}
		@DeleteMapping("/delete")
		public String deleteData() {
			return ls.deleteData();
		}

	
	}

