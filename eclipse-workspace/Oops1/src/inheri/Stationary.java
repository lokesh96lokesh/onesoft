package inheri;

public class Stationary {
	private String brand;
	private int price;
	private int size;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getbrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
	public void setSize(int size) {
		this.size=size;
	}
	public int getsize() {
		return size;
	}
	public Stationary(String brand,int price,int size) {
		this.brand=brand;
		this.price=price;
		this.size=size;
	}
	public String toString() {
		return "Brand="+brand+","+"Price="+price+","+"Size="+size;
	}
	
		
	}
	


