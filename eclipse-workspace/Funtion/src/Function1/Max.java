package Function1;

public class Max {
	public String findMax(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println("a is big");
			}
		else if(b>a && b>c ) {
			System.out.println("b is big");
		}
		else {
			System.out.println("c is big");
		}
	}
	public static void main(String[] args) {
		Max m=new Max();
		System.out.println(m.findMax(5, 6, 3));
	}
	

}
