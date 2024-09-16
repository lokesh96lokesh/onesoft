package day13Condition3;

public class Employee {
	private String name; 
	private int salary;
	private boolean isMale;
	public Employee(String name,int salary,boolean isMale) {
		
		this.name=name;
		this.salary=salary;
		this.isMale=isMale;
	}
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setSalary(int salary) {
			this.salary=salary;
		}
		public int getSalary() {
			return salary;
		}
		public void setIsMale(boolean isMale) {
			this.isMale=isMale;
		}
		public boolean getIsMale() {
			return isMale;
		}
		public String toString() {
			return name+salary+isMale;
		}

}
