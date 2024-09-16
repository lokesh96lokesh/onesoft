package Day9;

public class UseBag {
	public static void main(String[] args) {
		Bag bag1=new Bag();
		bag1.brand="fasion";
		bag1.type="school";
		bag1.color="black";
		bag1.price=675;
		Bag bag2=new Bag();
		bag2.brand="hp";
		bag2.type="laptop";
		bag2.color="blue";
		bag2.price=977;
		Bag bag3=new Bag();
		bag3.brand="act";
		bag3.type="travel";
		bag3.color="red";
		bag3.price=754;
		Bag[] bags= {bag1,bag2,bag3};
		//for (int i=0;i<bags.length;i++) {
			//if (bags[i].type.equalsIgnoreCase("travel")) {
				//System.out.println(bags[i].brand+"-"+bags[i].color+"-"+bags[i].type+"-"+bags[i].price);
		for(Bag b:bags) {
			if(b.type.equals("travel")) {
				System.out.println(b.brand+"-"+b.price+"-"+b.color);
			}
		}
		
	}

}
