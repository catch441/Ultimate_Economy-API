package org.ue.common.logic.api;

import java.util.List;

import org.ue.general.GeneralEconomyException;

public interface GeneralValidationHandler {

	/**
	 * Check if a given string value is valid for a given enum value list.
	 * 
	 * @param <T>
	 * @param enumList
	 * @param value
	 * @throws GeneralEconomyException
	 */
	public <T extends Enum<T>> void checkForValidEnum(Enum<? extends T>[] enumList, String value)
			throws GeneralEconomyException;

	/**
	 * Check if the slot is inside the size range.
	 * 
	 * @param slot
	 * @param size subtract the reserved slots from the size before calling this
	 *             method
	 * @throws GeneralEconomyException
	 */
	public void checkForValidSlot(int slot, int size) throws GeneralEconomyException;

	/**
	 * Check if the value is a multiple of 9 and not greater then 54 and not smaller
	 * then 9.
	 * 
	 * @param size
	 * @throws GeneralEconomyException
	 */
	public void checkForValidSize(int size) throws GeneralEconomyException;

	/**
	 * Check if the value is >= 0.
	 * 
	 * @param value
	 * @throws GeneralEconomyException
	 */
	public void checkForPositiveValue(double value) throws GeneralEconomyException;

	/**
	 * Check if value is > 0.
	 * 
	 * @param value
	 * @throws GeneralEconomyException
	 */
	public void checkForValueGreaterZero(double value) throws GeneralEconomyException;

	/**
	 * Check if the value is not in the list.
	 * 
	 * @param <T>
	 * @param list
	 * @param value
	 * @throws GeneralEconomyException
	 */
	public <T> void checkForValueNotInList(List<T> list, T value) throws GeneralEconomyException;

	/**
	 * Check for value is in list.
	 * 
	 * @param list
	 * @param value
	 * @throws GeneralEconomyException
	 */
	public <T> void checkForValueInList(List<T> list, T value) throws GeneralEconomyException;

	/**
	 * Check for value exists. Throws a {@link GeneralEconomyException} with the
	 * name as exception parameter if the value is null.
	 * 
	 * @param value
	 * @param name
	 * @throws GeneralEconomyException
	 */
	public void checkForValueExists(Object value, String name) throws GeneralEconomyException;
}
