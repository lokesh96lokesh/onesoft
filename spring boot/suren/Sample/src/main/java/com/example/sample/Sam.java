package com.example.sample;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sam {
	
	@RequestMapping(value="/show")
	String text() {
		return "Hello World";
	}
	@RequestMapping(value="/addi")
	public int add() {
		int a=10;
		int b=20;
		return a+b;
	}
	@RequestMapping(value="/mul/{a}/{b}")
	public int mul(@PathVariable int a,@PathVariable int b) {
		return a*b;
	}
	@RequestMapping(value="/num/{a}")
	public String isEven(@PathVariable int a) {
		if(a%2==0) {
			return a+" is even";
		}
		else {
			return a+" is odd";
		}
	}
	@RequestMapping(value="/name/{name}")
	public String name(@PathVariable String name) {
		if(name.equalsIgnoreCase("Suren")) {
			return name+" is equal";
		}
		else {
			return name+" is not equal";
		}
	}
	@RequestMapping(value="/num1/{a}")
	
	public int num1(@PathVariable int a) {
		int count=0;
		for(int i=0;i<a;i++) {
			count=count+i;
		}
		return count;
	}
	@GetMapping(value="/display")
	public String show(@PathParam(value="num") int num) {
		return "this is "+num;
	}
	@GetMapping(value="dis")
	public String shows(@PathParam(value=" num1")int num1,@PathParam(value=" num2")int num2) {
		return "this is total="+(num1+num2);
	}
	@GetMapping(value="/validate")
	public String validate(@PathParam(value=" ")String UserName,@PathParam(value=" ")String passWord) {
		if(UserName.equalsIgnoreCase("Suren")&&passWord.equalsIgnoreCase("1234")) {
			return "Valid User";
		}
		else {
			return "Invalid User";
		}
	}
	@GetMapping(value="/showInfo")
	public String displayInfo(@RequestBody User u) {
		return "this is my Info"+u;
	}
	

}
