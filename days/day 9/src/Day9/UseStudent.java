package Day9;

public class UseStudent {
	public static void main(String[] args) {
		Student student1=new Student();
		student1.name="sandhanam";
		student1.age=14;
		student1.rollNum=17;
		student1.mark=30;
		Student student2=new Student();
		student2.name="donglee";
		student2.age=13;
		student2.rollNum=22;
		student2.mark=45;
		Student student3=new Student();
		student3.name="veerapan";
		student3.age=13;
		student3.rollNum=30;
		student3.mark=70;
		Student student4=new Student();
		student4.name="binladden";
		student4.age=13;
		student4.rollNum=32;
		student4.mark=86;
		Student student5=new Student();
		student5.name="sadam";
		student5.age=13;
		student5.rollNum=34;
		student5.mark=97;
		Student[] sts= {student1,student2,student3,student4,student5};
		for(int i=0;i<sts.length;i++) {
			if(sts[i].mark<=30) {
				System.out.println(sts[i].name+" grade a");
			}
			else if(sts[i].mark<=40) {
				System.out.println(sts[i].name+" grade b");
			}
			else if (sts[i].mark<=70) {
				System.out.println(sts[i].name+" grade c");
			}
			else {
				System.out.println(sts[i].name+" grade d");
			}
			//if(sts[i].rollNum<20) {
				//System.out.println(sts[i].name+" grade a");
			//}
			//else if(sts[i].rollNum<=30) {
			//	System.out.println(sts[i].name+" grade b");
			//}
			//else {
				//System.out.println(sts[i].name+" grade c");
			//}
		}
		
		
	}
}
class Student {
	String name;
	int age;
	int rollNum;
	int mark;
}