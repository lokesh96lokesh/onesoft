package day13Condition3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCar {
	public static void main(String[] args) {
		ArrayList<Car>c=new ArrayList<>();
		c.add(new Car("Audi",14435000,"black",true));
		c.add(new Car("skoda",435000,"White",true));
		c.add(new Car("benz",2435000,"black",true));
		c.add(new Car("meclen",5335000,"White",true));
		c.add(new Car("toyota",4535000,"blue",true));
		c.add(new Car("bmw",4575000,"black",true));
		List<String>carList=c.stream().filter(x-> x.getColor()=="black" && x.getName().startsWith("b")).map(y-> y.getName()).collect(Collectors.toList());
		carList.forEach(x->System.out.println(x));
		for(String i:carList) {
			if(i.length()%2==0) {
				System.out.println(i.charAt((i.length()/2)-1)+"-"+(i.charAt(i.length()/2)));
			}
			else {
				System.out.println(i.charAt(i.length()/2));
			}
		}
	}

}
