package loop22;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop laptop=new Laptop();
		laptop.brand="HP";
		laptop.price=53500;
		laptop.modelNo=1234;
		laptop.isTouchScreen=true;
		
		Laptop laptop1=new Laptop();
		laptop1.brand="LENOVO";
		laptop1.price=45000;
		laptop1.modelNo=234;
		laptop1.isTouchScreen=false;
		
		Laptop laptop2=new Laptop();
		laptop2.brand="DELL";
		laptop2.price=46000;
		laptop2.modelNo=574;
		laptop2.isTouchScreen=true;
		
		Laptop[] laptops=new Laptop[3];
		laptops[0]=laptop;
		laptops[1]=laptop1;
		laptops[2]=laptop2;
		for(int i=0;i<laptops.length;i++) {
			System.out.println(laptops[i].brand+" "+laptops[i].price+" "+laptops[i].modelNo+" "+laptops[i].isTouchScreen);
		}
		for(int i=laptops.length-1;i>=0;i--) {
			System.out.println(laptops[i].brand+" "+laptops[i].price+" "+laptops[i].modelNo+" "+laptops[i].isTouchScreen);
		}
		}
		
		
	}


