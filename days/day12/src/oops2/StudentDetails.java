package oops2;

public class StudentDetails {
public String name;
public int age;
public int id;
public String gender;
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
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public StudentDetails(String name, int age, int id,String gender) {
	this.name = name;
	this.age = age;
	this.id = id;
	this.gender = gender;
}
public String toString() {
	return "StudentDetails name=" + name + ", age=" + age + ", id=" + id + " gender= "+gender;
}



}
