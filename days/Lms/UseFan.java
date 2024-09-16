package Lms;

public class UseFan {
	public static void main(String[]args) {
		Fan fan=new Fan();
		String[] result=args[0].split(",");
		fan.brand = result[0];
		fan.price = Integer.parseInt(result[1]);
		fan.colour = result[2];
		
		Fan fan1=new Fan();
		String[] output=args[1].split(",");
		fan1.brand=output[0];
		fan1.price=Integer.parseInt(output[1]);
		fan1.colour=output[2];
		
		
		
		System.out.println(fan.brand+" "+fan.price+" "+fan.colour);
		System.out.println(fan1.brand+" "+fan1.price+" "+fan1.colour);
		
		
	}

}
class Fan{
	String brand;
	int price;
	String colour;
}