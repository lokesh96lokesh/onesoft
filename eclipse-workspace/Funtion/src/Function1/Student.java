package Function1;

public class Student {
	public String displayMark(int tamil,int eng,int maths,int science,int soc) {
	return tamil+" "+eng+" "+maths+" "+science+" "+soc;
}
public static void main(String[] args) {
	Student stu=new Student();
	System.out.println(stu.displayMark(100, 100, 100, 100, 100));
}
}
