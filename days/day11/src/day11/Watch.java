package day11;

public class Watch {
	private String brand;
	private int price;
	private String type;
	private Motor motor;
	public Watch(String brand,int price,String type,Motor motor) {
		this.brand=brand;
		this.price=price;
		this.type=type;
		this.motor=motor;
	}
		
	public String toString () {
			return "brand="+brand+", price="+price+", watchtype="+type+" ,motor details ="+motor;
		
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
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
		return type;
	}
	public void setMotor(Motor motor) {
		this.motor=motor;
	}
	public Motor getMotor() {
		return motor;
	}

}
