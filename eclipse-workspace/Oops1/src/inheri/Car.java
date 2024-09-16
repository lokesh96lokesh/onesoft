package inheri;

public class Car {
	String brand;
	int price;
	int enginecc;
	
	public String findcc(int enginecc) {
		if(enginecc==120) {
			return "Speed is 70";
		}
		else if(enginecc==150) {
			return "Speed is 90";
			
		}
		else if(enginecc==180) {
			return "Speed is 100";
		}
		else {
			return "Slow";
		}
	}

}
