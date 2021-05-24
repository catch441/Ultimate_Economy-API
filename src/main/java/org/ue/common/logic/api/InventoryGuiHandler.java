package org.ue.common.logic.api;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.Inventory;
import org.ue.economyplayer.logic.api.EconomyPlayer;

public abstract interface InventoryGuiHandler {

	/**
	 * Opens the GUI.
	 * 
	 * @param player
	 */
	public void openInventory(Player player);
	
	/**
	 * Returns the inventory. E.x. to add it as backlink to a other inventory GUI handler.
	 * @return inventory
	 */
	public Inventory getInventory();

	/**
	 * Handles a inventory GUI click.
	 * 
	 * @param clickType
	 * @param rawSlot
	 * @param whoClicked
	 */
	public void handleInventoryClick(ClickType clickType, int rawSlot, EconomyPlayer whoClicked);
}
