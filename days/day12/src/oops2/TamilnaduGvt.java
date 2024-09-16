package oops2;

public class TamilnaduGvt extends CentralGvt {
	public String Statecode(String code) {
		return "State code is- "+code;
	}
	public String ShowNumberPlateColor(String vechileType) {
		if (vechileType.equals("public")) {
			return "white" ;
		}
		else if(vechileType.equals("private")) {
			return "yellow" ;
		}
		else if(vechileType.equals("eletric")){
			return "green";
		}
		else {
			return "invalid";
		}
	}

}
