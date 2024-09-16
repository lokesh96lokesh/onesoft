package Function;

public class FindMin {
	public String findMin(int [] a) {
		int min=a[0];
		for (int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return ("min="+min);
	}
	public static void main(String[] args) {
		FindMin m=new FindMin();
		int[] age= {64,54,-2};
		System.out.println(m.findMin(age));
	}

	

}
