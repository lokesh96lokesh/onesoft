package oops2;

public class Catagory extends Product {

	public String Salestype(String type) {
		return "Sales Type is "+type;
	}
	
	public String Catagory (String catagory) {
		
		if(catagory.equals("electronic")) {
			return "laptop";
		}
		else if(catagory.equals("groceries")) {
			return "vegitables";
		}
		else if(catagory.equals("sports")) {
			return "bat and ball";
		}
		else {
			return "unexpexcted value";
		
		}
	}
}
