package oops11;

public class UseWatch {
	public static void main(String[] args ) {
		Motor m1=new Motor(2000,true);
		Watch watch1=new Watch("Tata",7000,"Sports",m1);
		Watch watch2=new Watch("BMW",50000,"SmartWatch",m1);
		Watch watch3=new Watch("Rolex",40000,"SmartWatch",m1);
		Watch watch4=new Watch("Suren",100000,"SamrtWatch",m1);
		Watch watch5=new Watch("Loko",2000,"Sports",m1);
		
		Watch[] watches= {watch1,watch2,watch3,watch4,watch5};
		int Max=watches[0].getPrice();
		Watch w=null;
		for(Watch i:watches) {
			if(Max<i.getPrice()) {
				Max=i.getPrice();
				w=i;
				
			}
		}
		
		System.out.println(w);
		//System.out.println(watch2);
		//System.out.println(watch3);
	}

}
