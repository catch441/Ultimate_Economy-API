package org.ue.common.logic.api;

import java.util.List;

public abstract interface GeneralValidator<T extends GeneralEconomyException> {

	/**
	 * Check if a given string value is valid for a given enum value list.
	 * 
	 * @param <S>
	 * @param enumList
	 * @param value
	 * @throws GeneralEconomyException
	 */
	public <S extends Enum<S>> void checkForValidEnum(Enum<? extends S>[] enumList, String value) throws T;

	/**
	 * Check for not reached the maximum.
	 * 
	 * @param reachedMax
	 * @throws T
	 */
	public void checkForNotReachedMax(boolean reachedMax) throws T;

	/**
	 * Check if the slot is inside the size range.
	 * 
	 * @param slot
	 * @param size subtract the reserved slots from the size before calling this
	 *             method
	 * @throws <T>
	 */
	public void checkForValidSlot(int slot, int size) throws T;

	/**
	 * Check if the value is a multiple of 9 and not greater then 54 and not smaller
	 * then 9.
	 * 
	 * @param size
	 * @throws <T>
	 */
	public void checkForValidSize(int size) throws T;

	/**
	 * Check if the value is >= 0 and != null.
	 * 
	 * @param value
	 * @throws <T>
	 */
	public void checkForPositiveValue(Double value) throws T;

	/**
	 * Check if value is > 0.
	 * 
	 * @param value
	 * @throws <T>
	 */
	public void checkForValueGreaterZero(double value) throws T;

	/**
	 * Check if the value is not in the list.
	 * 
	 * @param <S>
	 * @param list
	 * @param value
	 * @throws <T>
	 */
	public <S> void checkForValueNotInList(List<S> list, S value) throws T;

	/**
	 * Check for value is in list.
	 * 
	 * @param <S>
	 * @param list
	 * @param value
	 * @throws <T>
	 */
	public <S> void checkForValueInList(List<S> list, S value) throws T;

	/**
	 * Check for value exists. Throws a {@link GeneralEconomyException} with the
	 * name as exception parameter if the value is null.
	 * 
	 * @param value
	 * @param name
	 * @throws <T>
	 */
	public void checkForValueExists(Object value, String name) throws T;
}
