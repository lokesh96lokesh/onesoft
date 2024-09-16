package forLoop;

public class Factorial {
	public static void main(String[]args) {
		int num1 =0;
		int num=0;
		for(int i=1;i<=4;i++) {
			num=num+i;
			num1=num1+num;
			System.out.println(num1);
		}System.out.println(num1);
	}

}
