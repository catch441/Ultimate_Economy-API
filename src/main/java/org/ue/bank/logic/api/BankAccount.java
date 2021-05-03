package org.ue.bank.logic.api;

public interface BankAccount {

	/**
	 * Decrease the bank amount.
	 * 
	 * @param amount has to be positive
	 * @throws BankException 
	 */
	public void decreaseAmount(double amount) throws BankException;
	
	/**
	 * Increase the bank amount.
	 * 
	 * @param amount has to be positive
	 * @throws BankException 
	 */
	public void increaseAmount(double amount) throws BankException;
	
	/**
	 * Returns the bank amount.
	 * 
	 * @return bank amount
	 */
	public double getAmount();
	
	/**
	 * Returns the unique iban of this bank account.
	 * @return iban
	 */
	public String getIban();

	/**
	 * Returns true if the account has enough money.
	 * @param amount
	 * @return boolean
	 * @throws BankException 
	 */
	boolean hasAmount(double amount) throws BankException;
}
