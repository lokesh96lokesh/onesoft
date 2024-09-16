package oops11;

public class Watch {
	private String brand;
	private int price;
	private String Type;
	private Motor motor;
	
	public Watch(String brand,int price,String Type,Motor motor) {
		this.brand=brand;
		this.price=price;
		this.Type=Type;
		this.motor=motor;
	}
	public String toString() {
		return "Brand="+brand+" "+"Price="+price+" "+"Watch Type="+Type+" "+"Motor Details="+motor;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getType() {
		return Type;
	}
	public Motor motor() {
		return motor;
	}

}
