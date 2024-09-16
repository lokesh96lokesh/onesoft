package oops2;

public class BankDetails {
	public int accountNo;
	public String name;
	public int age;
	public int balance;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public BankDetails(int accountNo,String name, int age, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.age = age;
		this.balance = balance;
	}

	public String toString() {
		return " accountnum= "+accountNo+" name= " + name + ", age=" + age + ", balance=" + balance ;
	}

}
