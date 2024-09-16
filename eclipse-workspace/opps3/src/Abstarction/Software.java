package Abstarction;

public class Software extends Developer {
	public String work(String job) {
		return job;
	}
	public String expreience(int exp){
		if(exp>=0  && exp<=4) {
			return "Salary="+450000;
		}
		else if(exp>=5 && exp<=9) {
			return "Salary="+553000;
		}
		else if(exp>=10 && exp<=15) {
			return "Salary="+150000;
		}
		else {
			return "No Salary";
		}
	}

}
