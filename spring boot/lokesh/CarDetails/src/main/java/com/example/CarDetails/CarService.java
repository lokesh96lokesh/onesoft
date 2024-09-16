package com.example.CarDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
@Autowired
CarDao cd;
public List<CarEntity> findAllDetails(){
	return cd.findAllDetails();

}
public CarEntity getId(int id){
	return cd.getId(id);
}
}
