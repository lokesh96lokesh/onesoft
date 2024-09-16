package conditions;

public class StudentGrade {
	public static void main(String[] args) {
		int mark=61;
		if(mark>=91 && mark<=100) {
			System.out.println("S Grade");
		}
		else if(mark>=81 && mark<=90) {
			System.out.println("A Grade");
		}
		else if(mark>=71 && mark<=80) {
			System.out.println(" B Grade");
		}
		else if(mark>=61 && mark<=70) {
			System.out.println(" C Grade");
		}
		else if(mark>=51 && mark<=60) {
			System.out.println(" D Grade");
		}
		else {
			System.out.println("Invaild Input");
		}
		}

}
