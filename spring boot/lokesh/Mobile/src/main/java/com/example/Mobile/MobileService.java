package com.example.Mobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileService {
	@Autowired
	MobileDao md;
   public List<MobileEntity> getBrand(String a){
   return md.getBrand(a);
}
   public List<String> getBrand1(int b){
	   return md.getBrand1(b);
   }
   public List<MobileEntity> getRange(int a,int b){
	   return md.getRange(a,b);
   }
}
