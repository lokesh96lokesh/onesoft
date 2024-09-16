package day13Condition3;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UseShoe {
	public static void main(String[] args) {
		
		Shoe s1=new Shoe("bata","black",654,false);
		Shoe s2=new Shoe("vkc","White",234,true);
		Shoe s3=new Shoe("sandel","blue",743,false);
		Shoe s4=new Shoe("puma","White",1200,true);
		Shoe s5=new Shoe("adidas","black",2410,true);
		
		HashMap<String,Shoe>shoeList=new HashMap<>();
		shoeList.put(s1.getBrand(), s1);
		shoeList.put(s2.getBrand(), s2);
		shoeList.put(s3.getBrand(), s3);
		shoeList.put(s4.getBrand(), s4);
		shoeList.put(s5.getBrand(), s5);
		
		List<Shoe>a=shoeList.values().stream().filter(x-> x.getColor().startsWith("W")).collect(Collectors.toList());
		a.forEach(x->System.out.println(x));
	}

}
