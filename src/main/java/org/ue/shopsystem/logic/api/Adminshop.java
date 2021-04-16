package org.ue.shopsystem.logic.api;

import org.bukkit.Location;
import org.ue.economyplayer.logic.EconomyPlayerException;
import org.ue.general.GeneralEconomyException;

public interface Adminshop extends AbstractShop {
	
	/**
	 * Setup a new shop.
	 * 
	 * @param name
	 * @param shopId
	 * @param spawnLocation
	 * @param size
	 * @throws EconomyPlayerException
	 * @throws GeneralEconomyException
	 */
	public void setupNew(String name, String shopId, Location spawnLocation, int size)
			throws GeneralEconomyException, EconomyPlayerException;
}
