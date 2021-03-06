package org.ue.config.logic.api;

import java.util.Locale;

public interface ConfigManager {

	/**
	 * Setup all configuration parameters of UltimateEconomy.
	 */
	public void setupConfig();

	/**
	 * Sets the allow quickshop value.
	 * 
	 * @param value
	 */
	public void setAllowQuickshop(boolean value);

	/**
	 * Returns the allow quickshop value.
	 * 
	 * @return value
	 */
	public boolean isAllowQuickshop();

	/**
	 * Sets the start amount value.
	 * 
	 * @param amount
	 * @throws ConfigException 
	 */
	public void setStartAmount(double amount) throws ConfigException;

	/**
	 * Returns the start amount.
	 * 
	 * @return amount
	 */
	public double getStartAmount();

	/**
	 * This method sets the extended town interaction configuration.
	 * 
	 * @param value
	 */
	public void setExtendedInteraction(boolean value);

	/**
	 * Returns the extended town interaction configuration.
	 * 
	 * @return boolean
	 */
	public boolean isExtendedInteraction();

	/**
	 * This method enables/disables the wilderness interaction.
	 * 
	 * @param value
	 */
	public void setWildernessInteraction(boolean value);

	/**
	 * Returns true, if the wilderness is enabled.
	 * 
	 * @return boolean
	 */
	public boolean isWildernessInteraction();

	/**
	 * This method sets the maxRentedDays value.
	 * 
	 * @param days
	 * @throws ConfigException 
	 */
	public void setMaxRentedDays(int days) throws ConfigException;

	/**
	 * Returns the max rented days.
	 * 
	 * @return int
	 */
	public int getMaxRentedDays();

	/**
	 * This method sets the maxPlayershops per player value.
	 * 
	 * @param value
	 * @throws ConfigException 
	 */
	public void setMaxPlayershops(int value) throws ConfigException;

	/**
	 * Returns the maxPlayershops per player value.
	 * 
	 * @return int
	 */
	public int getMaxPlayershops();

	/**
	 * This method sets the maxHomes value.
	 * 
	 * @param value
	 * @throws ConfigException 
	 */
	public void setMaxHomes(int value) throws ConfigException;

	/**
	 * Returns the max homes configuration.
	 * 
	 * @return int
	 */
	public int getMaxHomes();

	/**
	 * This method sets the maxJobs value.
	 * 
	 * @param value
	 * @throws ConfigException 
	 */
	public void setMaxJobs(int value) throws ConfigException;

	/**
	 * Returns the max jobs configuration.
	 * 
	 * @return int
	 */
	public int getMaxJobs();

	/**
	 * This method sets the maxJoinedTowns value.
	 * 
	 * @param value
	 * @throws ConfigException 
	 */
	public void setMaxJoinedTowns(int value) throws ConfigException;

	/**
	 * Returns the max joined towns configuration.
	 * 
	 * @return int
	 */
	public int getMaxJoinedTowns();

	/**
	 * Enables/disables the home system.
	 * 
	 * @param value
	 */
	public void setHomeSystem(boolean value);

	/**
	 * Returns true, if the home system is enabled.
	 * 
	 * @return boolean
	 */
	public boolean isHomeSystem();

	/**
	 * Returns the currency text plural.
	 * 
	 * @return String
	 */
	public String getCurrencyPl();

	/**
	 * Set the curreny text plural.
	 * 
	 * @param value
	 */
	public void setCurrencyPl(String value);

	/**
	 * Returns the currency text singular.
	 * 
	 * @return String
	 */
	public String getCurrencySg();

	/**
	 * Set the currency text singular.
	 * 
	 * @param value
	 */
	public void setCurrencySg(String value);

	/**
	 * Returns the singular for amount = 1 and plural for != 1.
	 * 
	 * @param value money amount
	 * @return currency text
	 */
	public String getCurrencyText(double value);

	/**
	 * Returns the actual locale.
	 * 
	 * @return locale
	 */
	public Locale getLocale();

	/**
	 * Sets the current locale.
	 * 
	 * @param language
	 * @param country
	 * @throws ConfigException
	 */
	public void setLocale(String language, String country) throws ConfigException;
}
