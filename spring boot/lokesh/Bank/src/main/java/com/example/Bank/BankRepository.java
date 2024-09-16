package com.example.Bank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BankRepository extends JpaRepository<BankEntity,Integer>{
	@Query(value="select ifsc from bank_details where branch=?",nativeQuery=true)
	public String getIfsc(String a);

}
