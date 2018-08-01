package in.co.capgemini.test;

public abstract class CurrentAcc extends BankAcc {

	private float creditLimit;

	public CurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal);
		this.creditLimit = creditLimit;
	}

	@Override
	abstract public void withdraw(float money);

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ",toString()=" + super.toString() + "]";
	}

	public float getCreditLimit() {
		return creditLimit;
	}

}
