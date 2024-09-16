package for2and3;

public class UseBag {
	public static void main(String[] args) {
		int a =0;
		Bag bag1=new Bag();
		Bag bag2=new Bag();
		Bag bag3=new Bag();
		bag1.color="black";
		bag1.bagType="travel";
		bag1.noOfZips=4;
		bag2.color="blue";
		bag2.bagType="school";
		bag2.noOfZips=3;
		bag3.color="grey";
		bag3.bagType="small";
		bag3.noOfZips=2;
		Bag[] bags= {bag1,bag2,bag3};
		for(Bag i:bags) {
			a=a+i.noOfZips;
			System.out.println(i.color+","+i.bagType+","+i.noOfZips);
		}System.out.println(a);
	}
}
