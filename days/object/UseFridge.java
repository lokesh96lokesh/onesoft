package object;

public class UseFridge {
	public static void main(String args[])
	{
		Fridge fridge1=new Fridge();
		fridge1.brand="LG";
		fridge1.colour="Blue";
		fridge1.price=50000;
		fridge1.discountAmount=3000;
		fridge1.netPrice=fridge1.price-fridge1.discountAmount;
		fridge1.isEcoFriendly=true;
		
		System.out.println("Fridge Brand:"+fridge1.brand+" "+"Fridge Colour:"+fridge1.colour+" "+"Fridge NetPrice:"+fridge1.netPrice);
		
	}

}
