package bankAccount;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
* Java Course 3 Module 2
*
* @author Justine Kaye Mojica
* @Description: Java program that extends BankAccount class. This Savings class implements the savings type of bank account.
* Created Date: 5/31/2022
* 
*/

public class Savings extends BankAccount {
	
	private BigDecimal intRate;
	
	//This savings method initializes the balance amount and interest rate for the savings account account 
	public Savings (double Balance , double intRate) {
		balance = new BigDecimal(Balance);
		this.intRate = new BigDecimal(intRate);
		balanceChecker();
	}
	
	//This addInterest method increases the balance with the interest amount 
	public Savings addInterest() {
		balance = balance.add(intRate.multiply(balance));
		balanceChecker();
		return this;
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
