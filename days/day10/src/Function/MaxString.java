package Function;

public class MaxString {
	public String findMax(String [] a) {
		
		int max=0;
		String temp="";
		for (int i=0;i<a.length;i++) {
			if(a[i].length()>max) {
				max=a[i].length();
				temp=a[i];
			}
		}
		return ("temp =" +temp);
	}
	public static void main(String[] args) {
		MaxString m=new MaxString();
		String[] name= {"loki","dinesh","apple"};

		System.out.println(m.findMax(name));
	}

}
