package exceptions;

public class AgeException extends Exception {
	public AgeException(String exe) {
		super(exe);
	}
		public void printStackTrace() {
			System.err.println("not Qalified");
		}
	}


