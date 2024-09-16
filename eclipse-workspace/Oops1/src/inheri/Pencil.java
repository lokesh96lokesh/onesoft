package inheri;

public class Pencil extends Stationary {
	private boolean isWooden;
	private String color;
	
	public void setIsWooden(boolean isWooden) {
		this.isWooden=isWooden;
	}
	public boolean getisWooden() {
		return isWooden;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getcolor() {
		return color;
	}
	public Pencil(String brand,int price,int size,boolean isWooden,String color) {
	super(brand,price,size);
	this.isWooden=isWooden;
	this.color=color;
		
	}
	public String toString() {
		return "IsWooden="+isWooden+","+"Color="+color+" "+super.getbrand()+" "+super.getprice()+" "+super.getsize();
	}

}
