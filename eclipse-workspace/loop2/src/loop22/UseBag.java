package loop22;

public class UseBag {
	public static void main(String[] args) {
		Bag bag1=new Bag();
		bag1.color="Black";
		bag1.bagTypes="SchoolBag";
		bag1.noOfzips=5;
		
		Bag bag2=new Bag();
		bag2.color="Blue";
		bag2.bagTypes="TravelBag";
		bag2.noOfzips=6;
		
		Bag bag3=new Bag();
		bag3.color="Black";
		bag3.bagTypes="SchoolBag";
		bag3.noOfzips=4;
		
		Bag[] bags= {bag1,bag2,bag3};
		int totalOfZips=0;
		
		for(Bag a:bags) {
			totalOfZips=totalOfZips+a.noOfzips;
			System.out.println(a.color+" "+a.bagTypes+" "+a.noOfzips);
			
		}
		System.out.println(totalOfZips);
	}

}
