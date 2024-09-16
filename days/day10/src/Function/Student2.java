package Function;

public class Student2 {
	public void average (int tamil,int eng,int comp,int social,int sci) {
		System.out.println("average="+(tamil+eng+comp+social+sci)/5);
		
	}
	public static void main(String[] args) {
		Student2 stud=new Student2();
		stud.average(34,52,63,52,82);
	}

}
