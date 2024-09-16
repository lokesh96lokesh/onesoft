package day11;

public class Button {
	private String brand;
	private int price;
	public Button(String brand,int price) {
		this.brand=brand;
		this.price=price;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return "brand="+brand+"price="+price;
	}

}
