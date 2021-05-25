package org.ue.shopsystem.logic.api;

import org.ue.common.logic.api.InventoryGuiHandler;

public interface ShopEditorHandler extends InventoryGuiHandler {

	/**
	 * Setup a new editor inventory.
	 * 
	 * @param shop
	 * @param reservedSlots
	 */
	public void setup(AbstractShop shop, int reservedSlots);
	
	/**
	 * Set a slot as occupied or free.
	 * 
	 * @param occupied
	 * @param slot
	 */
	public void setOccupied(boolean occupied, int slot);
}
