package oops2;

import java.util.ArrayList;

public class UseCar {
	public static void main(String[] args) {
		Car s1=new Car("audi",200006,654,"black","decil");
		Car s2=new Car("skoda",200007,655,"blue","petrol");
		Car s3=new Car("benz",100006,656,"red","petrol");
		Car s4=new Car("Shift",200003,657,"black","decil");
		ArrayList<Car>carList=new ArrayList<>();
		carList.add(s1);
		carList.add(s2);
		carList.add(s3);
		carList.add(s4);
		int max=0;
		String maxName="";
		 for(Car i:carList) { 
			 //if(i.getPrice()>max && i.getFuel().equalsIgnoreCase("petrol")) { 
			 if(i.getPrice()>max) {
			 max=i.getPrice();
		  maxName=i.getName(); 
			 }
		 }
		  System.out.println(maxName);
			 
	//}}
		  
		 
	}

}
