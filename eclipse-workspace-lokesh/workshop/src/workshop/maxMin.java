package workshop;

public class maxMin {
public static void main(String[] args) {
	int [] nums = {18,2,3,4,5,86};
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	for (int num:nums) {
		max = Math.max(max, num);
		min = Math.min(min, num);
	}
	System.out.println("Max:"+max);
	System.out.println("min:"+min);
}
}
