package object;

public class UseMobile {
	public static void main(String []args)
	{
		Mobile mobile1=new Mobile();
		 mobile1.brand="poco";
		 mobile1.price=15000;
		 mobile1.colour="Black";
		 mobile1.isWaterproof=true;
		 
		 Mobile mobile2=new Mobile();
		 mobile2.brand="vivo";
		 mobile2.price=12000;
		 mobile2.colour="Green";
		 mobile2.isWaterproof=false;
		 
		 Mobile mobile3=new Mobile();
		 mobile3.brand="redmi";
		 mobile3.price=13000;
		 mobile3.colour="Blue";
		 mobile3.isWaterproof=true;
		 
		 System.out.println(mobile1.brand);
		 System.out.println(mobile1.price); 
		 System.out.println(mobile1.colour);
		 System.out.println(mobile1.isWaterproof);
		 
		 System.out.println(mobile2.brand);
		 System.out.println(mobile2.price);
		 System.out.println(mobile2.colour);
		 System.out.println(mobile2.isWaterproof);
		 
		 System.out.println(mobile3.brand);
		 System.out.println(mobile3.price);
		 System.out.println(mobile3.colour);
		 System.out.println(mobile3.isWaterproof);
		 
		 
		 
	}

}
