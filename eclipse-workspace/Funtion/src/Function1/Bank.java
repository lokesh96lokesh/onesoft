package Function1;

public class Bank {
	int amt1;
	int amt2;
	String bankName;
	
	public int findCredit(int amt1,int amt2) {
		return amt1+amt2;
	}
	public void findDebit(int amt1,int amt2) {
		System.out.println(amt1-amt2);
	}
	

}
