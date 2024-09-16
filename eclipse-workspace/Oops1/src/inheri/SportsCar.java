package inheri;

public class SportsCar extends Car {
	public String findcc(int enginecc) {
		if(enginecc==120) {
			return "Speed is 100";
		}
		else if(enginecc==150) {
			return "Speed is 130";
		}
		else if(enginecc==180) {
			return "Speed is 150";
		}
		else {
			return "Speed";
		}
		
		
	}
	

}
