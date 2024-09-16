package oops11;

public class UseCar {
	public static void main(String[] args) {
		Engine e1=new Engine();
		e1.brand="Ford";
		e1.price=45000;
		e1.hp=150;
		
		Engine e2=new Engine();
		e2.brand="WEW";
		e2.price=47000;
		e2.hp=120;
		
		Car car1=new Car();
		car1.brand="BMW";
		car1.price=5000000;
		car1.isAutoMatic=true;
		car1.engine=e1;
		
		Car car2=new Car();
		car2.brand="BMW";
		car2.price=5000000;
		car2.isAutoMatic=true;
		car2.engine=e2;
		
		Car car3=new Car();
		car3.brand="BMW";
		car3.price=5000000;
		car3.isAutoMatic=true;
		car3.engine=e2;
		
		Car[] cars= {car1,car2,car3};
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i].brand+" "+cars[i].price+" "+cars[i].isAutoMatic+" "+cars[i].engine.brand+" "+cars[i].engine.price+" "+cars[i].engine.hp);	
		}
		
		
	}

	}
	


