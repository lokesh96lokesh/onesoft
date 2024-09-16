package Function1;

public class FinfMin {
	public String findmin() {
		int[] a= {22,55,43,89,44};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>min) {
				min=a[i];
				
			}
		}
		return ("min="+min);
	}
	public static void main(String[] args) {
		FinfMin m=new FinfMin();
		System.out.println(m.findmin());
		
	}

}
