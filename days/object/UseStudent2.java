package object;

public class UseStudent2 {
	public static void main(String args[])
	{
		Student2 student1=new Student2();
		student1.name="Suren";
		student1.id=123;
		student1.age=23;
		student1.clas=12;
		student1.attendancePercentage=75;
		student1.workingDays=240;
		student1.noOfDays=(student1.workingDays*student1.attendancePercentage/100);
		System.out.println(student1.noOfDays);
		
		Student2 student2=new Student2();
		student2.name="naveen";
		student2.id=124;
		student2.age=22;
		student2.clas=12;
		student2.attendancePercentage=80;
		student2.workingDays=240;
		student2.noOfDays=(student2.workingDays*student2.attendancePercentage/100);
		System.out.println(student2.noOfDays);
		
		Student2 student3=new Student2();
		student3.name="arun";
		student3.id=125;
		student3.age=23;
		student3.clas=12;
		student3.attendancePercentage=90;
		student3.workingDays=240;
		student3.noOfDays=(student3.workingDays*student3.attendancePercentage/100);
		System.out.println(student3.noOfDays);
	}

}
