package oops2;

public class Employee1 {
public String name;
public int salary;
public int experience;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
public Employee1(String name, int salary, int experience) {
	this.name = name;
	this.salary = salary;
	this.experience = experience;
}

public String toString() {
	return "Employee details "+"name=" + name + ", Salary=" + salary + ", experience=" + experience ;
}



}

