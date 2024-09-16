package StringMethod;

public class ToCheckEqualIgnoreCase {
	public static void main(String[]args) {
		String name = "happiness is key to success";
		boolean check =name.equalsIgnoreCase("Happiness is key to success");
		System.out.println(check);
	}

}
