package org.ue.bank.logic.api;

import org.ue.common.logic.api.ExceptionMessageEnum;
import org.ue.common.logic.api.GeneralEconomyException;
import org.ue.common.utils.api.MessageWrapper;

public class BankException extends GeneralEconomyException {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 * @param key
	 * @param params
	 * @param messageWrapper
	 */
	public BankException(MessageWrapper messageWrapper, ExceptionMessageEnum key, Object... params) {
		super(messageWrapper, key, params);
	}
}
