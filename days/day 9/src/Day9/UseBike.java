package Day9;

public class UseBike {
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
			int max=0;
			Bike bike4=null;
			for (int i=0;i<bikes.length;i++) {
				if(bikes[i].price>max) {
					max=bikes[i].price;
					bike4=bikes[i];
				}
		}System.out.println(bike4.brand+"-"+bike4.color);
		
	}

}
