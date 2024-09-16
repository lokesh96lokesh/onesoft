package exceptions;

public class EmailException  {
	public static void main(String[] args) throws Exception {
		String check="sdaran1704@gmail.com";
		
		if(check.contains(".com")) {
			throw new Exception("email is ok");
		}
		else {
			System.out.println("not gmail");
		}
	System.out.println("not generated");
		
}
}
 