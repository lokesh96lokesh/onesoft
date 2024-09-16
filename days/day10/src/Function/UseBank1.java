package Function;

public class UseBank1 {
	public static void main(String[] args) {
		Bank b=new Bank();
		b.mainBal=1500;
		b.deposit=500;
		b.bank="sbi";
		System.out.println(b.credit(b.mainBal,b.deposit));
	}

}
