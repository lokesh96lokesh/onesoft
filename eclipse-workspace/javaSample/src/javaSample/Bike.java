package javaSample;

public class Bike {
	private String brand;
	private String color;
	private int price;
	private Engine engine;
	public Bike (String brand,String color,int price,Engine engine) {
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.engine=engine;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	public Engine getEngine() {
		return engine;
	}
	
	public String toString() {
		return "brand="+brand+"color="+color+"price="+price+"button details="+engine;
	}

}
