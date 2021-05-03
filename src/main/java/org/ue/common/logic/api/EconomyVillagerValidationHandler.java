package org.ue.common.logic.api;

import java.util.Set;

import org.bukkit.inventory.Inventory;

public interface EconomyVillagerValidationHandler<T extends GeneralEconomyException> extends GeneralValidationHandler<T> {

	/**
	 * Check for resize is possible.
	 * 
	 * @param inventory
	 * @param oldSize
	 * @param newSize
	 * @param reservedSlots
	 * @throws <T>
	 */
	public void checkForResizePossible(Inventory inventory, int oldSize, int newSize, int reservedSlots)
			throws T;
	
	/**
	 * Check for slot is empty.
	 * 
	 * @param occupiedSlots
	 * @param slot
	 * @throws <T>
	 */
	public void checkForSlotIsEmpty(Set<Integer> occupiedSlots, int slot) throws T;

	/**
	 * Check for slot is not empty.
	 * 
	 * @param occupiedSlots
	 * @param slot
	 * @throws <T>
	 */
	public void checkForSlotIsNotEmpty(Set<Integer> occupiedSlots, int slot) throws T;
}
