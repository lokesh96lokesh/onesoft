package object;

public class UseAircooler {
	public static void main(String args[])
	{
		Aircooler aircooler1=new Aircooler();
		aircooler1.brand="LG";
		aircooler1.colour="Green";
		aircooler1.price=25000;
		aircooler1.discountPercentage=15;
		aircooler1.taxPercentage=12;
		aircooler1.netPrice=aircooler1.price+(aircooler1.price*aircooler1.taxPercentage/100)-(aircooler1.price*aircooler1.discountPercentage/100);
		
		System.out.println("Aircooler Brand:"+aircooler1.brand+" "+"Aircooler Colour:"+aircooler1.colour+" "+"Aircooler:"+aircooler1.netPrice);
	}

}
