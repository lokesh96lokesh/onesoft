package conditions;

public class Calculator {
	public static void main(String[] args) {
	String name="multiplication";
	int num1=5;
	int num2=5;
	switch(name) {
	case "addition":
		System.out.println(num1+num2);
		break;
		
	case "subraction":
		System.out.println(num1-num2);
		break;
		
	case "multiplication":
		System.out.println(num1*num2);
		break;
		
	case "division":
		System.out.println(num1/num2);
		break;
		
	case "modulation":
		System.out.println(num1%num2);
		break;
		
		default:
			System.out.println("Invalid Input");
		
	}
	}

}
