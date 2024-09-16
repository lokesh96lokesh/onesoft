package day11;

public class Motor {
	private int price;
	private boolean isGareenty;
	public Motor(int price,boolean isGareenty) {
	this.price=price;
	this.isGareenty=isGareenty;
}
public String toString() {
	return"price "+price+" ,garentty "+isGareenty;
}

}
