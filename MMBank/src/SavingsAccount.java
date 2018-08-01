
public class SavingsAccount {

	private static int AccountNumber;//instance members
	private String Name;
	private double Balance;
	//deposit function
	public void deposit(double Amount) {
		Balance+=Amount;
	}
	//withdraw function
	public void withdraw(double Amount) {
		double balance=Balance;
		if(balance>0) {
			balance-=Amount;	
		}	
	}
	
	public SavingsAccount()
	{
		super();
		Balance=0;
		Name=null;
	}
	public static int getAccountNumber() {
		return AccountNumber;
	}
	public static void setAccountNumber() {
		AccountNumber+=1;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	
	
}
