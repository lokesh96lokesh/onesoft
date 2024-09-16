package oops2;

public class Engineering {
	private String name;
	private String corse;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCorse() {
		return corse;
	}
	public void setCorse(String corse) {
		this.corse = corse;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Engineering(String name, String corse, int age) {
		
		this.name = name;
		this.corse = corse;
		this.age = age;
	}
	
	public String toString() {
		return "Engineering [name=" + name + ", corse=" + corse + ", age=" + age + "]";
	}
	

}
