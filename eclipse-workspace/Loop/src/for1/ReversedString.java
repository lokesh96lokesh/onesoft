package for1;

public class ReversedString {
	public static void main(String[] args) {
		String word="internship";
		String temp="";
		for(int i=word.length()-1;i>=0;i--) {
			temp=temp+word.charAt(i);
			
		}
		System.out.println(temp);
		
		
	}

}
