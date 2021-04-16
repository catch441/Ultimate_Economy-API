package org.ue.common.logic.api;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager.Profession;
import org.bukkit.inventory.Inventory;
import org.ue.economyplayer.logic.EconomyPlayerException;
import org.ue.general.GeneralEconomyException;
import org.ue.shopsystem.logic.ShopSystemException;
import org.ue.townsystem.logic.TownSystemException;

public interface EconomyVillager {

	/**
	 * Change the profession of the villager.
	 * 
	 * @param professtion
	 */
	public void changeProfession(Profession professtion);

	/**
	 * Change the location of the villager.
	 * 
	 * @param location
	 * @throws TownSystemException
	 * @throws EconomyPlayerException
	 */
	public void changeLocation(Location location) throws EconomyPlayerException, TownSystemException;

	/**
	 * Returns the location of the villager.
	 * 
	 * @return location
	 * @throws EconomyPlayerException
	 * @throws TownSystemException
	 */
	public Location getLocation() throws EconomyPlayerException, TownSystemException;

	/**
	 * Returns the size of the inventory.
	 * 
	 * @return inventory size
	 */
	public int getSize();

	/**
	 * Despawns the villager.
	 */
	public void despawn();

	/**
	 * Change the size of the inventory;
	 * 
	 * @param newSize
	 * @throws GeneralEconomyException
	 * @throws ShopSystemException
	 */
	public void changeSize(int newSize) throws ShopSystemException, GeneralEconomyException;

	/**
	 * Opens the inventory for the given player.
	 * 
	 * @param player
	 * @throws ShopSystemException
	 */
	public void openInventory(Player player) throws ShopSystemException;

	/**
	 * Creates a inventory with the villager as owning entity.
	 * 
	 * @param size
	 * @param title
	 * @return inventory
	 */
	public Inventory createVillagerInventory(int size, String title);
}
