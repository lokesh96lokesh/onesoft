package day13Condition3;

public class Car {
	private String name;
	private int price;
	private String color;
	private boolean isWarranty;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean getIsWarranty() {
		return isWarranty;
	}
	public void setIsWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	public Car(String name, int price,String color,boolean isWarranty) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.isWarranty = isWarranty;
	}
	public String toString() {
		return "CarDetails name=" + name + ", price=" + price + " color= "+color+" isWarranty= "+isWarranty;
	}

}
