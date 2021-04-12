package org.ue.common.utils.api;

import java.util.Locale;

public interface MessageWrapper {

	/**
	 * Load the language from the config.
	 * @param locale
	 */
	public void loadLanguage(Locale locale);
	
	/**
	 * Returns a error message with the chatcolor red.
	 * 
	 * @param key
	 * @return message
	 */
	public String getErrorString(String key);
	
	/**
	 * Returns a error message with the chatcolor red.
	 * 
	 * @param key
	 * @param params
	 * @return message
	 */
	public String getErrorString(String key, Object... params);
	
	/**
	 * Returns a message with chatcolor gold.
	 * 
	 * @param key
	 * @return messgage
	 */
	public String getString(String key);
	
	/**
	 * Returns a message with chatcolor gold and green.
	 * 
	 * @param key
	 * @param params
	 * @return message
	 */
	public String getString(String key, Object... params);
}
