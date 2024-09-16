package Function1;

public class UseBank {
	public static void main(String[] args) {
		Bank b=new Bank();
		b.amt1=10000;
		b.amt2=1200;
		b.bankName="SBI";
		System.out.println(b.findCredit(b.amt1,b.amt2));
		b.findDebit(1200,100);

	}

}
