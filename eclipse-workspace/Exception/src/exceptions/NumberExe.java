package exceptions;

public class NumberExe {
	public static void main(String[] args) {
		try {
		int a=12;
		System.out.println(a);
		
		}
		catch(NumberFormatException ne) {
		System.out.println(ne);
		}
		
		
	}

}
