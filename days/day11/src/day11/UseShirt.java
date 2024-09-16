package day11;

public class UseShirt {
	public static void main(String[] args) {
		Button b=new Button("azor",5);
		Shirt s1=new Shirt("otto","blue",550,b);
		Shirt s2=new Shirt("denim","black",1200,b);
		Shirt[] shts= {s1,s2};
		for(Shirt i:shts) {
		System.out.println(s1.getPrice()+s1.getButton().getPrice());
		System.out.println(i.getBrand());
	}
	}

}
