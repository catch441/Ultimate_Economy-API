package org.ue.shopsystem.logic.api;

import org.ue.common.logic.api.InventoryGuiHandler;

public interface ShopSlotEditorHandler extends InventoryGuiHandler {

	/**
	 * Setup a new slot editor.
	 * 
	 * @param shop
	 */
	public void setupSlotEditor(AbstractShop shop);

	/**
	 * Set the selected editor slot.
	 * 
	 * @param slot
	 */
	public void setSelectedSlot(int slot);

}
