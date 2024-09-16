package conditionInsideObject;

public class UseWatch {
	public static void main(String[]args) {
		Watch watch=new Watch();
		watch.brand="ROLEX";
		watch.price=56000;
		watch.strapType="metal";
		watch.isWarantyAvailable=false;
		/*if(watch.brand.contains("a")||watch.brand.contains("e")||watch.brand.contains("i")||watch.brand.contains("o")||watch.brand.contains("u")){
			System.out.println(watch.strapType.toUpperCase());
		}
		else {
			System.out.println(watch.price);
		}*/
		
		if(watch.isWarantyAvailable==true) {
			System.out.println(watch.price+(watch.price*18/100));
		}
		if(watch.isWarantyAvailable==false) {
			System.out.println(watch.price-(watch.price*10/100));
		}
	}

}
