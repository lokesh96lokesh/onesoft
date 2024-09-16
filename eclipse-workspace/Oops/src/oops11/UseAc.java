package oops11;

public class UseAc {
	public static void main(String[] args) {
		Compressor c1=new Compressor("ags",1200,true);
		Ac ac1=new Ac("Croma",40000,true,c1);
		Ac ac2=new Ac("Suren",20000,true,c1);
		Ac ac3=new Ac("Tata",30000,false,c1);
		Ac ac4=new Ac("UG",30000,true,c1);
		
		Ac[] acs= {ac1,ac2,ac3,ac4};
		for(Ac i:acs) {
			if(i.getisInveter()==true) {
				System.out.println(i.getBrand().toUpperCase());
			}
			
		}
	}

}
