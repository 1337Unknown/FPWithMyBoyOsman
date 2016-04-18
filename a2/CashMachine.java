package main.java.a2;

import main.java.a2.Account;
import main.java.a2.CashCard;
import main.java.a2.CashMachineException;
import main.java.a2.State;

public class CashMachine {

	private Account[] accountList = new Account[10];
	private CashCard cashCard;
	private Account selectedAccount;
	private State state;
	private int pinSecurity;

	public CashMachine(Account[] accountList) 
	{
		this.accountList = accountList;
		state = State.READY;
	}
	
	public void insertCashCard(CashCard cashCard) throws CashMachineException
	{
		switch (state)
		{
			case CARD_INSERTED:
			case PIN_WRONG:
			case PIN_CORRECT:
				throw new CashMachineException("Cash Machine is not ready for this operation.");
			case READY:
				
				if(checkAndSelectAccount(cashCard))
				{
					this.cashCard = cashCard;
				}
				else
				{
					throw new CashMachineException("Account is not available at this machine.");
				}

				state = State.CARD_INSERTED;
				System.out.println("New status is: " + state);
				pinSecurity = 0;
				break;
			default:
				throw new CashMachineException("Cash Machine does not support this state.");
		
		}
	}
	
	private boolean checkAndSelectAccount(CashCard cashCard)
	{
		for(Account acc : accountList)
		{
			if(acc != null && acc.getDetails().equals(cashCard.getDetails()))
			{
				selectedAccount = acc;
				return true;
			}
			
		}
		return false;
	}
	
	public void withdraw(int amount) throws CashMachineException
	{
		switch (state)
		{
		case CARD_INSERTED:
		case READY:
		case PIN_WRONG:
			throw new CashMachineException("Cash Machine is not ready for this operation.");
		case PIN_CORRECT:
			try 
			{
				selectedAccount.withdraw(amount);
			} catch (IllegalWithdrawException e) 
			{
				throw new CashMachineException("Cash Machine is not ready for this operation because: " + e.getMessage(), e);
			}
			break;
		default:
			break;
		
		}
	}
	
	public void accountStatement() throws CashMachineException
	{
		switch (state)
		{
		case CARD_INSERTED:
		case PIN_CORRECT:
		case PIN_WRONG:
			printStatement();
			break;
		case READY:
			throw new CashMachineException("Cash Machine is not ready for this operation.");
		default:
			break;
		
		}
	}
	
	private void printStatement()
	{
		System.out.println("Kontoinformationen");
		System.out.println("Kontonummer: " + selectedAccount.getDetails().getIban());
		System.out.println("Guthaben: " + selectedAccount.getBankDeposit() + " " + selectedAccount.getCurrency().getCurrencyCode());
		System.out.println("Dispokredit: " + selectedAccount.getOverdraft() + " " + selectedAccount.getCurrency().getCurrencyCode());
	}
	
	public void ejectCashCard() throws CashMachineException
	{
		switch (state)
		{
		case CARD_INSERTED:
		case PIN_CORRECT:
		case PIN_WRONG:
			eject();
			break;
		case READY:
			throw new CashMachineException("Cash Machine is not ready for this operation.");
		default:
			break;
		
		}
	}
	
	private void eject()
	{
		selectedAccount = null;
		cashCard = null;
		state = State.READY;
		System.out.println("New status is: " + state);
	}
	
	public void enterPin(int pin) throws CashMachineException
	{
		switch (state)
		{
		case CARD_INSERTED:
		case PIN_WRONG:
			enter(pin);
			break;
		case READY:
		case PIN_CORRECT:
			throw new CashMachineException("Cash Machine is not ready for this operation.");
		default:
			break;
		
		}
	}
	
	public void enter(int pin) throws CashMachineException
	{
		pinSecurity++;
		if(selectedAccount.getPin() == pin)
		{
			state = State.PIN_CORRECT;
			System.out.println("New status is: " + state);
		}
		else if(pinSecurity == 3)
		{
			ejectCashCard();
			cashCard = null;
			selectedAccount = null;
			state = State.READY;
			pinSecurity = 0;
			throw new CashMachineException("Pin three times false. Card was confiscated.");
			
		}
		else {
			state = State.PIN_WRONG;
			System.out.println("New status is: " + state);
		}
	}
	
	public State getState() {
		return state;
	}

	public CashCard getCashCard() {
		return cashCard;
	}

	public Account getSelectedAccount() {
		return selectedAccount;
	}
}