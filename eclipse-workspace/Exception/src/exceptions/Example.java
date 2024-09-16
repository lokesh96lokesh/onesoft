package exceptions;

public class Example {
	public static void main(String[] args) {
		try {
		int num1=5;
		int num2=0;
		int num=num1/num2;
		System.out.println(num);
		}
		catch(ArithmeticException ae) {
			//ae.printStackTrace();
			System.out.println(ae);
		}
		System.out.println("program end");
	}

}
