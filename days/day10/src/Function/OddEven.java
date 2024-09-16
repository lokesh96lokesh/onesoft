package Function;

public class OddEven {
	public String findOddEven(int num) {
		if(num%2==0) {
			return("is even");
		}
		else {
			return("is odd");
		}
	}
public static void main(String[] args) {
	OddEven oe=new OddEven();
	System.out.println(oe.findOddEven(5));
}
}
