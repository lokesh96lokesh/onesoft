package oops11;

public class Shirt {
	private String brand;
	private int price;
	private String color;
	private Button button;
	
	public Shirt(String brand,int price,String color,Button button) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.button=button;
	}
	public String toString() {
		return "brand="+brand+" "+"Price="+price+" "+"Color="+color+" "+"Shirts Details="+button;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
		
	}
	public Button getButton() {
		return button;
	}

}
