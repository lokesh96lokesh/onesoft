package object;

public class UseStudent {
	public static void main(String args[])
	{
		Student student1=new Student();
		student1.Name="Suren.d";
		student1.Rollno=1234;
		student1.Tamil=100;
		student1.English=100;
		student1.Maths=100;
		student1.Physics=100;
		student1.Chemistry=100;
		student1.Average= (student1.Tamil+student1.English+student1.Maths+student1.Physics+student1.Chemistry)/5;
		
		Student student2=new Student();
		student2.Name="Naveen.t";
		student2.Rollno=123;
		student2.Tamil=90;
		student2.English=90;
		student2.Maths=90;
		student2.Physics=90;
		student2.Chemistry=90;
		student2.Average=(student2.Tamil+student2.English+student2.Maths+student2.Physics+student2.Chemistry)/5;
		
		Student student3=new Student();
		student3.Name="Arun.t";
		student3.Rollno=12345;
		student3.Tamil=80;
		student3.English=90;
		student3.Maths=60;
		student3.Physics=90;
		student3.Chemistry=90;
		student3.Average=(student3.Tamil+student3.English+student3.Maths+student3.Physics+student3.Chemistry)/5;
		
		System.out.println(student1.Name);
		System.out.println(student1.Rollno);
		System.out.println(student1.Average);
		
		System.out.println(student2.Name);
		System.out.println(student2.Rollno);
		System.out.println(student2.Average);
		
		System.out.println(student3.Name);
		System.out.println(student3.Rollno);
		System.out.println(student3.Average);
		
		
		
		
	}

}
