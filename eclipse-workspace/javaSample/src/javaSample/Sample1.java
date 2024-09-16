package javaSample;

public class Sample1 {
	public static void main(String[] args) {
		try {
		String a=null;
		String b="cat";
		String c=a.concat(b);
		System.out.println(c);
		}
		catch(NullPointerException npe) {
			npe.printStackTrace();
		}
		System.out.println("end");
	}

}
