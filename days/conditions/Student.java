package conditions;

public class Student {
	public static void main(String[] args) {
		int tamil=10;
		int eng=80;
		int maths=70;
		
		if(tamil>eng && tamil>maths) {
			System.out.println("Tamil");
			
		}
		else if(eng>tamil && eng>maths) {
			System.out.println("English");
		}
		else if(maths>tamil && maths>eng) {
			System.out.println("Maths");
		}
		else {
			System.out.println("Invalid ");
		}
	}

}
