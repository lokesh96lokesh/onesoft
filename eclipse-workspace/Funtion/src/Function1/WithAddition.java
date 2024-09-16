package Function1;

public class WithAddition {
	public int addition1(int a,int b) {
		return a*b;
	}
	public static void main(String[] args) {
		WithAddition add=new WithAddition();
		System.out.println(add.addition1(100, 100));
	}

}
