package org.ue.shopsystem.logic.api;

import org.bukkit.Location;

public interface Adminshop extends AbstractShop {
	
	/**
	 * Setup a new shop.
	 * 
	 * @param name
	 * @param shopId
	 * @param spawnLocation
	 * @param size
	 */
	public void setupNew(String name, String shopId, Location spawnLocation, int size);
}
