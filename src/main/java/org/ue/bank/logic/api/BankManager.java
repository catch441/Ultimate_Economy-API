package org.ue.bank.logic.api;

import java.util.List;

public interface BankManager {

	/**
	 * Creats a new bank account with a given start amount.
	 * 
	 * @param startAmount
	 * @return bank account
	 */
	public BankAccount createBankAccount(double startAmount);

	/**
	 * Creats a new bank account with a given start amount and a external iban.
	 * 
	 * @param startAmount
	 * @param externalIban
	 * @return bank account
	 * @throws BankException
	 */
	public BankAccount createExternalBankAccount(double startAmount, String externalIban) throws BankException;

	/**
	 * Deletes a bank account.
	 * 
	 * @param account
	 */
	public void deleteBankAccount(BankAccount account);

	/**
	 * Loads all bank accounts.
	 * 
	 */
	public void loadBankAccounts();

	/**
	 * Returns a account by a given iban.
	 * 
	 * @param iban
	 * @return the bank account
	 * @throws BankException
	 */
	public BankAccount getBankAccountByIban(String iban) throws BankException;

	/**
	 * Returns a list of bank accounts.
	 * 
	 * @return list of bank accounts
	 */
	public List<BankAccount> getBankAccounts();

	/**
	 * Returns a list of all ibans.
	 * 
	 * @return list of strings
	 */
	public List<String> getIbanList();
}
