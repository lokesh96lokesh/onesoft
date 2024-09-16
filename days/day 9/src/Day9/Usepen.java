package Day9;

public class Usepen {
	public static void main(String[] args) {
		Pen pen1=new Pen();
		Pen pen2=new Pen();
		Pen pen3=new Pen();
		pen1.brand="hero";
		pen1.type="ink";
		pen1.price=25;
		pen2.brand="flair";
		pen2.type="ink";
		pen2.price=15;
		pen3.brand="camel";
		pen3.type="refill";
		pen3.price=5;
		Pen [] pens= {pen1,pen2,pen3};
		int count=0;
		for(int i=0;i<pens.length;i++) {
			if(pens[i].type=="ink") {
				count=count+1;
				
			}
		}System.out.println(count);
		
	}

}
