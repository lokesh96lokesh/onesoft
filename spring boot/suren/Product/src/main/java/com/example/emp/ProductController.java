package com.example.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	ProductService ps;
	@PostMapping(value="/shows")
	public String getproduct(@RequestBody List <ProductEntity> pp) {
		return ps.getproduct(pp);
	}
	@GetMapping(value="/{showss}/{id}")
	public ProductEntity gett(@PathVariable int id) {
		return ps.gett(id);
	}

}
