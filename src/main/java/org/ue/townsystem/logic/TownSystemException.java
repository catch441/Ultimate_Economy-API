package org.ue.townsystem.logic;

import org.ue.common.utils.api.MessageWrapper;

public class TownSystemException extends Exception {

	private static final long serialVersionUID = 1L;
	private final MessageWrapper messageWrapper;
	
	private TownExceptionMessageEnum key;
	private Object[] params;

	/**
	 * Default constructor.
	 * @param key
	 * @param params
	 * @param messageWrapper
	 */
	public TownSystemException(MessageWrapper messageWrapper, TownExceptionMessageEnum key, Object... params) {
		super();
		this.key = key;
		this.params = params;
		this.messageWrapper = messageWrapper;
	}
	
	@Override
	public String getMessage() {
		return messageWrapper.getErrorString(key.getValue(), params);
	}
	
	/**
	 * Returns the params.
	 * @return object array
	 */
	public Object[] getParams() {
		return params;
	}
	
	/**
	 * Returns the message key.
	 * 
	 * @return key
	 */
	public TownExceptionMessageEnum getKey() {
		return key;
	}
}