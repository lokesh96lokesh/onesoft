package day11;

public class Ac {
	private String brand;
	private int price;
	private boolean isInverter;
	private Compresor compreser;
	public Ac(String brand,int price,boolean isInverter,Compresor comproser) {
		this.brand=brand;
		this.price=price;
		this.isInverter=isInverter;
		this.compreser=comproser;
	}
	public String toString () {
		return "brand="+brand+", price="+price+", isInverter="+isInverter+" ,ac details ="+compreser;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}
	
	public boolean getisInverter() {
		return isInverter;
	}
	
	public Compresor getcompreser() {
		return compreser;
	}

}
