package org.ue.bank.logic.api;

import org.ue.common.logic.api.GeneralValidationHandler;

public interface BankValidationHandler extends GeneralValidationHandler<BankException> {

	/**
	 * Checks for bank account has enough money to reduce.
	 * 
	 * @param bankAmount
	 * @param redAmount
	 * @throws BankException
	 */
	public void checkForHasEnoughMoney(double bankAmount, double redAmount) throws BankException;
}
