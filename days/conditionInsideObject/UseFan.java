package conditionInsideObject;

public class UseFan {
	public static void main(String[]args) {
		Fan fan1=new Fan();
		fan1.brand="ustryhtjrfha";
		fan1.color="black";
		fan1.price=1200;
		fan1.isFourWing=true;
		Fan fan2=new Fan();
		fan2.brand="croma";
		fan2.color="white";
		fan2.price=2200;
		fan2.isFourWing=true;
		if(fan1.price<fan2.price) {
			System.out.println(fan1.brand.substring(1,fan1.brand.length()-1));
		}
		else if(fan1.price>fan2.price) {
			System.out.println(fan2.brand.charAt(0)+" "+fan2.brand.charAt(fan2.brand.length()-1));
		}
				
				
	}

}
