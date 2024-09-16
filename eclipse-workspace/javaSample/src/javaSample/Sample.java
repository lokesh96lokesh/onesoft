package javaSample;

public class Sample {
	public static void main(String[] args) {
		try {
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		catch (ArithmeticException ae) {
			//System.out.println(ae);
			ae.printStackTrace();
		}
		System.out.println("program end");
	}

}
