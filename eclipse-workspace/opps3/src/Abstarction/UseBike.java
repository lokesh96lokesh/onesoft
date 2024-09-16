package Abstarction;

public class UseBike {
	public static void main(String[] args) {
		Bike b=new Bike();
		System.out.println(b.getMilage(120));
		System.out.println(b.engineCc(220));
		System.out.println(b.showSpeed(120));
	}

}
