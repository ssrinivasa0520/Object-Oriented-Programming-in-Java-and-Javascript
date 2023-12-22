package Lab04;

public class BankAccount {

	private String firstName, lastName;
	private int accountNumber;
	private double balance = 0;
	
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	/**
	 * This function sets the first and last name of this object based on the given values for first and last
	 * @param first
	 * @param last
	 */
	public void setName(String first, String last)
	{
		this.firstName = first;
		this.lastName = last;
	}
	
	/**
	 * This function sets the account number based on the given value for accNo
	 * @param accNo
	 */
	public void setAccountNumber(int accNo)
	{
		this.accountNumber = accNo;
	}
	
	// TODO 



}
