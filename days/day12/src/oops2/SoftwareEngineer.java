package oops2;

public class SoftwareEngineer extends Engineering {
	
	
	public SoftwareEngineer(String name, String corse, int age,String work,int salary) {
		super(name, corse, age);
		this.work=work;
		this.salary=salary;
	}
	public String toString() {
		System.out.println( "software detAILS = WORK"+work+" SALARY"+salary);
		return  "NAME "+super.getName()+"- AGE "+super.getAge()+"- COURSE "+super.getCorse();
		
	}
	private String work;
	private int salary;
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
