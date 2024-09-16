package javaSample;

public class Engine {
	private String brand;
	private int price;
	public Engine (String brand,int price) {
		this.brand=brand;
		this.price=price;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return brand+price;
	}

}
