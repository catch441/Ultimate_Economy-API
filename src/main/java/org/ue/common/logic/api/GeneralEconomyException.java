package org.ue.common.logic.api;

import org.ue.common.utils.api.MessageWrapper;

public abstract class GeneralEconomyException extends Exception {

	private static final long serialVersionUID = 1L;
	private final MessageWrapper messageWrapper;
	
	private ExceptionMessageEnum key;
	private Object[] params;
	
	/**
	 * Default constructor.
	 * @param key
	 * @param params
	 * @param messageWrapper
	 */
	public GeneralEconomyException(MessageWrapper messageWrapper, ExceptionMessageEnum key, Object... params) {
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
	 * Returns the message key.
	 * @return key
	 */
	public ExceptionMessageEnum getKey() {
		return key;
	}
	
	/**
	 * Returns the params.
	 * @return object array
	 */
	public Object[] getParams() {
		return params;
	}
}
