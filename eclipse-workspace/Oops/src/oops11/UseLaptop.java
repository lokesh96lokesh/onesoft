package oops11;

public class UseLaptop {
	public static void main(String[] args) {
		Processor p=new Processor();
		p.name="Intel";
		p.model=123;
		p.price=1200;
		
		Processor p1=new Processor();
		p1.name="Acto";
		p1.model=345;
		p1.price=5400;
		
		Laptop lap1=new Laptop();
		lap1.brand="HP";
		lap1.price=53500;
		lap1.isFingerPrint=true;
		lap1.process=p;
		
		Laptop lap2=new Laptop();
		lap2.brand="LENOVO";
		lap2.price=23000;
		lap2.isFingerPrint=false;
		lap2.process=p1;
		
		Laptop[] laps= {lap1,lap2};
		for(int i=0;i<laps.length;i++) {
			System.out.println(laps[i].brand+" "+laps[i].price+" "+laps[i].isFingerPrint+" "+laps[i].process.name+" "+laps[i].process.model+" "+laps[i].process.price);
			
		}
	}

}
