package Function;

public class Student {
	public String displayMark (int tamil,int eng,int comp,int social,int sci) {
		return tamil+" "+eng+" "+comp+" "+social+" "+sci;
	}
	public static void main(String[] args) {
		Student stud=new Student();
		System.out.println(stud.displayMark(34,52,63,52,82));
	}

}
