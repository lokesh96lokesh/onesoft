package conditionInsideObject;

public class UseCar {
	public static void main(String[]args) {
		Car car1=new Car();
		car1.brand="honda";
		car1.price=500000;
		car1.color="red";
		car1.isAutomaticGear=false;
		Car car2=new Car();
		car2.brand="BMW";
		car2.price=2000000;
		car2.color="Black";
		car2.isAutomaticGear=true;
		if(car1.price>car2.price) {
			System.out.println(car1.brand+" "+car1.price);
		}
		else if(car2.price>car1.price) {
			System.out.println(car2.brand+" "+car2.price);
		}
	}

}
