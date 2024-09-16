package Function;

public class Student1 {
	public String total (int tamil,int eng,int comp,int social,int sci) {
		return "total="+(tamil+eng+comp+social+sci);
		
	}
	public static void main(String[] args) {
		Student1 stud=new Student1();
		System.out.println(stud.total(34,52,63,52,82));
	}

}
