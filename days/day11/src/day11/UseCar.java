package day11;

public class UseCar {
	public static void main(String[] args) {
		Engine e=new Engine();
		e.brand="ford";
		e.price=45000;
		e.hp=150;
		Engine e1=new Engine();
		e1.brand="sk";
		e1.price=34000;
		e1.hp=200;
		Car car=new Car();
		car.brand="skoda";
		car.price=50000;
		car.isAutoGear=true;
		car.engine=e;
		Car car1=new Car();
		car1.brand="audi";
		car1.price=230000;
		car1.isAutoGear=true;
		car1.engine=e1;
		Car car2=new Car();
		car2.brand="bens";
		car2.price=450000;
		car2.isAutoGear=true;
		car2.engine=e;
		Car [] cars= {car,car1,car2};
		for(int i=0;i<cars.length;i++) {
		System.out.println(cars[i].brand+" "+cars[i].price+" "+cars[i].isAutoGear+" "+cars[i].engine.brand+" "+cars[i].engine.price+" "+cars[i].engine.hp);
	}
	}
}
