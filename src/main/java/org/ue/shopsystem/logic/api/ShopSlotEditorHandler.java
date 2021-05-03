package org.ue.shopsystem.logic.api;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public interface ShopSlotEditorHandler {

	/**
	 * Returns the slot editor inventory.
	 * 
	 * @return slot editor inventory
	 */
	public Inventory getSlotEditorInventory();
	
	/**
	 * Renames the slot editor inventory.
	 * 
	 * @param newName
	 */
	public void changeInventoryName(String newName);
	
	/**
	 * Set the selected editor slot.
	 * 
	 * @param slot
	 */
	public void setSelectedSlot(int slot);
	
	/**
	 * This method handles the SlotEditor for the InventoryClickEvent.
	 * 
	 * @param event
	 */
	public void handleSlotEditor(InventoryClickEvent event);
}
