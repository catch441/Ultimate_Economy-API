package org.ue.common.utils.api;

import java.util.Locale;

import org.ue.common.logic.api.ExceptionMessageEnum;
import org.ue.common.logic.api.MessageEnum;

public interface MessageWrapper {

	/**
	 * Load the language from the config.
	 * @param locale
	 */
	public void loadLanguage(Locale locale);
	
	/**
	 * Returns the actual locale.
	 * @return locale
	 */
	public Locale getLocale();
	
	/**
	 * Returns a error message with the chatcolor red.
	 * 
	 * @param key
	 * @return message
	 */
	public String getErrorString(ExceptionMessageEnum key);
	
	/**
	 * Returns a error message with the chatcolor red.
	 * 
	 * @param key
	 * @param params
	 * @return message
	 */
	public String getErrorString(ExceptionMessageEnum key, Object... params);
	
	/**
	 * Returns a message with chatcolor gold.
	 * 
	 * @param key
	 * @return messgage
	 */
	public String getString(MessageEnum key);
	
	/**
	 * Returns a message with chatcolor gold and green.
	 * 
	 * @param key
	 * @param params
	 * @return message
	 */
	public String getString(MessageEnum key, Object... params);
}
