package Interface;

public class UseTeacher {
	public static void main(String[] args) {
		Teacher1 t=new Teacher1();
		System.out.println("Salary : "+t.showSalary(50000));
		System.out.println("Work : "+t.showWork("It"));
		System.out.println("Working Sector : "+t.showWorkingSector("Private"));
	}

}
