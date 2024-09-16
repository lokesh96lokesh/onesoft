package Prime;

public class FifththPrimeNumber {
	public static void main(String[] args) {
		int prime=0;
		int count=0;
	for (int i = 1; i <= 100; i++) {
		boolean isPrime = true;
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				isPrime = false;
			}
		}

		if (isPrime == true) {
			prime=i;
			count++;
			System.out.println(i + "is prime number");

		}
		if(count==6) {
			break;
		}

	}  System.out.println(prime); 

}

}
