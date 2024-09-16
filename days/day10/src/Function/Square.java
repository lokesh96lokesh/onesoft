package Function;

public class Square {
	public String square (int a) {
		return "square="+(a*a);
		
	}
	public static void main(String[] args) {
		Square sq=new Square();
		System.out.println(sq.square(2));
	}

}
