package inheri;

public class MethodOverLoading {
	public String findmax(int age1,int age2) { 
		if(age1>age2) {
			return "age1 is max";
		}
		else {
			return "age2 is max";
		}
	}
	public  String findmax(int age1,int age2,int age3) {
		if(age1>age2 && age1>age3) {
			return "age1 is max";
		}
		else if(age2>age1 && age2>age3) {
			return "age2 is max";
		}
		else {
			return "age3 is max";
		}
	}

}
