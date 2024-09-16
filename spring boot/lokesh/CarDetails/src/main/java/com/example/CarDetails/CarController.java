package com.example.CarDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CarController {
	@Autowired
	CarService cs;
	@GetMapping("/getdetails")
	public List<CarEntity> findAllDetails() {
		return cs.findAllDetails();
	}
		@GetMapping("/getid/{id}")
		public CarEntity getId(@PathVariable int id){
			return cs.getId(id);
		}
		

}
