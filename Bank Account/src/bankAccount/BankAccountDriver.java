package bankAccount;


/**
* Java Course 3 Module 2
*
* @author Justine Kaye Mojica
* @Description: This is a driver class of Bank Account program.
* Created Date: 5/31/2022
* 
*/

public class BankAccountDriver {

	public static void main(String[] args) {
		
		BankAccount[] accounts = new BankAccount[100];
		accounts[0] = new Savings(1100, .05); 
		accounts[0].deposit(100); 
		accounts[0].withdraw(200);
		((Savings) accounts[0]).addInterest();
		accounts[1] = new Checking(-100); 
		accounts[1].deposit(50);
		accounts[2] = new Checking(200); 
		accounts[2].withdraw(210); 
		accounts[2].deposit(100);
		((Checking) accounts[2]).writeACheck(50); 
		
		//loop to display array of Bank Accounts
		for (int i=0; i<accounts.length && accounts[i] != null; i++) accounts[i].display();


	}

}
