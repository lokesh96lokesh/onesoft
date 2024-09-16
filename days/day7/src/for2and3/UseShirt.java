package for2and3;

public class UseShirt {
	public static void main(String[] args) {
		Shirt shirt1 =new Shirt();
		shirt1.price=450;
		shirt1.brand="dell";
		shirt1.isChecked=true;
		shirt1.taxPercentage=12;
		shirt1.discountPercentage=20;
		shirt1.netprice=shirt1.price+(shirt1.price*shirt1.taxPercentage/100)-(shirt1.price*shirt1.discountPercentage/100);
		Shirt shirt2=new Shirt();
		shirt2.price=354;
		shirt2.brand="levies";
		shirt2.isChecked=true;
		shirt2.taxPercentage=12;
		shirt2.discountPercentage=20;
		shirt2.netprice=shirt2.price+(shirt2.price*shirt2.taxPercentage/100)-(shirt2.price*shirt2.discountPercentage/100);
		Shirt shirt3=new Shirt();
		shirt3.price=450;
		shirt3.brand="otto";
		shirt3.isChecked=false;
		shirt3.taxPercentage=12;
		shirt3.discountPercentage=20;
		shirt3.netprice=shirt1.price+(shirt3.price*shirt3.taxPercentage/100)-(shirt3.price*shirt3.discountPercentage/100);
		Shirt[] shirts= {shirt1,shirt2,shirt3};
		for(Shirt i:shirts) {
		System.out.println(i.price+","+i.netprice);
		}
	}

}
