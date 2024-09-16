package Function1;

public class Student1 {
	public String total(int tamil,int eng,int maths,int science,int soc) {
	 return "total="+(tamil+eng+maths+science+soc);
	 
	}
	public static void main(String[] args) {
		Student1 stud=new Student1();
		System.out.println(stud.total(100,100,100,100,100));
	}

}
