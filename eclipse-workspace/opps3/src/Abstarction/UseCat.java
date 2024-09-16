package Abstarction;

public class UseCat {
	public static void main(String[] args) {
		Cat c=new Cat();
		System.out.println(c.findEating("Fish"));
		System.out.println(c.findSleep());
		System.out.println(c.findSound());
	}

}
