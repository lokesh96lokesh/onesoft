package com.example.CarDetails;



import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity,Integer>{
	
}
