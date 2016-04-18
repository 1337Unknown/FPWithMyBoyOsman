package main.java.a2;

public class Account<T extends Currency> {

	private AccountDetails details;
	private double overdraft;
	private double bankDeposit;
	private T currency;
	private final int pin;
	
	public Account(AccountDetails details, double overdraft, double bankDeposit, T currency, int pin)
	{
		this.details = details;
		this.bankDeposit = bankDeposit;
		this.overdraft = overdraft;
		this.currency = currency;
		this.pin = pin;
	}
	
	public void withdraw(double amount) throws IllegalWithdrawException
	{
		if(currency.convertToEuro(bankDeposit + overdraft) < amount)
		{
			throw new IllegalWithdrawException("Account wurde überzogen. Abgehobene Summe ist zu hoch.");
		}
		else
		{
			bankDeposit = bankDeposit - currency.convertFromEuro(amount);
			System.out.println("Das neue Guthaben beträgt: " + bankDeposit);
		}
	}
	
	// Getter setter area
	public double getOverdraft() {
		return overdraft;
	}

	public T getCurrency() {
		return currency;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	public double getBankDeposit() {
		return bankDeposit;
	}

	public void setBankDeposit(double bankDeposit) {
		this.bankDeposit = bankDeposit;
	}

	public AccountDetails getDetails()
	{
		return details;
	}
	
	public int getPin() {
		return pin;
	}
}

