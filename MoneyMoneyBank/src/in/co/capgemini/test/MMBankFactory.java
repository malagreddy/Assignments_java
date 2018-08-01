package in.co.capgemini.test;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingsAcc getNewSavingsAcc(int accNo, String accName, float accBal, boolean isSalaried) {
		SavingsAcc savingsAcc = new MMSavingsAcc(accNo, accName, accBal, isSalaried, isSalaried);
		return savingsAcc;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accName, float accBal, float CreditLimit) {
		CurrentAcc currentAcc = new MMCurrentAcc(accNo, accName, accBal, CreditLimit);
		return currentAcc;
	}

}
