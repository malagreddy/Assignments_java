package in.co.capgemini.test;

public class MMASavingAccount {
	// instance members
	private int accountID;
	private String accountholder_Name;
	private int account_Balance;
	private boolean SalaryAccount;

	public MMASavingAccount(int accountID, String accountholder_Name, int account_Balance, boolean SalaryAccount) {
		super();
		this.accountID = accountID;
		this.accountholder_Name = accountholder_Name;
		this.account_Balance = account_Balance;
		this.SalaryAccount = SalaryAccount;
	}

	// getters for all the instance members
	public int getAccountID() {
		return accountID;
	}

	public String getAccountholder_Name() {
		return accountholder_Name;
	}

	public int getAccount_Balance() {
		return account_Balance;
	}

	public boolean isSalaryAccount() {
		return SalaryAccount;
	}

	@Override
	public String toString() {
		return "MMASavingAccount [accountID=" + accountID + ", accountholder_Name=" + accountholder_Name
				+ ", account_Balance=" + account_Balance + ", isSalaryAccount=" + SalaryAccount + "]";
	}

}
