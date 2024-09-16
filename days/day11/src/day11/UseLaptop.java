package day11;

public class UseLaptop {
	public static void main(String[] args) {
		Processor p1=new Processor();
		p1.brand="reyson";
		p1.price=25000;
		p1.overclock=true;
		Processor p2=new Processor();
		p2.brand="intel";
		p2.price=2000;
		p2.overclock=true;
		Laptop l1=new Laptop();
		l1.brand="acer";
		l1.price=15000;
		l1.processor=p2;
		Laptop l2=new Laptop();
		l2.brand="hp";
		l2.price=15000;
		l2.processor=p1;
		Laptop l3=new Laptop();
		l3.brand="dell";
		l3.price=115000;
		l3.processor=p2;
		Laptop [] laps= {l1,l2,l3};
		for(int i=0;i<laps.length;i++) {
			System.out.println(laps[i].brand+"-"+laps[i].price+"-"+laps[i].processor.brand+"-"+laps[i].processor.price+"-"+laps[i].processor.overclock);
		}
		
	}

}
