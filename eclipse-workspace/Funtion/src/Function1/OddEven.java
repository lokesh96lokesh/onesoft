package Function1;

public class OddEven {
	public String findOddEven(int num) {
		if(num%2==0) {
			return("is Even");
		}
		else {
			return("is Odd");
		}
	}
	public static void main(String[] args) {
		OddEven oe=new OddEven();
		System.out.println(oe.findOddEven(5));
	}

}
