package Abstarction;

public abstract class CentralGovtRoles implements NumberPlateRoles {
	public String displayFontStle(String style){
		return style;
	}
	public String displayNumberPlateColor(String color) {
		if(color.equalsIgnoreCase("Green") && color.equalsIgnoreCase("White")) {
			return "electri";
		}
		else if(color.equalsIgnoreCase("Black") && color.equalsIgnoreCase("White")) {
			return "Private";
		}
		else if(color.equalsIgnoreCase("Black") && color.equalsIgnoreCase("Yellow")) {
			return "Public";
		}
		else {
			return "not yet";
		}
	}
	public String displayStateCode(String stateCode  ) {
		return stateCode;
	}
	public abstract int displayFontSize(int size);

}
