package Day9;

public class UseWaterBottle {
	public static void main(String[] args) {
		WaterBottle wb1=new WaterBottle();
		WaterBottle wb2=new WaterBottle();
		WaterBottle wb3=new WaterBottle();
		wb1.brand="aqua";
		wb1.type="plastic";
		wb1.price=20;
		wb2.brand="bisleri";
		wb2.type="steel";
		wb2.price=40;
		wb3.brand="dheenawaters";
		wb3.type="copper";
		wb3.price=65;
		WaterBottle[] wbs= {wb1,wb2,wb3};
		int max=wb1.brand.length();
		WaterBottle wb4=null;
		int taxPercentage=5;
		for(int i=0;i<wbs.length;i++) {
			if(wbs[i].brand.length()>max) {
				max=wbs[i].brand.length();
				wb4=wbs[i];
			}
		}System.out.println(wb4.price+(wb4.price*taxPercentage/100));
		
		
		
	}

}
class WaterBottle {
	String brand;
	String type;
	int price;
}