package Lms;

public class UseCar {
	public static void main(String[]args) {
		UseCar car1=new UseCar();
		String brand=args[0];
		String colour=args[1];
		int price=Integer.parseInt(args[2]);
		System.out.println(args[0]+" "+args[1]+" "+args[2]);
		
		
		
		String output=args[0].toLowerCase();
		System.out.println(output);
		
		String result=args[1].toUpperCase();
		System.out.println(result);
		
		
	}

}
class Car{
	String brand="BMW";
	String colour="red";
	int price=8000000;
}