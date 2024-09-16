package Function1;

public class Student2 {
	public void average(int tamil,int eng,int maths,int science,int soc) {
		 System.out.println("Average="+(tamil+eng+maths+science+soc)/5);
		 
		}
		public static void main(String[] args) {
			Student2 stud=new Student2();
			stud.average(100,100,100,100,100);
		}

}
