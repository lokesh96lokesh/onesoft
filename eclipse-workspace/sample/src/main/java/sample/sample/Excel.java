package sample.sample;

public class Excel {
	private String name;
	private int age;
	private String college;
	public  Excel(String name,int age,String college) {
		this.name=name;
		this.age=age;
		this.college=college;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String toString(String name,int age,String college) {
		return "psDetails = "+name+age+college;
		
	}
	
	

}
