package Lms;

public class UseSperate1 {
	public static void main(String[] args) {
		String[] result=args[0].split(",");
		
		Sperate1 sperate1=new Sperate1();
		sperate1.name=result[0];
		int age=Integer.parseInt(args[1]);
		sperate1.mail=result[2];
		
		System.out.println(sperate1.name);
		System.out.println(age);
		System.out.println(sperate1.mail);
		
	
		
		String[] output=args[1].split(",");
		Sperate1 sperate2=new Sperate1();
		sperate2.name=output[0];
		int age1=Integer.parseInt(args[1]);
		sperate2.mail=output[2];
		
		System.out.println(sperate2.name);
		System.out.println(age1);
		System.out.println(sperate2.mail);

		}

}
class Sperate1{
	String name;
	int age;
	String mail;
}