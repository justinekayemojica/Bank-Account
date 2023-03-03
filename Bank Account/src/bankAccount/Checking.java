package bankAccount;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
* Java Course 3 Module 2
*
* @author Justine Kaye Mojica
* @Description: Java program that extends BankAccount class. This Checking class implements the checking type of bank account.
* Created Date: 5/31/2022
* 
*/

public class Checking extends BankAccount {
	
	
	//This checking method initializes the balance amount for checking account 
	public Checking(double Balance) {
		balance = new BigDecimal(Balance);
		balanceChecker();
	}
	
	//This writeACheck method decreases the balance amount with the given check amount with $1 transaction fee
	public void writeACheck(double checkAmt) {
		balance = balance.subtract(new BigDecimal(checkAmt)).subtract(BigDecimal.ONE);
		balanceChecker();
	}
	
	//This display method prints the account type and the current balance.
	@Override
	BankAccount display() {
		//sets the formatter number format with the locale currency of the jre, if the locale sets to US this will return $ currency
        NumberFormat formatter = NumberFormat.getCurrencyInstance(); 
        String balanceStr = formatter.format(balance);
        System.out.println(getClass().getSimpleName() + " account balance = " + balanceStr);
		return this;
	}

}
