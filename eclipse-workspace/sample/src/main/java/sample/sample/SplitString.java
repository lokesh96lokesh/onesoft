package sample.sample;

public class SplitString {
	public static void main(String[] args) {
		String wrd="ram raja hari";
		String wrd1="ram2raja4hari";
		String [] wrds=wrd1.split("[0-9]");
		String [] wrds1=wrd.split("[a-z]");
		for (String a:wrds1) {
			System.out.println(a);
		}
		for (String s:wrds) {
			System.out.println(s);
		}
	
	}

}
