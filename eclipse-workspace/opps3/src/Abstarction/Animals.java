package Abstarction;

public abstract class Animals {
	public String findEating(String food) {
		return "Food="+food;
	}
	public String findSleep() {
		return "Sleep=zzzzz";
	}
	public abstract String findSound();

}
