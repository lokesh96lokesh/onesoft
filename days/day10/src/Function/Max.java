package Function;

public class Max {
	public String findMax(int num,int num1,int num2) {
		if(num>num1&&num>num2) {
			return("num is max");
		}
		else if (num1>num2&&num1>num){
			return("num1 is max");
		}
		else {
			return("num2 is max");
		}
	}
public static void main(String[] args) {
	Max m=new Max();
	System.out.println(m.findMax(5,7,8));
}

}
