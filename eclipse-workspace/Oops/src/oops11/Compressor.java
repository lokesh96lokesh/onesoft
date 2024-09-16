package oops11;

public class Compressor {
	private String brand;
	private int price;
	private boolean isReplace;
	
	public Compressor(String brand,int price,boolean isReplace) {
		this.brand=brand;
		this.price=price;
		this.isReplace=isReplace;
	}
	public String toString() {
		return "Brand="+brand+" "+"Price="+price+" "+"isReplace="+isReplace;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public boolean getIsReplace() {
		return isReplace;
	}
	
	

}
