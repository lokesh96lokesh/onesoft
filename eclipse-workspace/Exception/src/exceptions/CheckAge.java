package exceptions;

public class CheckAge {
	public static void main(String[] args) throws AgeException {
		int age=17;
		try {
		if(age<18) {
			throw new AgeException("Not Eligible");
		}
		else {
			System.out.println("Eligible");
		}
		}
		catch(AgeException ae) {
			ae.printStackTrace();
		}
		
		
		
	}

}
