package bankAccount;

import java.math.BigDecimal;

/**
* Java Course 3 Module 2
*
* @author Justine Kaye Mojica
* @Description: Java program that handles bank account balances for an array of bank accounts. 
* Created Date: 5/31/2022
*
*/

public abstract class BankAccount {
	
	protected BigDecimal balance = BigDecimal.ZERO;
	
	//This deposit method increases the balance amount with the given deposit amount.
	public void deposit(double depAmt) {
		balance = balance.add(new BigDecimal(depAmt));
		balanceChecker();
	}
	
	//This withdraw method decreases the amount balance by the given withdrawal amount.
	public void withdraw(double withdrawAmt) {
		balance = balance.subtract(new BigDecimal(withdrawAmt));
		balanceChecker();
	}
	
	//Abstract display method.
	abstract BankAccount display();
	
	// This method sets the Balance amount to zero whenever the balance is in negative value.
	protected void balanceChecker() {
		if (balance.compareTo(BigDecimal.ZERO) < 0) {
			balance = BigDecimal.ZERO.setScale(2);
		}
	}

}
