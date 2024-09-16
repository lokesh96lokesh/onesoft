package Day9;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		Laptop l2=new Laptop();
		Laptop l3=new Laptop();
		l1.brand="acer";
		l1.price=24000;
		l1.isTouch=true;
		l2.brand="hp";
		l2.price=54000;
		l2.isTouch=false;
		l3.brand="dell";
		l3.price=74000;
		l3.isTouch=true;
		Laptop[] laps= {l1,l2,l3};
		int min=l1.price;
		for(int i=0;i<laps.length;i++) {
			if(laps[i].price<=min) {
				min=laps[i].price;
				System.out.println(laps[i].brand+" "+laps[i].price+" "+laps[i].isTouch);
		//for(int i=0;i<laps.length;i++) {
			//if(laps[i].isTouch==true) {
			//	System.out.println(laps[i].brand+" "+laps[i].price+" "+laps[i].isTouch);
			}
		}
	}
}
class Laptop {
	String brand;
	int price;
	boolean isTouch;
}