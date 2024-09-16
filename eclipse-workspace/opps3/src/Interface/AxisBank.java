package Interface;

public class AxisBank implements Bank {
	public String findRateOfInterest(int amount) {
		return "Interest is "+(amount*15/100);
	}

}
