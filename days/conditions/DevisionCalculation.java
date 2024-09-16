package conditions;

public class DevisionCalculation {
	public static void main(String[] args) {
		int number=20;
		if(number%4==0 && number%5==0) {
			System.out.println(number+ " is divisible by 4 and 5");
		}
		else {
			System.out.println(number+ " is not divisible by 4 and 5");
		}
	}

}
