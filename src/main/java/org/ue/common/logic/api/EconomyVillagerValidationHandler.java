package org.ue.common.logic.api;

import org.bukkit.inventory.Inventory;
import org.ue.economyplayer.logic.EconomyPlayerException;
import org.ue.general.GeneralEconomyException;
import org.ue.shopsystem.logic.ShopSystemException;

public interface EconomyVillagerValidationHandler extends GeneralValidationHandler {

	/**
	 * Checks if a slot in a given inventory is empty.
	 * 
	 * @param inventory
	 * @param slot
	 * @throws EconomyPlayerException if slot is occupied
	 */
	public void checkForSlotIsEmpty(Inventory inventory, int slot) throws EconomyPlayerException;
	
	/**
	 * Check for slot is not empty.
	 * 
	 * @param slot
	 * @param inventory
	 * @throws EconomyPlayerException
	 */
	public void checkForSlotIsNotEmpty(int slot, Inventory inventory)
			throws EconomyPlayerException;

	/**
	 * Check for resize is possible.
	 * 
	 * @param inventory
	 * @param oldSize
	 * @param newSize
	 * @param reservedSlots
	 * @throws ShopSystemException
	 * @throws GeneralEconomyException
	 */
	public void checkForResizePossible(Inventory inventory, int oldSize, int newSize, int reservedSlots)
			throws ShopSystemException, GeneralEconomyException;
}
