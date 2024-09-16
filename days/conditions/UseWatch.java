package conditions;

public class UseWatch {
	public static void main(String[] args) {
		Watch watch=new Watch();
		watch.brand="Bold";
		watch.colour="Black";
		watch.isWaterProof=true;
		watch.price=4000;
		
		Watch watch1=new Watch();
		watch1.brand="Rolex";
		watch1.colour="Black";
		watch.isWaterProof=true;
		watch.price=500000;
		
		if(watch.price>watch1.price) {
			System.out.println(watch.brand.toUpperCase());
		}
		else {
			System.out.println(watch1.brand.toUpperCase());
		}
		
	}

}
