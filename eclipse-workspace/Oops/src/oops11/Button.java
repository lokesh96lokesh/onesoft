package oops11;

public class Button {
	private String color;
	private int price;
	
	public Button(String color,int price) {
		this.color=color;
		this.price=price;
	}
	public String toString() {
		return "Button Color="+color+" "+"Button Price="+price;
	}
	public String getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	}

}
