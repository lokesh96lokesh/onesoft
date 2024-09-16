package oops2;

public class UseTeacher {
	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.name="anu";
		t.gender="female";
		t.age=24;
		System.out.println(t.sleepingHours(6));
		System.out.println(t.eating(5));
		System.out.println(t.showWork("pt"));
		System.out.println(t.showSalary(75000));
		System.out.println(t.name);
	}

}
