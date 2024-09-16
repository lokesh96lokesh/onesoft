package loop22;

public class HalfValue {
	public static void main(String[] args) {
		int[] num= {1,5,6,4,8,10};
		for(int i=num.length/2-1;i>=0;i--) {
			System.out.println(num[i]);
		}
	}

}
