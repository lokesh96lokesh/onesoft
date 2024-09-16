package com.example.emp;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepo pr;
	public String getproduct(List <ProductEntity> pp) {
		pr.saveAll(pp);
		return "Data has been Saved";
	}
	public ProductEntity gett(int id) {
		
		return pr.findById(id).get();
	}

}
