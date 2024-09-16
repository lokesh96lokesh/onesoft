package loop22;

public class UseShirt {
	public static void main(String[] args) {
		Shirt shirt1=new Shirt();
		shirt1.price=700;
		shirt1.brand="Cotton";
		shirt1.isChecked=true;
		shirt1.taxPercentage=18;
		shirt1.discountPercentage=10;
		shirt1.netPrice=shirt1.price+(shirt1.price*shirt1.taxPercentage/100)-(shirt1.price*shirt1.discountPercentage/100);
		
		Shirt shirt2=new Shirt();
		shirt2.price=750;
		shirt2.brand="Cotton";
		shirt2.isChecked=true;
		shirt2.taxPercentage=20;
		shirt2.discountPercentage=12;
		shirt2.netPrice=shirt2.price+(shirt2.price*shirt2.taxPercentage/100)-(shirt2.price*shirt2.discountPercentage/100);
		
		
		Shirt shirt3=new Shirt();
		shirt3.price=800;
		shirt3.brand="Cotton";
		shirt3.isChecked=true;
		shirt3.taxPercentage=15;
		shirt3.discountPercentage=12;
		shirt3.netPrice=shirt3.price+(shirt3.price*shirt3.taxPercentage/100)-(shirt3.price*shirt3.discountPercentage/100);
		
		
		Shirt[] shirts=new Shirt[3];
		shirts[0]=shirt1;
		shirts[1]=shirt2;
		shirts[2]=shirt3;
		for(int i=0;i<=shirts.length-1;i++) {
			System.out.println(shirts[i].netPrice);
			
		}
		
		
		}
		

}
