package conditions;

public class UseMobile {
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.brand="POCO";
		mobile.price=14500;
		mobile.isWaterProof=true;
		
		Mobile mobile1=new Mobile();
		mobile1.brand="VIVO";
		mobile1.price=13000;
		mobile1.isWaterProof=false;
		
		Mobile mobile2=new Mobile();
		mobile2.brand="OPpO";
		mobile2.price=17000;
		mobile2.isWaterProof=false;
		
		if(mobile.price>mobile1.price && mobile.price>mobile2.price) {
			System.out.println(mobile.brand.toUpperCase());
		}
		else if(mobile1.price>mobile.price && mobile1.price>mobile2.price) {
			System.out.println(mobile1.brand.toUpperCase());
		}
		else if(mobile2.price>mobile.price && mobile2.price>mobile1.price) {
			System.out.println(mobile2.brand.toUpperCase());
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}
