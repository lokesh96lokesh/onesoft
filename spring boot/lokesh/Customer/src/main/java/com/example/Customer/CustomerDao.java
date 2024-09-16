package com.example.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {
	@Autowired
	CustomerRepository cr;
	public String getIfsc(List<CustomerEntity> le) {
		 cr.saveAll(le);
		 return "success";
	}

}
