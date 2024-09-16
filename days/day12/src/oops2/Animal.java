package oops2;

public abstract class Animal {
	public String Eating(String food) {
		return "Eating the"+food;
	}
	public String Sleep(int hours) {
		return "Sleeping hours "+hours;
	}
	abstract public String Sound();

}
