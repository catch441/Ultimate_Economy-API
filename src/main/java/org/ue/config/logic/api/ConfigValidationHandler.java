package org.ue.config.logic.api;

import org.ue.common.logic.api.GeneralValidationHandler;

public interface ConfigValidationHandler extends GeneralValidationHandler<ConfigException> {

	/**
	 * Check for supported language.
	 * 
	 * @param language
	 * @throws ConfigException
	 */
	public void checkForSupportedLanguage(String language) throws ConfigException;

	/**
	 * Check for matching country.
	 * 
	 * @param lang
	 * @param country
	 * @throws ConfigException
	 */
	public void checkForCountryMatching(String lang, String country) throws ConfigException;

}
