package org.ue.economyvillager.logic.api;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.ue.common.logic.api.GeneralEconomyException;

public interface EconomyVillagerCustomizeHandler<T extends GeneralEconomyException> {

	/**
	 * Opens the customizer GUI.
	 * 
	 * @param player
	 */
	public void openCustomizer(Player player);

	/**
	 * Handles a customize inventory GUI click.
	 * 
	 * @param event
	 */
	public void handleCustomizeInventoryClick(InventoryClickEvent event);
}
