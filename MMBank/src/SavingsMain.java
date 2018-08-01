import java.util.Scanner;

public class SavingsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SavingsAccount Savingacc = new SavingsAccount();
		Savingacc.setAccountNumber();

		int accno;
		System.out.println("Enter the Name");
		String name = sc.nextLine();
		Savingacc.setName(name);
		// enter the initial amount to be deposited
		System.out.println("Enter the initial deposit in account");
		double balance = sc.nextDouble();
		Savingacc.setBalance(balance);
		// choose either deposit or withdraw
		System.out.println("Enter 1.deposit 2.withdraw");
		int state = sc.nextInt();
		// deposit
		if (state == 1) {
			System.out.println("Enter the amount to be deposited");
			balance = sc.nextDouble();
			Savingacc.deposit(balance);
		}
		// withdraw
		else if (state == 2) {
			System.out.println("Enter the amount to withdraw");
			balance = sc.nextDouble();
			Savingacc.withdraw(balance);
		}

		System.out.println("enter the account number");
		accno = sc.nextInt();
		// print account details
		if (accno == Savingacc.getAccountNumber()) {
			System.out.println("Account details are");
			System.out.println("Account number:" + Savingacc.getAccountNumber());
			System.out.println("Account holder name:" + Savingacc.getName());
			System.out.println("Account balance:" + Savingacc.getBalance());

		}
	}

}
