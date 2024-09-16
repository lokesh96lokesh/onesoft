package StringMethod;

public class Dummy {
	public static void main(String[]args) {
		String name ="world wide wonder";
		String name2="programing";
		String caps = name.toUpperCase();
		String[] seperation=caps.split(" ");
		String rec=name.concat(" "+name2);
		String value1=caps.substring(0,5);
		String value2=caps.substring(6,10);
		String value3=caps.substring(11,17);
		System.out.println(caps);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value1.length());
		System.out.println(value2.length());
		System.out.println(value3.length());
		System.out.println(seperation.length);
		System.out.println(rec);


	}

}
