package day11;

public class UseWatch {
	public static void main(String[] args) {
		Motor m1=new Motor(2000,true);
		Watch w1=new Watch("rolex",64500,"sport",m1);
		Watch w2=new Watch("g shock",4500,"analog",m1);
		Watch w3=new Watch("loki",577432,"sport",m1);
		Watch w4=new Watch("suren",6500,"water",m1);
		Watch w5=new Watch("dheena",2400,"digital",m1);
		Watch [] watches ={w1,w2,w3,w4,w5};
		int max=0;
		Watch w=null;
			for(Watch i: watches) {
				if(max<i.getPrice()) {
					max=i.getPrice();
					w=i;
			}
			}System.out.println(w);
		System.out.println(w1);
		System.out.println(w2);
	}

}
