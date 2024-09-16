package object;

public class UseBike {
	public static void main(String args[])
	{
		Bike bike1=new Bike();
		bike1.brand="Pulsar";
		bike1.price=100000;
		bike1.taxAmount=10000;
		bike1.netPrice=bike1.price+bike1.taxAmount;
		bike1.isTubetrye=true;
		
		System.out.println("Bike Brand:"+bike1.brand+" "+"Net Price:"+bike1.netPrice     +"IsTubetrye:"+bike1.isTubetrye);
	}

}
