package loop22;

public class ArrayCount {
	public static void main(String[] args) {
		int[] num= {1,4,6,7,8,90,65,43};
		int count=0;
		for(int i=0;i<=num.length-1;i++) {
			count=count+1;
		}
		System.out.println(count);
	}

}
