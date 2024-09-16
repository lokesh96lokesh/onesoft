package oops2;

public class Car {
	public String name;
	public int price;
	public int regNo;
	public String color;
	public String fuel;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public Car(String name, int price, int regNo,String color,String fuel) {
		this.name = name;
		this.price = price;
		this.regNo = regNo;
		this.color = color;
		this.fuel=fuel;
	}
	public String toString() {
		return "CarDetails name=" + name + ", price=" + price + ", Regno=" + regNo + " color= "+color+ " fueltype= "+fuel;
	}

}
