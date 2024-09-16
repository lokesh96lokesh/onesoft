package exceptions;

public class NullExe {
	public static void main(String[] args) {
		try {
			
		String name=null;
		System.out.println(name.length());
		}
		catch(NullPointerException np) {
			System.out.println(np);
		}
	}

}
