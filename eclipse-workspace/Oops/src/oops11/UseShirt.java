package oops11;

public class UseShirt {
	public static void main(String[] args) {
		Button b1=new Button("Black",10);
		Shirt s1=new Shirt("JungleJean",1200,"Black",b1);
		Shirt s2=new Shirt("Jean",1000,"white",b1);
		
		Shirt[] shirts= {s1,s2};
		for(int i=0;i<shirts.length;i++) {
			System.out.println("Button Price="+(shirts[i].getPrice()+(shirts[i].getPrice()*5)/100));
			
		}
	}

}
