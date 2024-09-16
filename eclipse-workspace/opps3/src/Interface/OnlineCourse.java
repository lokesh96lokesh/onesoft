package Interface;

public class OnlineCourse implements Course {
	public int showCourseId(int id) {
		return id;
	}
	public String showCourseName(String courseName) {
		
		if(courseName.equalsIgnoreCase("java")) {
			return "courseFee is="+20000;
		}
		else if(courseName.equalsIgnoreCase("EthicalHacking")) {
			return "courseFee is="+8000;
		}
		else if(courseName.equalsIgnoreCase("Python")) {
			return "courseFee is="+15000;
		}
		else if(courseName.equalsIgnoreCase("Sql")) {
			return "courseFee is="+10000;
		}
		else {
			return "not yet";
		}
	}
		
		
	public String showTrainerName(String trainerName) {
		return trainerName;
	}
	

}
