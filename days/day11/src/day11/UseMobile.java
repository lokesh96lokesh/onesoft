package day11;

public class UseMobile {
	public static void main(String[] args) {
		Battery b=new Battery();
		b.setBrand("samsung");
		b.setPrice(1500);
		b.setMah(5000);
		Mobile m1=new Mobile();
		m1.setBrand("redmi");
		m1.setPrice(23000);
		m1.setColor("black");
		m1.setBattery(b);
		Mobile m2=new Mobile();
		m2.setBrand("apple");
		m2.setPrice(23000);
		m2.setColor("white");
		m2.setBattery(b);
		Mobile[] mobs= {m1,m2};
		for(int i=0;i<mobs.length;i++) {
		System.out.println(mobs[i].getBrand()+"-"+mobs[i].getPrice()+"-"+mobs[i].getColor()+" BatteryType "+mobs[i].getBattery().getBrand()+"-"+mobs[i].getBattery().getMah()+"-"+mobs[i].getBattery().getPrice());
		}
	}

}
