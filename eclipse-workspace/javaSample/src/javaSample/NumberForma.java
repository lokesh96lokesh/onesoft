package javaSample;

public class NumberForma {
	public static void main(String[] args) {
		try {
		int a=Integer.parseInt("1a");
		System.out.println(a);
		}
		catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		System.out.println("end");
	}
}
