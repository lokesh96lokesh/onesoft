package exceptions;

public class StackExe {
	public static void funA() {
	funA();
}
public void funb() {
	funA();
}
public static void main(String[] args) {
	funA();
}

}
