package object;

public class UseAccountHolder {
	public static void main(String args[])
	{
		AccountHolder accountHolder1=new AccountHolder();
		accountHolder1.name="Suren";
		accountHolder1.age=23;
		accountHolder1.gender="male";
		accountHolder1.AccountNo=684787274;
		accountHolder1.monthlyIncome=21000;
		accountHolder1.SavingsPercentage=18;
		accountHolder1.savingsAmount=accountHolder1.monthlyIncome*accountHolder1.SavingsPercentage/100;
		System.out.println(accountHolder1.savingsAmount);
		
		AccountHolder accountHolder2=new AccountHolder();
		accountHolder2.name="mani";
		accountHolder2.age=23;
		accountHolder2.gender="male";
		accountHolder2.AccountNo=684735274;
		accountHolder2.monthlyIncome=20000;
		accountHolder2.SavingsPercentage=20;
		accountHolder2.savingsAmount=accountHolder2.monthlyIncome*accountHolder2.SavingsPercentage/100;
		System.out.println(accountHolder2.savingsAmount);
		
		AccountHolder accountHolder3=new AccountHolder();
		accountHolder3.name="Arunn";
		accountHolder3.age=23;
		accountHolder3.gender="male";
		accountHolder3.AccountNo=635687274;
		accountHolder3.monthlyIncome=30000;
		accountHolder3.SavingsPercentage=10;
		accountHolder3.savingsAmount=accountHolder3.monthlyIncome*accountHolder3.SavingsPercentage/100;
		System.out.println(accountHolder3.savingsAmount);
		
		
	}

}
