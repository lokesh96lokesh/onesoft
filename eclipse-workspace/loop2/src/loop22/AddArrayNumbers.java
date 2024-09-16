package loop22;

public class AddArrayNumbers {
	public static void main(String[] args) {
		int[] num= {1,3,6,90,76,98,65};
		int total=0;
		for(int i=0;i<=num.length-1;i++) {
			total=total+num[i];
		}
		System.out.println(total);
	}

}
