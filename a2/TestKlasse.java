package main.java.a2;

public class TestKlasse {

	public static void main(String[] args) throws IllegalWithdrawException, CashMachineException {
		
		Account<? extends Currency>[] accountList = new Account<?>[10];
		AccountDetails accountDetail1 = new AccountDetails("Konto1", "Bank1");

		accountList[0] = new Account<Dollar>(accountDetail1, 100, 200, new Dollar(1.14, "USD"),123);
		accountList[1] = new Account<Euro>(accountDetail1, 100, 200, new Euro(1.14, "EUR"),123);
		
		CashMachine machine = new CashMachine(accountList);
		CashCard card = new CashCard(accountDetail1);
		
		machine.insertCashCard(card);
		machine.enterPin(12);
		machine.enterPin(12);
		machine.enterPin(123);
		System.out.println("Vor dem Aufruf der Methode war der Kontostand: " + accountList[0].getBankDeposit());
		// accountList[0].withdraw(50);
		
		machine.withdraw(50);
		machine.accountStatement();

	}

}
