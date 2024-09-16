package day13Condition3;

public class Shoe {
	private String brand;
	private String color;
	private int price;
	private boolean isSports;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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
	public boolean getIsSports() {
		return isSports;
	}
	public void setIsSports(boolean isSports) {
		this.isSports = isSports;
	}
	public Shoe(String brand,String color, int price,boolean isSports) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.isSports = isSports;
	}
	public String toString() {
		return "ShoeDetails brand=" + brand + " color= "+color+", price=" + price +" isWarranty= "+isSports;
	}	

}
