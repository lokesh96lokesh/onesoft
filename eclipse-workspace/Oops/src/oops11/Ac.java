package oops11;

public class Ac {
	private String brand;
	private int price;
	private boolean isInveter;
	private Compressor compress;
	
	public Ac(String brand,int price,boolean isInveter,Compressor compress) {
		this.brand=brand;
		this.price=price;
		this.isInveter=isInveter;
		this.compress=compress;
	}
	public String toString() {
		return "Brand="+brand+" "+"Price="+price+" "+"isInveter="+isInveter+" "+"Compressor Details="+compress;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
		
	}
	public boolean getisInveter() {
		return isInveter;
	}
	public Compressor getcompress() {
		return compress;
	}

}
