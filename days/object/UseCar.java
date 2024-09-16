package object;

public class UseCar {
	public static void main(String args[])
	{
		Car car1=new Car();
		car1.brand="Audi";
		car1.colour="Black";
		car1.price=2000000;
		car1.taxPercentage=13;
		car1.netPrice=car1.price+(car1.price*car1.taxPercentage/100);
		car1.isAirbag=true;
		 
		System.out.println("Car Brand:"+car1.brand+" "+"Car Colour:"+car1.colour+" "+"Car Netprice:"+car1.netPrice);
		
		
	}

}
