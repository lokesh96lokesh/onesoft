package inheri;

public class UseSportsBike {
	public static void main(String[] args ) {
		SportsBike s=new SportsBike();
		s.brans="Pulser";
		s.price=1000000;
		s.color="Black";
		s.weight=68.9f;
		s.taxAmount=1000;
		
		System.out.println(s.netPrice (s.price,s.taxAmount));
		
	}

}
