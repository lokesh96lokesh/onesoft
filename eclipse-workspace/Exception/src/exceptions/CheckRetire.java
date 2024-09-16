package exceptions;

public class CheckRetire {
	public static void main(String[] args) throws AgeException {
		int age=40;
		try {
		if(age<60) {
			throw new AgeException("not Retier");
		}
		else {
			System.out.println(" Retire");
		}
		}
		catch(AgeException ae) {
			ae.printStackTrace();
		}
		
	}

}
