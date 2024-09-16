package Function1;

public class MaxStr {
	public void findMax(String[] a) {
		int max=a[0].length();
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>max) {
				max=a[i].length();
				
			}
		}
		return("MaxLen="+max);
		
	}
	public static void main(String[] args) {
		MaxStr m=new MaxStr();
		String[] names= {"suren","Arun","Naveen"};
		System.out.println(m.findMax(max));
		
	}

}
