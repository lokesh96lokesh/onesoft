package StringMethod;

public class UseMobile {
	public static void main(String[]args) {
		Mobile mobile1=new Mobile();
		mobile1.brand="apple";
		mobile1.price=15000;
		mobile1.colour="black";
		mobile1.isTouchScreen=true;
		mobile1.modelNum=423;
		Mobile mobile2=new Mobile();
		mobile2.brand="samsung";
		mobile2.price=12000;
		mobile2.colour="blue";
		mobile2.isTouchScreen=true;
		mobile2.modelNum=423;
		String result=mobile1.brand.toUpperCase();
		String conCat=mobile1.brand.concat(mobile2.brand);
		char firstLetter =mobile1.brand.charAt(0);
		char firstLetter1 =mobile1.brand.charAt(4);
		String ppl=mobile1.brand.substring(1,4);
		System.out.println(result);
		System.out.println(conCat);
		System.out.println(conCat.length());
		System.out.println(firstLetter);
		System.out.println(firstLetter1);
		System.out.println(ppl);

		
	}

}
