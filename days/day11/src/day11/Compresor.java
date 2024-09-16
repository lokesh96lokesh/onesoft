package day11;

public class Compresor {
	String brand;
	int price;
	boolean isReplacable;
	public Compresor(String brand,int price,boolean isReplacable) {
		this.brand=brand;
		this.price=price;
		this.isReplacable=isReplacable;
	}
	public String toString() {
		return "brand"+brand+"price "+price+" ,Replaceable "+isReplacable;
	}
	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}
	
	public boolean getIsReplacable() {
		return isReplacable;
	}
}
