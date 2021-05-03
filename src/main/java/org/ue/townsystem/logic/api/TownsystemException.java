package org.ue.townsystem.logic.api;

import org.ue.common.logic.api.ExceptionMessageEnum;
import org.ue.common.logic.api.GeneralEconomyException;
import org.ue.common.utils.api.MessageWrapper;

public class TownsystemException extends GeneralEconomyException {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Default constructor.
	 * 
	 * @param key
	 * @param params
	 * @param messageWrapper
	 */
	public TownsystemException(MessageWrapper messageWrapper, ExceptionMessageEnum key, Object... params) {
		super(messageWrapper, key, params);
	}
}
