package com.example.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductDao pd;
	public String getproduct( List <ProductEntity> pp) {
		return pd.getproduct(pp);
	}
	public ProductEntity gett(int id) {
		
		return pd.gett(id);
	}

}
