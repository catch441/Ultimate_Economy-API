package org.ue.bank.logic.api;

import org.ue.common.logic.api.GeneralValidationHandler;
import org.ue.general.GeneralEconomyException;

public interface BankValidationHandler extends GeneralValidationHandler {

	/**
	 * Checks for bank account has enough money to reduce.
	 * 
	 * @param bankAmount
	 * @param redAmount
	 * @throws GeneralEconomyException
	 */
	public void checkForHasEnoughMoney(double bankAmount, double redAmount) throws GeneralEconomyException;
}
