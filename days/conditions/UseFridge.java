package conditions;

public class UseFridge {
	public static void main(String[] args) {
		Fridge fridge=new Fridge();
		fridge.brand="LG";
		fridge.price=40000;
		fridge.colour="Black";
		fridge.isWarrantyAvailable=false;
		
		if(fridge.isWarrantyAvailable ==true) {
			System.out.println(fridge.price+(fridge.price*18/100));
			}
		else {
			System.out.println(fridge.price-(fridge.price*10/100));
		}
	}

}
