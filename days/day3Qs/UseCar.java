package day3Qs;

public class UseCar {
	public static void main(String[]args) {
		Car car1=new Car();
		car1.brand="bmw";
		car1.model="XVI";
		car1.price=400000;
		car1.isPetrol=false;
		Car car2=new Car();
		car2.brand="tata";
		car2.model="IX";
		car2.price=300000;
		car2.isPetrol=true;
		Car car3=new Car();
		car3.brand="swift";
		car3.model="X2V";
		car3.price=200000;
		car3.isPetrol=true;
		String name=car1.brand.toUpperCase();
		String name1=car2.brand.toUpperCase();
		String name2=car3.brand.toUpperCase();
		int length1=car1.brand.length();
		int length2=car2.brand.length();
		int length3=car3.brand.length();
		int total=car1.price+car2.price+car3.price;
		System.out.println(name+" "+car1.model+" "+car1.price+" "+car1.isPetrol);
		System.out.println(name1+" "+car2.model+" "+car2.price+" "+car2.isPetrol);
		System.out.println(name2+" "+car3.model+" "+car3.price+" "+car3.isPetrol);
		System.out.println(length1);
		System.out.println(length2);
		System.out.println(length3);
		System.out.println(total);		



		


		
		
	}

}
