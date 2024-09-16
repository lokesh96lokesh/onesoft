package Day9;

public class UseBike1 {
	public static void main(String[]args) {
		Bike bike1 = new Bike();
		bike1.brand="yamaha";
		bike1.price=75000;
		bike1.color="blue";
		Bike bike2 = new Bike();
		bike2.brand="honda";
		bike2.price=80000;
		bike2.color="black";
		Bike bike3 = new Bike();
		bike3.brand="duke";
		bike3.price=100000;
		bike3.color="red";
		Bike[] bikes={bike1,bike2,bike3};
		int min=bike1.price;
		Bike a=bike1;
			for(Bike i:bikes) {
				if(i.price<min) {
					min=i.price;
					a=i;
					
				}
		}System.out.println(a.brand+"-"+a.color);
		
	}

}
