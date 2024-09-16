package com.example.Mobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileController {
	@Autowired
	MobileService ms;
	@GetMapping("/findbrand/{a}")
	public List<MobileEntity> getBrand(@PathVariable String a){
	return ms.getBrand(a);

}
	@GetMapping("/findbrand1/{b}")
	public List<String> getBrand1(@PathVariable int b){
		return ms.getBrand1(b);
	}
	@GetMapping("/findrange/{a}/{b}")
	public List<MobileEntity> getRange(@PathVariable int a,@PathVariable int b){
		return ms.getRange(a,b);
		
	}
}
