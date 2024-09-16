package oops11;

public class Motor {
	private int price;
	private boolean isGarantee;
	public Motor(int price,boolean isGarantee) {
		this.price=price;
		this.isGarantee=isGarantee;
		
	}
	public String toString() {
		return "MotorPrice="+price+" "+"Motor Garanty="+isGarantee;
	}
	public int getPrice() {
		return price;
	}
	public boolean getIsGarantee() {
		return isGarantee;
	}

}
