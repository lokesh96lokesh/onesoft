package conditions;

public class Ac {
	public static void main(String[] args) {
		int temp=-22;
		if(temp<0) {
			System.out.println("Feezing weather");
		}
		else if(temp>=0 && temp<=10) {
			System.out.println("Very cold");
		}
		else if(temp>=11 && temp<=24) {
			System.out.println("Cold");
			
		}
		else {
			System.out.println("Invalid");
		}
	}

}
