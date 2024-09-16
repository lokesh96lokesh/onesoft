package Day9;

public class UseCar {
	public static void main(String[]args) {
		Car car1 = new Car();
		car1.brand="shift";
		car1.price=275000;
		car1.color="blue";
		Car car2 = new Car();
		car2.brand="inova";
		car2.price=180000;
		car2.color="black";
		Car car3 = new Car();
		car3.brand="skoda";
		car3.price=500000;
		car3.color="red";
		Car [] cars= {car1,car2,car3};
		for(Car a:cars) {
			if(a.brand.equals("skoda")) {
		System.out.println(a.brand+"-"+a.price+"-"+a.color);
			}
			else {
				System.out.println(a.brand+"-"+a.price+"-"+a.color+"-"+(a.price+10000));
			}
		}
	}
}
