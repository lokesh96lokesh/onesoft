package inheri;

public class Bike {
	String brans;
	int price;
	String color;
	int taxAmount;
	
	public String netPrice(int amount1,int amount2) {
		return "Net Price="+(amount1+amount2);
	}

}
