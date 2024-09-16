package object;

public class Pen1 {
	public static void main(String args[])
	{
		Pen pen1=new Pen();
		pen1.brand="Cello";
		pen1.price=40;
		pen1.tipWidth=5.1f;
		pen1.isBlueColour=true;
		
		Pen pen2=new Pen();
		pen2.brand="BollPoint";
		pen2.price=30;
		pen2.tipWidth=2.3f;
		pen2.isBlueColour=true;
		
		Pen pen3=new Pen();
		pen3.brand="Absar";
		pen3.price=40;
		pen3.tipWidth=3.2f;
		pen3.isBlueColour=false;
		
		Pen pen4=new Pen();
		pen4.average=pen1.price+pen2.price+pen3.price/3;
		
		System.out.println(pen4.average);
		
				
		
		
		
	}

}
