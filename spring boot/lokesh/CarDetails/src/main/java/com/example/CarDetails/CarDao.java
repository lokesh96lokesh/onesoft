package com.example.CarDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class CarDao {
	@Autowired
	CarRepository cr;
	public List<CarEntity> findAllDetails(){
		return cr.findAll();

}
	public CarEntity getId(int id){
		return cr.findById(id).get();
	}

}
