package day11;

public class Mobile {
	private String brand;
	private int price;
	private String color;
	private Battery battery;
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
	public void setBattery(Battery battery) {
		this.battery=battery;
	}
	public Battery getBattery() {
		return battery;
	}

	

}
