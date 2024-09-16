package day11;

public class UseAc {
	public static void main(String[] args) {
		Compresor c1=new Compresor("Apple",2000,true);
		Ac a1=new Ac("samsung",614500,true,c1);
		Ac a2=new Ac("acer",114500,true,c1);
		Ac a3=new Ac("lg",577432,false,c1);
		Ac a4=new Ac("daiken",16500,true,c1);
		Ac a5=new Ac("croma",22400,false,c1);
		Ac[] acs= {a1,a2,a3,a4,a5};
		Ac a=null;
		for(Ac i:acs) {
			if(i.getcompreser().getIsReplacable()==true) {
			a=i;	
			}
		
		}System.out.println(a);
	}

}
