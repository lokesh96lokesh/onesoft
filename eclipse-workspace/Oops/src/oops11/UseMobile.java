package oops11;

public class UseMobile {
	public static void main(String[] args) {
		Battery b=new Battery();
		b.setBrand("Samsung");
		b.setPrice(1200);
		b.setMah(150);
		
		Mobile mobile1=new Mobile();
		mobile1.setBrand("POCO");
		mobile1.setPrice(15000);
		mobile1.setColor("Blue");
		mobile1.setBattery(b);
		
		Mobile mobile2=new Mobile();
		mobile2.setBrand("Redmi");
		mobile2.setPrice(14000);
		mobile2.setColor("Green");
		mobile2.setBattery(b);
		
		
		Mobile[] mobiles= {mobile1,mobile2};
		for(int i=0;i<mobiles.length;i++) {
		
		System.out.println(mobiles[i].getBrand()+" "+mobiles[i].getPrice()+" "+mobiles[i].getColor()+" "+mobiles[i].getBattery().getBrand()+" "+mobiles[i].getBattery().getPrice()+" "+mobiles[i].getBattery().getmAh());
		}
	}

}
