package object;

public class UseLaptop {
	public static void main(String []args)
	{
		Laptop laptop1=new Laptop();
		laptop1.brand="Lenovo";
		laptop1.price=40000;
		laptop1.ram="8gp";
		laptop1.storage=512;
		
		Laptop laptop2=new Laptop();
		laptop2.brand="HP";
		laptop2.price=50000;
		laptop2.ram="8gp";
		laptop2.storage=512;
		
		Laptop laptop3=new Laptop();
		laptop3.brand="DELL";
		laptop3.price=30000;
		laptop3.ram="4gp";
		laptop3.storage=1;
		
		System.out.println(laptop1.brand+" "+laptop1.price+" "+laptop1.ram+"  "+laptop1.storage);
		System.out.println(laptop2.brand+"     "+laptop2.price+" "+laptop2.ram+"  "+laptop3.storage);
		System.out.println(laptop3.brand+"   "+laptop2.price+" "+laptop2.ram+"  "+laptop3.storage);
	}
}
