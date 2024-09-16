package Function;

public class FindMax {
	public String findMax(int [] a) {
		int max=0;
		for (int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return ("max="+max);
	}
	public static void main(String[] args) {
		FindMax m=new FindMax();
		int[] age= {34,54};
		System.out.println(m.findMax(age));
	}

}
