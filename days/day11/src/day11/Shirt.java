package day11;

public class Shirt {
	private String brand;
	private String color;
	private int price;
	private Button button;
	public Shirt(String brand,String color,int price,Button button) {
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.button=button;
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
	public void setButton(Button button) {
		this.button=button;
	}
	public Button getButton() {
		return button;
	}
	public String toString() {
		return "brand="+brand+"color="+color+"price="+price+"button details="+button;
	}

}
