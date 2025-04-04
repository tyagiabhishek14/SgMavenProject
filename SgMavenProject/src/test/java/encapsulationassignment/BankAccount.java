package encapsulationassignment;

public class BankAccount {

	/**
	 * Objective: The objective of this assignment is to create a class that uses
	 * encapsulation to hide its implementation details and provide a simple
	 * interface for clients. Instructions: Create a class called "BankAccount" with
	 * the following private attributes: accountNumber (String), balance (double),
	 * and owner (String). Create getter and setter methods for each attribute.
	 * Write a method called "deposit" that takes a double parameter and adds it to
	 * the balance. Write a method called "withdraw" that takes a double parameter
	 * and subtracts it from the balance. Write a method called "printStatement"
	 * that prints out the account number, owner name, and balance. Create an
	 * instance of the "BankAccount" class and set its attributes using the setter
	 * methods. Call the "deposit" and "withdraw" methods to modify the balance of
	 * the account. Call the "printStatement" method to verify that the data was set
	 * correctly.
	 */
	private String accountNumber;
	private double balance = 0;
	private String owner;

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double deposit(double creditAmount) {

		return balance = balance + creditAmount;

	}

	public double widthdraw(double debitAmount) {
		return balance = balance - debitAmount;

	}

	public void printStatement() {
		System.out.println("The bank account number = " + accountNumber);
		System.out.println("The balance is " + balance);
		System.out.println("The bank account owner name is " + owner);
	}

}
