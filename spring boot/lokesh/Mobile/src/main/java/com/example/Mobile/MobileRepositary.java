package com.example.Mobile;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MobileRepositary extends JpaRepository<MobileEntity,Integer> {
	@Query(value="select * from mobile_details where brand like %:a%",nativeQuery=true)
	public List<MobileEntity> getBrand(String a);
	@Query(value="select brand from mobile_details where ram=?",nativeQuery=true)
	public List<String> getBrand1(int b);
	@Query(value="select * from mobile_details where price>=10000 and price<=20000",nativeQuery=true)
	public List<MobileEntity> getRange(int a,int b);


}
