package com.example.Mobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MobileDao {
	@Autowired
	MobileRepositary mr;
	public List<MobileEntity> getBrand(String a){
	return mr.getBrand(a);

}
	public List<String> getBrand1(int b){
		return mr.getBrand1(b);
	}
	public List<MobileEntity> getRange(int a,int b){
		return mr.getRange(a,b);
	}
}
